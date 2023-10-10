/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samue
 */
public class Director extends Thread {

    private int dayDuration;
    private int stonks;
    private int stonksDLC;
    private String status = "Trabajando";
    private Drive drive;
    private Semaphore sema;
    private Company comp;
    private ProjectManager pm;
    private Random r = new Random();

    public Director(int dd, int s, int sd, Drive drive, Semaphore sem, Company comp, ProjectManager pm) {
        this.dayDuration = dd;
        this.stonks = s;
        this.stonksDLC = sd;
        this.drive = drive;
        this.sema = sem;
        this.comp = comp;
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            Work();
        }
    }

    public void Work() {
        try {
            if (comp.getDeadline() == 0) {

                sleep(dayDuration - 10);
                sema.acquire(1);
                int[] Tstonks = drive.ResetDeadline(stonks, stonksDLC);
                int Nstonks = Tstonks[0] + Tstonks[1];
                int sueldo = 24 * 30;
                comp.UpdateCosts(sueldo);
                comp.UpdateProfit(Nstonks);
                comp.UpdateEarnings();
                sema.release();

            } else {
                sema.acquire(1);
                int sueldo = 24 * 30;
                comp.UpdateCosts(sueldo);
                sema.release();
                int prob = r.nextInt(48);
                for (int i = 0; i < 48; i++) {
                    if (i == prob) {
                        setStatus("Revisando al Project Manager");
                        String caught = pm.getStatus();
                        if ("Viendo Streams".equals(caught)) {
                            int admonition = 50;
                            comp.UpdateProfit(admonition);
                            sleep(5 * (dayDuration) / 288);
                            setStatus("Trabajando");
                            sleep(dayDuration / 288);
                        }
                    } else {
                        setStatus("Trabajando");
                        sleep(dayDuration / 48);
                    }
                }
                //función de actualizar costes en interfaz gráfica//
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
