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
public class Developers extends Thread {

    private int type;
    private int dayDuration = 1000;
    private float cumulo = 0;
    private float productPerDay;
    private Drive drive;
    private int init;
    Semaphore sema;

    public Developers(int type, int dd, float pp, Drive drive, Semaphore sem, int init) {
        this.type = type;
        this.productPerDay = pp;
        this.drive = drive;
        this.sema = sem;
        this.init = init;
    }

    @Override
    public void run() {
        while (true) {
            try {

                Work();
                sleep(dayDuration);

            } catch (InterruptedException ex) {
                Logger.getLogger(Developers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void Work() {

        this.cumulo += this.productPerDay * this.init;

        if (this.cumulo >= 1) {
            try {
                float temp = this.cumulo % 1;
                int integer = (int) (this.cumulo - temp);
                this.sema.acquire(1);
                this.drive.addProduct(integer, type);
                this.cumulo = temp;
                this.sema.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(Developers.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println(this.drive.getNarrative() + "----" + this.drive.getLevels() + "--" + this.drive.getLogic() + "--" + this.drive.getSprites() + "--" + this.drive.getDLC() + "***" + this.drive.getGames() + "***" + this.drive.getGamesDLC());

    }

}
