
package prova_2_q_8;

import java.util.ArrayList;
import java.lang.String;

public class Zoologico{
    
    private ArrayList<AnimalOrcamento> zooVacinas;
    
    public Zoologico(){
        zooVacinas = new ArrayList<>();
    }
    
    public ArrayList<AnimalOrcamento> verificaVacina(ArrayList<AnimalOrcamento> array){
        int contador = 0;
        for(AnimalOrcamento a: array){
            Animal a1 = (Animal) a;
            for(String s: a1.getMeuOrcamentoMensal().getDescricao()){
                if(s.equals("vacina W")){
                    zooVacinas.add(array.get(contador));
                }
            }
            contador++;
        }
        return zooVacinas;
    }
}
