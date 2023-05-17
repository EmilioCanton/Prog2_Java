/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Emilio
 */
public class Circulo extends Bidimensional {
    private double pi = 3.14;
    private double raio;
    
    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        double area = (pi*raio*raio);
        return area;
    }
    
    public String euSou() {
        String sou = "Eu sou um Circulo e minha área é " + this.obterArea();
        return sou;
    }   
  
}
