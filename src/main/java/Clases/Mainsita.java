/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
//        Backup B = new Backup();
        int dd1 = 0;
        int dl1 = 0;
        int[] init_developer1 = {1, 1, 1, 1, 1, 1};
        int dd2 = 0;
        int dl2 = 0;
        int[] init_developer2 = {1, 1, 1, 1, 1, 1};
        
        Drive drive1 = new Drive(0,0,0,0,0, 0 , 0);
        Company C0 = new Company("algo", 19, 5f, 6f, 6f, 6f, drive1);
        Drive drive2 = new Drive(0,0,0,0,0, 0 , 0);
        Company C1 = new Company("algo", 19, 5f, 6f, 6f, 6f, drive2);
       
        C0.Begin();
        C1.Begin();
        
        
        
    }
    
}
