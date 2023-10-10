/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samue
 */
public class ProjectManager extends Thread {
    private int dayDuration;
    private String status = "Trabajando";
    private Semaphore sema;
    private Company comp;

    public ProjectManager(int dd, Semaphore sem, Company comp) {
        this.dayDuration = dd;
        this.sema = sem;
        this.comp = comp;
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
                int n = 24;
                Routine1();
                Routine2(n);
            } else {
                int n = 16;
                Routine1();
                Routine2(n);
                setStatus("Cambiando el contador");
                comp.setDeadline(comp.getDeadline() - 1);
                sleep(dayDuration / 3);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Routine1() {
        try {
            sema.acquire(1);
            int sueldo = 24 * 20;
            comp.UpdateCosts(sueldo);
            sema.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void Routine2(int n) {
        try {
            for (int i = 0; i < n; i++) {
                    setStatus("Trabajando");
                    sleep(dayDuration / 48);
                    setStatus("Viendo Streams");
                    sleep(dayDuration / 48);
                }
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
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
