package principal;


import java.util.Scanner;
public class Mesa {
   private static Baralho oficial;
   private static Jogador j1,j2;
    
    
    public static void main(String[] args){
        
        
        oficial = new Baralho();
        oficial.embaralhar();
        j1 = new Jogador();
        j2 = new Jogador();
        distribuirCartas();
        
        //jogador joga 1 carta
        Carta cartaj1 = new Carta();
        Carta cartaj2 = new Carta();
        cartaj1 = j1.jogar();
        cartaj2 = j2.jogar();
        System.out.println("Jogador 1 joga sua maior carta\n");
        System.out.println(cartaj1.getValor() + "-" + cartaj1.getNaipe()+"\n");
        System.out.println("Jogador 2 joga sua maior carta\n");
        System.out.println(cartaj2.getValor() + "-" + cartaj2.getNaipe()+"\n");
        
        
        //verficicar quem ganhou a rodada
        System.out.println(maiorCarta(cartaj1 , cartaj2));
        
        
        //mostrar a mao do jogador
        System.out.println("Cartas restantes do Jogador 1 e do Jogador 2,respectivamente\n");
        System.out.println(j1.mostrarMao()); 
        System.out.println(j2.mostrarMao());
    }
    
    public static void distribuirCartas(){
        j1.receberCartas(oficial.distribuir(5));
        
        j2.receberCartas(oficial.distribuir(5));
    }
    
    public static String maiorCarta(Carta carta1, Carta carta2){
       String vencedor = "";
       if (carta1.getValor() > carta2.getValor()){
           vencedor = "O Vencedor é o jogador 1, com sua carta de Valor " + carta1.getValor() + "\n\n";
       }
       else if (carta2.getValor() > carta1.getValor()){
           vencedor = "O Vencedor é o jogador 2, com sua carta de Valor " + carta2.getValor() + "\n\n";      
       }
       else{
           if(carta1.getNaipe().equals("Ouro")){
            vencedor = "O Vencedor é o jogador 1, Devido a sua carta possuir naipe de ouro  " + carta1.getValor() + "-" + carta1.getNaipe() + "\n\n";
           }
           else if(carta2.getNaipe().equals("Ouro")){
            vencedor = "O Vencedor é o jogador 2, Devido a sua carta possuir naipe de ouro  " + carta2.getValor() + "-" + carta2.getNaipe() + "\n\n";
           }
           else{
               vencedor = "Não exite vencedor, o jogo empatou pois nenhuma carta tem naipe de Ouros e o valor é o mesmo " + carta1.getValor() + "\n\n";
           }
       }
        
        
       
       return vencedor; 
    }
   
    
}
