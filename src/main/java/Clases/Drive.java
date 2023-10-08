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
    private int[] conditions;
    
    public Drive(int narrative, int levels, int sprites, int logic, int DLC, int games, int gamesDLC, int[] conditions){
        this.narrative = narrative;
        this.levels = levels;
        this.sprites = sprites;
        this.logic = logic;
        this.DLC = DLC ;
        this.games = games ;
        this.gamesDLC = gamesDLC ;
        this.conditions = conditions ;
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
    
    public int getGames(){
        return games; 
    }
    
    public void setGames(int games){
        this.games=games;
    }
    
    /**
     * @return the gamesDLC
     */
    public int getGamesDLC() {
        return gamesDLC;
    }

    /**
     * @param gamesDLC the gamesDLC to set
     */
    public void setGamesDLC(int gamesDLC) {
        this.gamesDLC = gamesDLC;
    }
            

    public void addProduct(int productCanti, int type){
        
        if(type==0){ //narrativa
            int numero=getNarrative();
            if (numero<25){
                setNarrative(getNarrative() + productCanti);
            }
            else{setNarrative(getNarrative());}
            
        }
        else if (type==1){ //niveles
            
            int niveles=getLevels();
            if(niveles<20){setLevels(getLevels()+productCanti);}
            else{setLevels(getLevels());}
            
        }
        else if (type==2){ //Sprites
            int esprai=getSprites();
            if(esprai<55){setSprites(getSprites()+productCanti);}
            else{setSprites(getSprites());}
            
        }
        
        
        else if (type==3){ //Logica
            int logica = getLogic();
            if (logica < 35){
            setLogic(getLogic()+productCanti);
            }
            else{setLogic(getLogic());}
            
        }
        else if (type==4){ //DLC developer
            int delece= getDLC();
            if (delece < 10){ setDLC(getDLC()+productCanti);}
            else{setDLC(getDLC());}
        }
        else if (type==5){ //Integrador 
            
            if(getNarrative()>=conditions[0] && getLevels()>=conditions[1] && getSprites()>=conditions[2] && getLogic()>=conditions[3]){
                
                if(getGames()%conditions[4]==0 && getGamesDLC()<(getGames()/conditions[4]) && getDLC()>=conditions[5] ){
                    setGamesDLC(getGamesDLC()+productCanti);
                    RestarProducto(0);
                   
                    System.out.println("SE CREO UN JUEGO CON DLC :000"+ productCanti);
                }
                else{
                
                setGames(getGames()+productCanti);
                RestarProducto(1);
                System.out.println("SE CREO UN JUEGO");
                }

            }

        }
        
    
    }
    
    public int RestarProducto( int t){
    
     if (t==1){    
    setNarrative(getNarrative() - conditions[0]);
    setLevels(getLevels()-conditions[1]);
    setSprites(getSprites()-conditions[2]);
    setLogic(getLogic()-conditions[3]);} 
     else{    
    setNarrative(getNarrative() - conditions[0]);
    setLevels(getLevels()-conditions[1]);
    setSprites(getSprites()-conditions[2]);
    setLogic(getLogic()-conditions[3]);
    setDLC(getDLC()-conditions[5]);}
        return 0;

    }


    
}
