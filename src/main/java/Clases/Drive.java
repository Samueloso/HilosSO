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
    
    private String owner;
    private int narrative;
    private int levels;
    private int sprites;
    private int logic;
    private int DLC;
    private int games;
    private int gamesDLC;
    private final int[] conditions;
    private InterfazCompany IC;
    
    
    public Drive(String owner, int narrative, int levels, int sprites, int logic, int DLC, int games, int gamesDLC, int[] conditions, InterfazCompany IC) {
        this.owner = owner;
        this.narrative = narrative;
        this.levels = levels;
        this.sprites = sprites;
        this.logic = logic;
        this.DLC = DLC;
        this.games = games;
        this.gamesDLC = gamesDLC;
        this.conditions = conditions;
        this.IC = IC;
    }

    public int getNarrative() {
        return narrative;
    }

    public void setNarrative(int narrative) {
        this.narrative = narrative;
        if ("Capcom".equals(owner)){
            IC.setNarrativaTexto(String.valueOf(narrative));
        } else {
            IC.setSQEGuionTexto(String.valueOf(narrative));
        }
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
        if ("Capcom".equals(owner)){
            IC.setNivelesTexto(String.valueOf(levels));
        } else {
            IC.setSQENivelTexto(String.valueOf(levels));
        }
    }

    public int getSprites() {
        return sprites;
    }

    public void setSprites(int sprites) {
        this.sprites = sprites;
        if ("Capcom".equals(owner)){
            IC.setSpriteTexto(String.valueOf(sprites));
        } else {
            IC.setSQESpriteTexto(String.valueOf(sprites));
        }
    }

    public int getLogic() {
        return logic;
    }

    public void setLogic(int logic) {
        this.logic = logic;
        if ("Capcom".equals(owner)){
            IC.setLogicoTexto(String.valueOf(logic));
        } else {
            IC.setSQELogicaTexto(String.valueOf(logic));
        }
    }

    public int getDLC() {
        return DLC;
    }

    public void setDLC(int DLC) {
        this.DLC = DLC;
        if ("Capcom".equals(owner)){
            IC.setDLCTexto(String.valueOf(DLC));
        } else {
            IC.setSQE_DLCTexto(String.valueOf(DLC));
        }
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
        if ("Capcom".equals(owner)){
            IC.setJuegosTexto(String.valueOf(games));
        } else {
            IC.setJuegosSQE(String.valueOf(games));
        }
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
        if ("Capcom".equals(owner)){
            IC.setJuegosDLCTexto(String.valueOf(gamesDLC));
        } else {
            IC.setJuegosDLC_SQE(String.valueOf(gamesDLC));
        }
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

    public int[] ResetDeadline(int stonks, int stonksDLC) {
        int units = getGames();
        int dlcunits = getGamesDLC();
        setGames(0);
        setGamesDLC(0);
        int[] Tstonks = {units * stonks * 1000, dlcunits * stonksDLC * 1000};
        return Tstonks;
    }

}
