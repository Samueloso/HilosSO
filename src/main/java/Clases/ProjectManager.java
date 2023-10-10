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
public class Director extends Thread {
    private int dayDuration;
    private int deadline;
    private int stonks;
    private int stonksDLC;
    private Drive drive;
    private Semaphore sema;

    public Director(int dd, int dl, int s, int sd, Drive drive, Semaphore sem) {
        this.dayDuration = dd;
        this.deadline = dl;
        this.stonks = s;
        this.stonksDLC = sd;
        this.drive = drive;
        this.sema = sem;
    }

    @Override
    public void run() {
        while (true) {
                Work();
        }
    }

    public void Work() {
        if (deadline == 0) {
            try {
                sleep(dayDuration-10);
                sema.acquire(1);
                int[] Tstonks = drive.ResetDeadline(stonks, stonksDLC);
                int Nstonks = Tstonks[0] + Tstonks[1];
                sema.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            
        }

        System.out.println(drive.getNarrative() + "----" + drive.getLevels() + "--" + drive.getSprites() + "--" + drive.getLogic() + "--" + drive.getDLC() + "***" + drive.getGames() + "***" + drive.getGamesDLC());

    }
}
