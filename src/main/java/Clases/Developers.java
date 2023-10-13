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
    private int sueldo;
    private float cumulo = 0;
    private float productPerDay;
    private Drive drive;
    private Semaphore sema;
    private Company comp;
    private InterfazCompany IC;

    public Developers(int type, int dd, int s, float pp, Drive drive, Semaphore sem, Company comp, InterfazCompany IC) {
        this.type = type;
        this.dayDuration = dd;
        this.sueldo = s;
        this.productPerDay = pp;
        this.drive = drive;
        this.sema = sem;
        this.comp = comp;
        this.IC=IC;
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
    int conto=1;
    public void Work() throws InterruptedException {
         sema.acquire(1);
        
        IC.setDay(conto);
         conto++;
         sema.release();
        
        int Nworkers = comp.getInits(type);
        System.out.println(Nworkers + "--:" + type);
        cumulo += productPerDay * Nworkers;

        if (cumulo >= 1) {
            try {
                float temp = cumulo % 1;
                int integer = (int) (cumulo - temp);
                sema.acquire(1);

                drive.addProduct(integer, type);
                cumulo = temp;
                comp.UpdateCosts(sueldo * Nworkers * 24);
                sema.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(Developers.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
//        System.out.println(drive.getNarrative() + "----" + drive.getLevels() + "--" + drive.getSprites() + "--" + drive.getLogic() + "--" + drive.getDLC() + "***" + drive.getGames() + "***" + drive.getGamesDLC());

    }

}
