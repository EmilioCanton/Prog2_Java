
package prova_2_q_8;

public class Animal2 extends Animal{
    //O Animal2 representa Cachorro
    public Animal2(ItemOrcamentoComplexo meuOrcamentoMensal){
        super(meuOrcamentoMensal);
    }
    
    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        ItemOrcamentoComplexo custo2 = new ItemOrcamentoComplexo();
        custo2.addString(descricao);
        custo2.addValorTotal(valor);
        
        return custo2;
    }

    @Override
    public String getNome() {
        return "Cachorro";
    }
}
