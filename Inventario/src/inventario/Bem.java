/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author Emilio
 */
public abstract class Bem {
    protected int quantidade;
    protected double fator = (double) 0.05;
    protected int nivel = 0;
    
    public Bem(int quantidade){
        this.quantidade = quantidade;
                
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    public abstract double converterParaDolar(double dolarComercial);
    
}
