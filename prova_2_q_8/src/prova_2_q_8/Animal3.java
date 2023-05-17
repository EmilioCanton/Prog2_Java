
package prova_2_q_8;

public class Animal3 extends Animal{
    //O Animal3 representa Rato
    public Animal3(ItemOrcamentoComplexo meuOrcamentoMensal){
        super(meuOrcamentoMensal);
    }
    
    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        ItemOrcamentoComplexo custo3 = new ItemOrcamentoComplexo();
        custo3.addString(descricao);
        custo3.addValorTotal(valor);
        
        return custo3;
    }

    @Override
    public String getNome() {
        return "Rato";
    }
}
