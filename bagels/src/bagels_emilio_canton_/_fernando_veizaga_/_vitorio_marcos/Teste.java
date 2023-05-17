
package bagels_emilio_canton_._fernando_veizaga_._vitorio_marcos;

import java.util.Scanner;

public class Teste {

    public static Desafiador des;
    public static Adivinho adv;
    public static ComparaNumeros comparador;
    
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        int[] v1 = new int[3];
        int numEscolhido;
        
        System.out.println("Insira o número a ser adivinhado pelo Adivinho: ");
        numEscolhido = sc2.nextInt();
        System.out.println("");
        
        adv = new Adivinho();
        des = new Desafiador(numEscolhido);
        boolean controle = false;
        
        while(controle != true){
            
            System.out.println("Insira um número de 3 algarismos para tentar adivinhar o número escolhido: ");
            adv.setPalpite(sc1.nextInt());
            
            System.out.printf("O seu resultado nesta rodada foi: ");
            controle = comparador.comparaVetores(adv.getPalpite(), des.getNumEscolhido());
            System.out.println("");
            
            if(controle == false){
                System.out.println("Você errou! Tente novamente.");
                System.out.println("Número de tentativas atual: "+comparador.getNumPalpites());
                System.out.println("");
            }
        }
       
        System.out.println("PARABÉNS! Você ganhou! O número era: "+des.getNumEscolhido());
        System.out.println("Número total de tentativas: " +comparador.getNumPalpites());
    } 
    
}
