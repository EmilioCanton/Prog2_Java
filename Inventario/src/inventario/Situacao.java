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
public class Situacao {
    private ArrayList<Bem> bens;
    private double valorBens = 0;
    
    public Situacao(ArrayList<Bem> bens){
        this.bens = bens;
        
    }
    
    public double calculaValorInventario(){
        double valorTotal = 0;
        for(Bem bem: bens){
            valorTotal += bem.converterParaDolar(5);
        }
        valorBens = valorTotal;
        return valorTotal;
    }

    public int calculaMaiorNivel(){
        int maiorNivel = 0;
        for(Bem bem: bens){
            if(bem.nivel > maiorNivel)
            {
                maiorNivel = bem.nivel;
            }
        }
        return maiorNivel;
    }
}
