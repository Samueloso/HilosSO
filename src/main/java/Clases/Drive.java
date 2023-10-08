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
    
    public int getGame(){
        return games; 
    }
    
    public void setGame(int game){
        this.games=game;
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
            
            if(getNarrative()>1 && getLevels()>1 && getSprites()>1 && getLogic()> 1 && getDLC()>1 ){
                
                if(getGame()%4==0){
                    setGame(getGame()+productCanti);
                    RestarProducto(0);
                   
                    System.out.println("SE CREO UN JUEGO CON DLC :000"+ productCanti);
                }
                else{
                
                setGame(getGame()+productCanti);
                RestarProducto(1);
                System.out.println("SE CREO UN JUEGO");
                }

            }

        }
        
    
    }
    
    public int RestarProducto( int t){
    
     if (t==1){    setNarrative(getNarrative() - 1);
    setLevels(getLevels()-1);
    setSprites(getSprites()-1);
    setLogic(getLogic()-1);} 
     else{    
    setNarrative(getNarrative() - 1);
    setLevels(getLevels()-1);
    setSprites(getSprites()-1);
    setLogic(getLogic()-1);
    setDLC(getDLC()-1);}
        return 0;

    }


    
}
