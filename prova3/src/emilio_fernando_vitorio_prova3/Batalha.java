
package emilio_fernando_vitorio_prova3;

import java.util.Scanner;

public class Batalha {

    public static Jogador j1;
    public static Jogador j2;
    
    public static void main(String[] args) {
        
        j1 = new Jogador();
        j2 = new Jogador();
        j1.criaEspadas();
        j2.criaEspadas();
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int linha, coluna;
        int controleJogador = 0;
        
        System.out.println("Programa iniciado");
        
        System.out.println("Jogador 1, defina a posição, respectivamente, "
                + "das suas espadas de: madeira, alumínio, gelo, platina, bronze e ouro");
        for(int i = 0; i < 6; i++){
            System.out.println(j1.getEspadas()[i].getDescricao()+":");
            Jogada jogada1 = setaLinhasColunas();
            while(j1.defineLocal(jogada1.getLinha(), jogada1.getColuna(), j1.getEspadas()[i])){
                System.out.println("Essa posição já guarda uma espada. Digite novamente.");
                jogada1 = setaLinhasColunas();
            }
        }
        
        System.out.println("Jogador 2, defina a posição, respectivamente, "
                + "das suas espadas de: madeira, alumínio, gelo, platina, bronze e ouro");
        for(int i = 0; i < 6; i++){
            System.out.println(j2.getEspadas()[i].getDescricao()+":");
            Jogada jogada2 = setaLinhasColunas();
            while(j2.defineLocal(jogada2.getLinha(), jogada2.getColuna(), j2.getEspadas()[i])){
                System.out.println("Essa posição já guarda uma espada. Digite novamente.");
                jogada2 = setaLinhasColunas();
            }
            
        }
        
        System.out.println("\nInício de jogo");
        
        while(j1.getPontos()!=155 && j2.getPontos()!=155){
            System.out.println("\n");
            if(controleJogador == 0){
                System.out.println("Turno do jogador 1:");
                Jogada jogada = setaLinhasColunas();

                while(j1.verificaRepeticao(jogada)){
                    System.out.println("Essa jogada já foi feita. Tente novamente.");
                    jogada = setaLinhasColunas();
                }

                Espada esp = j2.verificaJogada(jogada);
                System.out.println("O ponto escolhido foi: "+jogada.getColuna()+"-"+jogada.getnomeColuna());
                if(esp != null){
                    j1.setPontos(esp);
                    System.out.println("O jogador 1 acertou a: "+esp.getDescricao()+"\n"
                            + "e ganhou "+esp.getValor()+" pontos");
                            System.out.println("Pontos atuais do jogador 1: "+j1.getPontos());
                }
                else{
                    System.out.println("O jogador 1 não acertou nenhuma espada");
                }
                controleJogador = 1;
            }
            
            else if(controleJogador == 1){
                System.out.println("Turno do jogador 2:");
                Jogada jogada = setaLinhasColunas();

                while(j2.verificaRepeticao(jogada)){
                    System.out.println("Essa jogada já foi feita. Tente novamente.");
                    jogada = setaLinhasColunas();
                }

                Espada esp = j1.verificaJogada(jogada);
                System.out.println("O ponto escolhido foi: "+jogada.getColuna()+"-"+jogada.getnomeColuna());
                if(esp != null){
                    j2.setPontos(esp);
                    System.out.println("O jogador 2 acertou a: "+esp.getDescricao()+"\n"
                            + "e ganhou "+esp.getValor()+" pontos");
                            System.out.println("Pontos atuais do jogador 2: "+j2.getPontos());
                }
                else{
                    System.out.println("O jogador 2 não acertou nenhuma espada");
                }
                controleJogador = 0;                
            }            
        }
        
        if(j1.getPontos() == 155){
            System.out.println("\n\nO jogador 1 venceu!\n"
                    + "Pontos finais dos jogadores: "
                    + "\nJogador 1: "+j1.getPontos()
                    + "\nJogador 2: "+j2.getPontos());
        }
        else {
            System.out.println("\n\nO jogador 2 venceu!\n"
                    + "Pontos finais dos jogadores: "
                    + "\nJogador 2: "+j2.getPontos()
                    + "\nJogador 1: "+j1.getPontos());            
        }
          
    }
    
    public static Jogada setaLinhasColunas(){
        int linha, coluna;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Insira linha:");
        linha = sc1.nextInt();
        System.out.println("Insira coluna:");
        coluna = sc2.nextInt();
        System.out.println("");
        Jogada aux = new Jogada(linha, coluna);
        
        return aux;      
    }
    
}
