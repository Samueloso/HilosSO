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
    private final int[] conditions;

    public Drive(int narrative, int levels, int sprites, int logic, int DLC, int games, int gamesDLC, int[] conditions) {
        this.narrative = narrative;
        this.levels = levels;
        this.sprites = sprites;
        this.logic = logic;
        this.DLC = DLC;
        this.games = games;
        this.gamesDLC = gamesDLC;
        this.conditions = conditions;
    }

    public int getNarrative() {
        return narrative;
    }

    public void setNarrative(int narrative) {
        this.narrative = narrative;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getSprites() {
        return sprites;
    }

    public void setSprites(int sprites) {
        this.sprites = sprites;
    }

    public int getLogic() {
        return logic;
    }

    public void setLogic(int logic) {
        this.logic = logic;
    }

    public int getDLC() {
        return DLC;
    }

    public void setDLC(int DLC) {
        this.DLC = DLC;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
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

    public void addProduct(int productCanti, int type) {

        switch (type) {
            case 0 -> {
                //narrativa
                int narrativa = getNarrative();
                int sum = narrativa + productCanti;
                if (sum <= 25) {
                    setNarrative(sum);
                } else {
                    if (narrativa < 25) {
                        int temp = sum - 25;
                        setNarrative(narrativa + temp);
                    } else {
                        setNarrative(narrativa);
                    }
                }
            }
            case 1 -> {
                //niveles

                int niveles = getLevels();
                int sum = niveles + productCanti;
                if (sum <= 20) {
                    setLevels(sum);
                } else {
                    if (niveles < 20) {
                        int temp = sum - 20;
                        setLevels(niveles + temp);
                    } else {
                        setLevels(niveles);
                    }
                }
            }
            case 2 -> {
                //Sprites
                int esprai = getSprites();
                int sum = esprai + productCanti;
                if (sum <= 55) {
                    setSprites(sum);
                } else {
                    if (esprai < 55) {
                        int temp = sum - 55;
                        setSprites(esprai + temp);
                    } else {
                        setSprites(esprai);
                    }
                }
            }
            case 3 -> {
                //Logica
                int logica = getLogic();
                int sum = logica + productCanti;
                if (sum <= 35) {
                    setLogic(sum);
                } else {
                    if (logica < 35) {
                        int temp = sum - 35;
                        setLogic(logica + temp);
                    } else {
                        setLogic(logica);
                    }
                }
            }
            case 4 -> {
                //DLC developer
                int delece = getDLC();
                int sum = delece + productCanti;
                if (sum <= 10) {
                    setDLC(sum);
                } else {
                    if (delece < 10) {
                        int temp = sum - 10;
                        setDLC(delece + temp);
                    } else {
                        setDLC(delece);
                    }
                }
            }
            case 5 -> {
                //Integrador
                if (getNarrative() >= conditions[0] && getLevels() >= conditions[1] && getSprites() >= conditions[2] && getLogic() >= conditions[3]) {
                    if (getGames() % conditions[4] == 0 && getGamesDLC() < (getGames() / conditions[4]) && getDLC() >= conditions[5]) {
                        setGamesDLC(getGamesDLC() + productCanti);
                        RestarProducto(0);
                        System.out.println("SE CREO UN JUEGO CON DLC :000" + productCanti);
                    } else {
                        setGames(getGames() + productCanti);
                        RestarProducto(1);
                        System.out.println("SE CREO UN JUEGO");
                    }
                }
            }
            default -> {
            }
        }
    }

    public void RestarProducto(int t) {

        if (t == 1) {
            setNarrative(getNarrative() - conditions[0]);
            setLevels(getLevels() - conditions[1]);
            setSprites(getSprites() - conditions[2]);
            setLogic(getLogic() - conditions[3]);
        } else {
            setNarrative(getNarrative() - conditions[0]);
            setLevels(getLevels() - conditions[1]);
            setSprites(getSprites() - conditions[2]);
            setLogic(getLogic() - conditions[3]);
            setDLC(getDLC() - conditions[5]);
        }
    }
    
    
    
}
