/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.concurrent.Semaphore;

/**
 *
 * @author samue
 */
public class Mainsita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        Drive drive = new Drive(0,0,0,0,0,0,0);
        
        Developers dev0=new Developers(0,0.34f,drive,sem);
        Developers dev1=new Developers(1,0.34f,drive,sem);
        Developers dev2=new Developers(2,2.0f,drive,sem);
        Developers dev3=new Developers(3,3.0f,drive,sem);
        Developers dev4=new Developers(4,0.5f,drive,sem);
        Developers dev5=new Developers(5,0.5f,drive,sem);
        
        
        
        dev0.start();
        dev1.start();
        dev2.start();
        dev3.start();
        dev4.start();
        dev5.start();
       
               
        
        
    }
    
}
