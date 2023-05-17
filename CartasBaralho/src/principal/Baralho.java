package principal;


import java.security.SecureRandom;


public class Baralho {
    
    private final String[] NAIPES = {"Ouro", "Copas", "Espada", "Paus"};
    
    private Carta[] baralho;
    
    private SecureRandom randomizador = new SecureRandom();
    
    public final String MARCA = "Copag";
    
    public Baralho(){
    int cont = 0;
    baralho = new Carta[52];
    for (String naipe : NAIPES){
        for (int i=1; i<14; i++){
            baralho[cont] = new Carta(i, naipe);
            cont+=1;
        }
    }
}
    public void embaralhar(){
        int posicao = 0;
        Carta aux;
        for(int i=0; i<baralho.length;i++){
            posicao = randomizador.nextInt(51);
            aux = baralho[i];
            baralho[i] = baralho[posicao];
            baralho[posicao] = aux;
        }
    }
    public Carta[] distribuir(int quantidade){
        Carta[] aux = new Carta[quantidade];
        int j = 0;
        for(int i=0;i<quantidade;i++){
            for(j=0;baralho[j]==null;j++){}
            if (baralho[j] != null){
                aux[i] = baralho[j];
                baralho[j] = null;
            }
 
            }
        return aux;
    
    }   
    
}
    
    


