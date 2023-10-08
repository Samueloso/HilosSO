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
        // TODO code application logic here
        Semaphore sema = new Semaphore(1);
        Drive drive = new Drive(0,0,0,0,0,0);
        Developers dev0 = new Developers(0,0.34f,drive,sema);
        Developers dev1 = new Developers(0,0.34f,drive,sema);
        
        
        dev0.start();
        dev1.start();
        
        
        
        
    }
    
}
