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
public class Moeda extends Bem {
    
    public Moeda(int quantidade, int nivel){
        super(quantidade);
        this.nivel = nivel;
        
    }
    
    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = quantidade * dolarComercial * fator * nivel;
        return valor;
    }
    
    
}
