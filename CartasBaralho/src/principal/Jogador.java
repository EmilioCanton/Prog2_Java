package principal;


public class Jogador {
    private Carta[] mao;
    
    public void receberCartas(Carta[] cartas){
        mao = cartas;
    }
    

    public Carta[] getMao() {
        return mao;
    }

    
    public Carta jogar(){
        Carta aux_maior = new Carta();
        for(Carta carta : mao){
            if(carta.getValor() > aux_maior.getValor()){
                aux_maior = carta;   
            }                 
        }
        return aux_maior; 
    } 
    
    public String mostrarMao(){
        String retorno = "";
        for(Carta carta : mao){
             retorno = retorno + carta.getValor()+"-"+carta.getNaipe() + "\n";
            } 
        return retorno;
    }
    
    
}
