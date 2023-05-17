//Dupla: Emilio Canton e Fernando Veizaga

package prova_substitutiva;

import java.security.SecureRandom;
import java.util.HashMap;

public class DefineOperacao {
    
        private int num1;
        private int num2;
        private int operador;
        private final HashMap<Integer, String> operacoes;
        private final SecureRandom randomizador = new SecureRandom();
        
        public DefineOperacao(){
            operacoes = new HashMap<>();
            operacoes.put(0, "+");
            operacoes.put(1, "-");
            operacoes.put(2, "*");
            operacoes.put(3, "/");
            num1 = 0;
            num2 = 0;
            operador = 0;
        }
        
        public int[] criaOperacao(){
            num1 = randomizador.nextInt(99);
            num2 = randomizador.nextInt(99);
            operador = randomizador.nextInt(4);
            while(operador == 3 && num2 == 0){
                num2 = randomizador.nextInt(99);                            
            }
            while(operador == 1 && num1 < num2){
                num1 = randomizador.nextInt(99);
                num2 = randomizador.nextInt(99);
            }
            int[] operacao = {num1, operador, num2};
            return operacao;
        }
                    
        public HashMap<Integer, String> getOperacoes() {
            return operacoes;
        }           
}

    
