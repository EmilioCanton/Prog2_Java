
package emilio_fernando_vitorio_prova3;

public class Tabuleiro {
    
    private final Espada[][] tabuleiro;
    
    public Tabuleiro(){
        tabuleiro = new Espada[13][13];
    }
    
    public Espada[][] getTabuleiro(){
        return tabuleiro;
    }  
}
