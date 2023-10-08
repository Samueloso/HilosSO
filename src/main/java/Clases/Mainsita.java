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
        // Narrativa, Nivel, Sprites, Logica, cantidad antes del DLC, DLC
        int[] Capcom = {1, 2, 6, 5, 3, 1};
        int Nwork1 = 18;
        float[] ppCapcom = {0.25f, 1f, 5f, 0.50f};
        int[] SquareEnix = {1, 1, 2, 4, 2, 3};
        int Nwork2 = 13;
        float[] ppSquareEnix = {0.34f, 2f, 3f, 0.34f};
//        Backup B = new Backup();
        int dd = 1000;
        int dl = 0;
        int[] init_developer1 = {1, 1, 1, 1, 1, 1};
        int[] init_developer2 = {1, 1, 1, 1, 1, 1};

        Drive drive1 = new Drive(0, 0, 0, 0, 0, 0, 0, Capcom);
        Company C0 = new Company(dd, dl, "Capcom", Nwork1, ppCapcom[0], ppCapcom[1], ppCapcom[2], ppCapcom[3], drive1, init_developer1);
        Drive drive2 = new Drive(0, 0, 0, 0, 0, 0, 0, SquareEnix);
        Company C1 = new Company(dd, dl, "SquareEnix", Nwork2, ppSquareEnix[0], ppSquareEnix[1], ppSquareEnix[2], ppSquareEnix[3], drive2, init_developer2);

        C0.Begin();
        C1.Begin();
      
    }

}
