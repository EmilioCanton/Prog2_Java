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
public class Cenario extends Bem {
    private int tamanho;
    
    public Cenario(int quantidade, int tamanho, int nivel){
        super(quantidade);
        this.tamanho = tamanho;
        this.nivel = nivel;
        
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        double valor = quantidade * dolarComercial * fator * nivel * tamanho;
        return valor;
    }
    
}
