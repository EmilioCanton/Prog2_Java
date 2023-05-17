
package prova_2_q_8;

import java.util.ArrayList;
import java.lang.String;

public class ItemOrcamentoComplexo {
    
    private ArrayList<String> descricao;
    private double valorTotal;
    
    public ItemOrcamentoComplexo(){
        descricao = new ArrayList<>();
        valorTotal = 0;
    }
    
    public void addString(String d){
        descricao.add(d);
    }
   
    public double addValorTotal(double v) {
        return valorTotal+=v;
    }

    public ArrayList<String> getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

}
