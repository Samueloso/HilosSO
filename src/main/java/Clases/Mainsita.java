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
        int[] SquareEnix = {1, 1, 2, 4, 2, 3};
//        Backup B = new Backup();
        int dd = 0;
        int dl = 0;
        int[] init_developer1 = {1, 1, 1, 1, 1, 1};
        int[] init_developer2 = {1, 1, 1, 1, 1, 1};

        Drive drive1 = new Drive(0, 0, 0, 0, 0, 0, 0, Capcom);
        Company C0 = new Company(dd, dl, "algo", 19, 5f, 6f, 6f, 6f, drive1, init_developer1);
        Drive drive2 = new Drive(0, 0, 0, 0, 0, 0, 0, SquareEnix);
        Company C1 = new Company(dd, dl, "algo", 19, 5f, 6f, 6f, 6f, drive2, init_developer2);

        C0.Begin();
        C1.Begin();

//        Semaphore sem = new Semaphore(1);
//        Drive drive = new Drive(0,0,0,0,0,0,0);
//        
//        Developers dev0=new Developers(0,0.34f,drive,sem);
//        Developers dev1=new Developers(1,0.34f,drive,sem);
//        Developers dev2=new Developers(2,2.0f,drive,sem);
//        Developers dev3=new Developers(3,3.0f,drive,sem);
//        Developers dev4=new Developers(4,0.5f,drive,sem);
//        Developers dev5=new Developers(5,0.5f,drive,sem);
//        
//        
//        
//        dev0.start();
//        dev1.start();
//        dev2.start();
//        dev3.start();
//        dev4.start();
//        dev5.start();
//       
    }

}
