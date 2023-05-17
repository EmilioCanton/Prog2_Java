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
public class Seguidor extends Bem {
    private int fatorImpacto;
    
    public Seguidor(int quantidade, int fatorImpacto){
        super(quantidade);
        this.fatorImpacto = fatorImpacto;
        
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = quantidade * dolarComercial * fator * fatorImpacto;
        return valor;
    }
    
}
