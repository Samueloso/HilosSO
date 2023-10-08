/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Radenixlol
 */
public class Company {

    private int dayduration;
    private int deadline;
    private String name;
    private int nworkers;
    private Developers narrative;
    private Developers level;
    private Developers sprite;
    private Developers logic;
    private Developers dlc;
    private Developers integrator;
//    private int pm;
//    private int manager;
    private Drive drive;
    private Semaphore sem = new Semaphore(1);
    private int[] inits;

    public Company(int dd, int dl, String name, int Nw, float nl, float s, float l, float d, Drive drive, int[] inits) {
        this.dayduration = dd;
        this.deadline = dl;
        this.name = name;
        this.nworkers = Nw;
        this.inits = inits;
        this.narrative = new Developers(0, dd, nl, drive, sem, inits[0]);
        this.level = new Developers(1, dd, nl, drive, sem, inits[1]);
        this.sprite = new Developers(2, dd, s, drive, sem, inits[2]);
        this.logic = new Developers(3, dd, l, drive, sem, inits[3]);
        this.dlc = new Developers(4, dd, d, drive, sem, inits[4]);
        this.integrator = new Developers(5, dd, 0.5f, drive, sem, inits[5]);
//        this.pm = 5;
//        this.manager = 5;
        this.drive = drive;
    }

    public void Begin() {
        this.narrative.start();
        this.level.start();
        this.sprite.start();
        this.logic.start();
        this.dlc.start();
        this.integrator.start();
    }
}
