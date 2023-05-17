//Dupla: Emilio Canton e Fernando Veizaga

package prova_substitutiva;

public class Calculos {
    
    private int resultado;
    private int pontos;
    
    public Calculos(){
        resultado = 0;
        pontos = 0;
    }
    
    public int calculaResultado(int[] operacao){
        switch(operacao[1]){
            case(0): 
                resultado = operacao[0] + operacao[2];
            break;
            
            case(1): 
                resultado = operacao[0] - operacao[2];
            break;
            
            case(2): 
                resultado = operacao[0] * operacao[2];
            break;
            
            case(3):             
                resultado = operacao[0] / operacao[2]; 
            break;
            default: 
                break;
        }
        return resultado;
    }
    
    public boolean verificaResposta(int palpite){
        return palpite == resultado;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public void somaPonto(){
        pontos++;
    }

}
