
package prova_2_q_8;

public class Animal4 extends Animal{
    //O Animal4 representa Vaca
    public Animal4(ItemOrcamentoComplexo meuOrcamentoMensal){
        super(meuOrcamentoMensal);
    }
    
    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        ItemOrcamentoComplexo custo4 = new ItemOrcamentoComplexo();
        custo4.addString(descricao);
        custo4.addValorTotal(valor);
        
        return custo4;
    }

    @Override
    public String getNome() {
        return "Vaca";
    }
}
