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
public class Cubo extends Tridimensional {
    private double lado;
    
    public Cubo(double lado){
        this.lado = lado;
    }
    @Override
    public double obterVolume() {
        double volume = (lado*lado*lado);
        return volume;
    }

    @Override
    public double obterArea() {
        double area = ((lado*lado)*6);
        return area;
    }
    public String euSou() {
        String sou = "Eu sou um Cubo, minha área é " + this.obterArea() +" e meu volume é " + this.obterVolume();
        return sou;
    } 
    
}
