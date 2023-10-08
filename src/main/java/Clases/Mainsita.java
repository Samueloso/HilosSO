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
        // Narrativa, Nivel, Sprites, Logica, cantidad antes del DLC, DLC
        int[] Capcom = {1, 2, 6, 5, 3, 1};
        int[] SquareEnix ={1, 1, 2, 4, 2, 3};
//        Backup B = new Backup();
        int dd = 0;
        int dl = 0;
        int[] init_developer1 = {1, 1, 1, 1, 1, 1};
        int[] init_developer2 = {1, 1, 1, 1, 1, 1};
        
        Drive drive1 = new Drive(0,0,0,0,0, 0 , 0);
        Company C0 = new Company(dd, dl, "algo", 19, 5f, 6f, 6f, 6f, drive1);
        Drive drive2 = new Drive(0,0,0,0,0, 0 , 0);
        Company C1 = new Company(dd, dl, "algo", 19, 5f, 6f, 6f, 6f, drive2);
       
        C0.Begin();
        C1.Begin();
        
        
        
    }
    
}
