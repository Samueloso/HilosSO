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
    
    public int narrative;
    public int levels;
    public int sprites;
    public int logic;
    public int DLC; 
    
    public Drive(int narrative, int leves, int sprites, int logic, int DLC){
        this.narrative = narrative;
        this.levels = levels;
        this.sprites = sprites;
        this.logic = logic;
        this.DLC = DLC ;
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
            int numero=getNarrative();
            if (numero<12){
                setNarrative(getNarrative() + productCanti);
            }
            else{setNarrative(getNarrative());}
            
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
