
package emilio_fernando_vitorio_prova3;

import java.util.ArrayList;

public class Jogador {
    
    private final Tabuleiro meuTabuleiro;
    private final ArrayList<Jogada> minhasJogadas;
    private final Espada[] minhasEspadas;
    private int pontos = 0;
    
    public Jogador(){
        meuTabuleiro = new Tabuleiro();
        minhasJogadas = new ArrayList<>();
        minhasEspadas = new Espada[6];
    }
    
    public boolean defineLocal(int linha, int coluna, Espada espada){
        if(meuTabuleiro.getTabuleiro()[linha][coluna] != null){
            return true;
        }
        
        meuTabuleiro.getTabuleiro()[linha][coluna] = espada;
        
        return false;
    } 

    public void criaEspadas(){
        minhasEspadas[0] = new Espada("Espada de madeira", 5);
        minhasEspadas[1] = new Espada("Espada de alumínio", 10);
        minhasEspadas[2] = new Espada("Espada de gelo", 20);
        minhasEspadas[3] = new Espada("Espada de platina", 30);
        minhasEspadas[4] = new Espada("Espada de bronze", 40);
        minhasEspadas[5] = new Espada("Espada de ouro", 50);
    }
    
    public Espada verificaJogada(Jogada jogada){
        Espada aux;
        aux = meuTabuleiro.getTabuleiro()[jogada.getLinha()][jogada.getColuna()];
        if(aux != null){
            return aux;
        }
        return null;
    }
    
    public int getPontos(){
        return pontos;
    }
    
    public void setPontos(Espada espada){
        pontos += espada.getValor();
    }
    
    public Espada[] getEspadas(){
        return minhasEspadas;
    }
    
    public Tabuleiro getMeuTabuleiro(){
        return meuTabuleiro;
    }
    
    public boolean verificaRepeticao(Jogada jogada){
        
        for(Jogada aux : minhasJogadas){
            if(aux.getLinha()==jogada.getLinha() && aux.getColuna()==jogada.getColuna()){
                return true;
            }
        }
        
        minhasJogadas.add(jogada);

        return false;
    }
    
    public ArrayList<Jogada> getMinhasJogadas(){
        return minhasJogadas;
    }
    
    
}
