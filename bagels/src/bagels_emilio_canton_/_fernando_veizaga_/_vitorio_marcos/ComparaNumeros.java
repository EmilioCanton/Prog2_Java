
package bagels_emilio_canton_._fernando_veizaga_._vitorio_marcos;

public class ComparaNumeros {
    
    private static int numPalpites = 0;
    
    public ComparaNumeros(){
        
    }
    
    public static boolean comparaVetores(int a, int b){
        int[] x = divideNumPalpite(a);
        int[] y = divideNumEscolhido(b);
        
        int pico = 0, fermi = 0;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if((x[i] == y[j]) && (i == j)){
                    fermi++;
                }
                else if((x[i] == y[j]) && (i != j)){
                    pico++;
                }
            }
        }
        
        for(int i = 0; i < pico; i++){
            System.out.printf("Pico ");
        }
        for(int i = 0; i < fermi; i++){
            System.out.printf("Fermi ");
        }
        if(pico == 0 && fermi == 0){
            System.out.printf("Bagels");
        }
        numPalpites++;
        if(fermi == 3){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static int[] divideNumPalpite(int palpite){
        int[] vetPalpite = new int[3];
        int aux = palpite, separador = 100;
        for(int i = 0; i < 3; i++){
            vetPalpite[i] = aux/separador;
            aux = aux%separador;
            separador = separador/10;           
        }
        return vetPalpite;
    }
    
    public static int[] divideNumEscolhido(int numEscolhido){
        int[] vetNumEscolhido = new int[3];
        int aux = numEscolhido, separador = 100;
        for(int i = 0; i < 3; i++){
            vetNumEscolhido[i] = aux/separador;
            aux = aux%separador;
            separador = separador/10;           
        }
        return vetNumEscolhido;
    }

    public static int getNumPalpites() {
        return numPalpites;
    } 
     
}
