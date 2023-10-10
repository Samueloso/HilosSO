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
    private int dayDuration;
    private float cumulo = 0;
    private float productPerDay;
    private Drive drive;
    private int init;
    private Semaphore sema;

    public Developers(int type, int dd, float pp, Drive drive, Semaphore sem, int init) {
        this.type = type;
        this.dayDuration = dd;
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

        cumulo += productPerDay * getInit();

        if (cumulo >= 1) {
            try {
                float temp = cumulo % 1;
                int integer = (int) (cumulo - temp);
                sema.acquire(1);
                drive.addProduct(integer, type);
                cumulo = temp;
                sema.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(Developers.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println(drive.getNarrative() + "----" + drive.getLevels() + "--" + drive.getSprites() + "--" + drive.getLogic() + "--" + drive.getDLC() + "***" + drive.getGames() + "***" + drive.getGamesDLC());

    }

    /**
     * @return the init
     */
    public int getInit() {
        return init;
    }

    /**
     * @param init the init to set
     */
    public void setInit(int init) {
        this.init = init;
    }

}
