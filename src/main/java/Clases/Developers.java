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
    private Semaphore sema;
    
    
    public Developers(int type, int dd, float pp, Drive drive, Semaphore sem){
        this.type = type;
        this.dayDuration = dd;
        this.productPerDay = pp ;
        this.drive = drive;
        this.sema = sem;
       
    }
    
    
    @Override 
    public void run(){
       while(true){
        try {
            if (type == 5){
            WorkIntr();
            } else {
            Work();
            }
            sleep(dayDuration);
        } catch (InterruptedException ex) {
            Logger.getLogger(Developers.class.getName()).log(Level.SEVERE, null, ex);
        }
       }

} 
    public void Work(){
    
        this.cumulo += this.productPerDay;
        
        if (this.cumulo >= 1){
            try {
                
              this.sema.acquire(1);
               this.drive.addProduct( 1, type);
                this.cumulo = 0;
                this.sema.release();
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developers.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
        System.out.println(this.drive.getNarrative());
    
    }
    
    public void WorkIntr(){
        
        if (drive.getNarrative() == 1 && drive.getLevels() == 1 && drive.getSprites() == 1 && drive.getLogic() == 1 && DLC == 1){
        this.cumulo += this.productPerDay;
        
        if (this.cumulo >= 1){
            this.mutex.acquire(1);
            this.drive.addProduct( 1, type);
            this.cumulo = 0; 
            this.mutex.release();
        }
        
        System.out.println(this.drive.getNarrative());
        }
    }
    
        
}


