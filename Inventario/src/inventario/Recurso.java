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
public class Recurso extends Bem {
    private int tipo;
    
    public Recurso(int quantidade, int tipo){
        super(quantidade);
        this.tipo = tipo;
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = quantidade * dolarComercial * fator * tipo;
        return valor;
    }
    
}
