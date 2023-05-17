/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.time.LocalDate;

/**
 *
 * @author Emilio
 */
public class Vida extends Bem {
    private int validaAte; //    Ano
    
    public Vida(int quantidade, int validaAte){
        super(quantidade);
        this.validaAte = validaAte;
   
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor;
        
        if(validaAte<2021){
            valor = 0; 
        }
        else{
            valor = quantidade * dolarComercial * 0.2;
        }
        return valor;
        
    }
    
}
