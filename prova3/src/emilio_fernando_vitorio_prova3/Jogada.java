
package emilio_fernando_vitorio_prova3;

public class Jogada {
    
    private final String[] nomeColuna = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
    private int linha;
    private int coluna;
    
    public Jogada(int linha, int coluna){
        if(linha > 12){
            this.linha = linha%13;
        }
        else{
            this.linha = linha;
        }
        
        if(coluna > 12){
            this.coluna = coluna%13;
        }
        else{
            this.coluna = coluna;
        }
        
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    
    public String getnomeColuna(){
        return nomeColuna[coluna];
    }
    
    
}
