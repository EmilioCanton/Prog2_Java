/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;
import java.util.ArrayList;
/**
 *
 * @author Emilio
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
       ArrayList<Bem> bens_Cleber = new ArrayList<>();
       ArrayList<Bem> bens_Edvaldo = new ArrayList<>();
       
       // Bens do Cleber
       Cenario c1 = new Cenario(4,1,1);
       Ferramenta f1 = new Ferramenta(2,"defesa");
       Moeda m1 = new Moeda(1,9);
       Recurso r1 = new Recurso(2,4);
       Seguidor s1 = new Seguidor(3,4);
       Vida v1 = new Vida(2,2024);
       
       // Bens do Edvaldo
       Cenario c2 = new Cenario(1,1,5);
       Ferramenta f2 = new Ferramenta(2,"destruicao");
       Moeda m2 = new Moeda(4,2);
       Recurso r2 = new Recurso(1,3);
       Seguidor s2 = new Seguidor(4,6);
       Vida v2 = new Vida(2,2000);
       
       // Adicionando bens aos respectivos arrays
       bens_Cleber.add(c1);
       bens_Cleber.add(f1);
       bens_Cleber.add(m1);
       bens_Cleber.add(r1);
       bens_Cleber.add(s1);
       bens_Cleber.add(v1);
       bens_Edvaldo.add(c2);
       bens_Edvaldo.add(f2);
       bens_Edvaldo.add(m2);
       bens_Edvaldo.add(r2);
       bens_Edvaldo.add(s2);
       bens_Edvaldo.add(v2);
       
       // Pegando a situação de cada um
       
       Situacao Cleber = new Situacao(bens_Cleber);
       Situacao Edvaldo = new Situacao(bens_Edvaldo);
       
       Cleber.calculaValorInventario();
       Cleber.calculaMaiorNivel();
       Edvaldo.calculaValorInventario();
       Edvaldo.calculaMaiorNivel();

       System.out.println();
       System.out.println("Valor do inventario do Cleber = " + Cleber.calculaValorInventario());
       System.out.println("Maior nivel atingido por Cleber é  = " + Cleber.calculaMaiorNivel());
       System.out.println("----------------//----------------------//----------------//");
       System.out.println("Valor do inventario do Edvaldo = " + Edvaldo.calculaValorInventario());
       System.out.println("Maior nivel atingido por Edvaldo é  = " + Edvaldo.calculaMaiorNivel()+ "\n");
       
       

       
    }
    
}
