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
public class Drive {
    
    private int narrative;
    private int levels;
    private int sprites;
    private int logic;
    private int DLC; 
    private int games;
    private int gamesDLC;
    
    public Drive(int narrative, int levels, int sprites, int logic, int DLC, int games, int gamesDLC){
        this.narrative = narrative;
        this.levels = levels;
        this.sprites = sprites;
        this.logic = logic;
        this.DLC = DLC ;
        this.games = games ;
        this.gamesDLC = gamesDLC ;
    }
    
    public int getNarrative(){
        return narrative;
    }
    public void setNarrative(int narrative){
        this.narrative=narrative;
    }
    public int getLevels(){
        return levels;
    }
    public void setLevels(int levels){
        this.levels=levels;
            }
    public int getSprites(){
        return sprites;
    }
    public void setSprites(int sprites){
        this.sprites=sprites;
    }
    public int getLogic(){
        return logic;
    }
    public void setLogic(int logic){
        this.logic=logic;
    }
    public int getDLC(){
        return DLC;
    }
    public void setDLC(int DLC){
        this.DLC=DLC;
    }
    
    public void addProduct(int productCanti, int type){
        
        if(type==0){
            setNarrative(getNarrative() + productCanti);
        }
        else if (type==1){
            setLevels(getLevels()+productCanti);
        }
        else if (type==2){
            setSprites(getSprites()+productCanti);
        }
        else if (type==3){
            setLogic(getLogic()+productCanti);
        }
        else if (type==4){
            setDLC(getDLC()+productCanti);
        }
    
    }
            
    
}
