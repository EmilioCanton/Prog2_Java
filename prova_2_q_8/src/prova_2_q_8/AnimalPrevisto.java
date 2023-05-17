
package prova_2_q_8;

public class AnimalPrevisto implements AnimalOrcamento{

    private final String d;
    private final double v;
    
    public AnimalPrevisto(String d, double v){
        this.d = d;
        this.v = v;
    }
       
    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        return null;
    }
    
}
