
package prova_2_q_8;

import java.util.ArrayList;

public class Teste {
    
    public static ItemOrcamentoComplexo a1;
    public static ItemOrcamentoComplexo a2;
    public static ItemOrcamentoComplexo a3;
    public static ItemOrcamentoComplexo a4;
    public static Animal1 custo1;
    public static Animal2 custo2;
    public static Animal3 custo3;
    public static Animal4 custo4;
    public static ArrayList<AnimalOrcamento> animais;
    public static Zoologico zooVacinados;
    public static ArrayList<AnimalOrcamento> animaisVacinados;

    public static void main(String[] args) {
        zooVacinados = new Zoologico();
        animais = new ArrayList<>();
        
        a1 = new ItemOrcamentoComplexo();
        a1.addString("comida");
        a1.addString("água");
        a1.addString("higiene");
        a1.addString("vacina W");        
        a1.addValorTotal(2000);
        custo1 = new Animal1(a1);
        
        a2 = new ItemOrcamentoComplexo();
        a2.addString("comida");
        a2.addString("água");
        a2.addString("higiene");
        a2.addValorTotal(2500);
        custo2 = new Animal2(a2);
        
        a3 = new ItemOrcamentoComplexo();
        a3.addString("comida");
        a3.addString("água");
        a3.addString("higiene");
        a3.addString("vacina W");
        a3.addValorTotal(3500);
        custo3 = new Animal3(a3);
        
        a4 = new ItemOrcamentoComplexo();
        a4.addString("comida");
        a4.addString("água");
        a4.addString("higiene");
        a4.addString("vacina W");
        a4.addValorTotal(700);
        custo4 = new Animal4(a4);
        
        animais.add(custo1);
        animais.add(custo2);
        animais.add(custo3);
        animais.add(custo4);
        
        animaisVacinados = zooVacinados.verificaVacina(animais);
        
        System.out.println("Os animais que possuem 'vacina W' prevista em seu orçamento são: ");
        for(AnimalOrcamento aux: animaisVacinados){
            Animal a = (Animal) aux;
            System.out.println(a.getNome());
        }
        
    }
    
}
