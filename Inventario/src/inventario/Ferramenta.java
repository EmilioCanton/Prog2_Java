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
public class Ferramenta extends Bem{
    private String acao;
    private double valorAcao;
    
    
    public Ferramenta(int quantidade, String acao){
        super(quantidade);
        this.acao = acao;
    }

    @Override
    public double converterParaDolar(double dolarComercial) {
        if(acao.equals("defesa")){
            valorAcao = 0.3;
        }
        else if(acao.equals("destruicao")){
            valorAcao = 0.2;
        }
        else{
            valorAcao = 0.1;
        }
        double valor = quantidade * dolarComercial * fator * valorAcao;
        return valor;
    }
    
}
