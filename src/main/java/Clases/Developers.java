/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
    
    public Developers(int type, float pp, Drive drive){
        this.type = type;
        this.productPerDay = pp ;
        this.drive = drive;
       
    }
    
    
    @Override 
    public void run(){
       while(true){
        try {
            
            
            Work();
            sleep(dayDuration);
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Developers.class.getName()).log(Level.SEVERE, null, ex);
        }
       }

} 
    public void Work(){
    
        this.cumulo += this.productPerDay;
        
        if (this.cumulo >= 1){
            
            this.drive.addProduct( 1, type);
            this.cumulo = 0; 
            
            
        }
        
        System.out.println(this.drive.getNarrative());
    
    }
    
        
}


