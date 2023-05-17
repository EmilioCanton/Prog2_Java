
package emilio_fernando_vitorio_prova3;

public class Espada {
    
    private String descricao;
    private int valor;
    
    public Espada(){
        descricao = null;
        valor = 0;
    }
    
    public Espada(String descricao, int valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
