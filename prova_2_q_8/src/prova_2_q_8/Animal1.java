
package prova_2_q_8;


public class Animal1 extends Animal{
    //O Animal1 representa Gato
    public Animal1(ItemOrcamentoComplexo meuOrcamentoMensal){
        super(meuOrcamentoMensal);
    }
    
    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        ItemOrcamentoComplexo custo1 = new ItemOrcamentoComplexo();
        custo1.addString(descricao);
        custo1.addValorTotal(valor);
        
        return custo1;
    }

    @Override
    public String getNome() {
        return "Gato";
    }
}
