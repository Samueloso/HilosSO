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
    private int[] sueldos = {10, 13, 20, 8, 17, 25};
    private Developers narrative;
    private Developers level;
    private Developers sprite;
    private Developers logic;
    private Developers dlc;
    private Developers integrator;
    private ProjectManager pm;
    private Director director;
    private Drive drive;
    private Semaphore sem = new Semaphore(1);
    private int[] inits;
    private int costs;
    private int profits;
    private int earnings;

    public Company(int dd, int dl, String name, int Nw, float nl, float s, float l, float d, Drive drive, int[] inits, int[] stonks) {
        this.dayduration = dd;
        this.deadline = dl;
        this.name = name;
        this.nworkers = Nw;
        this.inits = inits;
        this.narrative = new Developers(0, dd, sueldos[0], nl, drive, sem, this);
        this.level = new Developers(1, dd, sueldos[1], nl, drive, sem, this);
        this.sprite = new Developers(2, dd, sueldos[2], s, drive, sem, this);
        this.logic = new Developers(3, dd, sueldos[3], l, drive, sem, this);
        this.dlc = new Developers(4, dd, sueldos[4], d, drive, sem, this);
        this.integrator = new Developers(5, dd, sueldos[5], 0.5f, drive, sem, this);
        this.pm = new ProjectManager(dd, sem, this);
        this.director = new Director(dd, stonks[0], stonks[1], drive, sem, this, this.pm);
        this.drive = drive;
    }

    public void Begin() {
        this.narrative.start();
        this.level.start();
        this.sprite.start();
        this.logic.start();
        this.dlc.start();
        this.integrator.start();
        this.pm.start();
        this.director.start();
    }

    public void UpdateProfit(int num) {
        setProfits(getProfits() + num);
    }

    public void UpdateCosts(int num) {
        setCosts(getCosts() + num);
    }

    public void UpdateEarnings() {
        setEarnings(getEarnings() + getProfits() - getCosts());
        //función de actualizar ganancias en interfaz gráfica//
    }

    /**
     * @return the costs
     */
    public int getCosts() {
        return costs;
    }

    /**
     * @param costs the costs to set
     */
    public void setCosts(int costs) {
        this.costs = costs;
    }

    /**
     * @return the profits
     */
    public int getProfits() {
        return profits;
    }

    /**
     * @param profits the profits to set
     */
    public void setProfits(int profits) {
        this.profits = profits;
    }

    /**
     * @return the earnings
     */
    public int getEarnings() {
        return earnings;
    }

    /**
     * @param earnings the earnings to set
     */
    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }

    /**
     * @return the deadline
     */
    public int getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    /**
     * @param i
     * @return the inits
     */
    public int getInits(int i) {
        return inits[i];
    }

    /**
     * @param i the inits to set
     */
    public void setInits(int i) {
        this.inits[i] = inits[i];
    }
}
