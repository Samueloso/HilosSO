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
    private Semaphore mutex;
    
    
    public Company(String name, int Nw, float nl, float s, float l, float d, Drive drive) {
        this.name = name;
        this.nworkers = Nw;
        this.narrative = new Developers(0,nl,drive);
        this.level = new Developers(1,nl,drive);
        this.sprite = new Developers(2,s,drive);
        this.logic = new Developers(3,l,drive);
        this.dlc = new Developers(4,d,drive);
        this.integrator = new Developers(5,0.5f,drive);
//        this.pm = 5;
//        this.manager = 5;
        this.drive = drive;
        this.mutex = new Semaphore(1);
    }
    
    public void Begin(){
        this.narrative.start();
        this.level.start();
        this.sprite.start();
        this.logic.start();
        this.dlc.start();
        this.integrator.start();
    }
}
