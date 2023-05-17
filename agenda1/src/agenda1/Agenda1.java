
package agenda1;

import java.util.ArrayList;

/**
 *
 * @author Emilio
 */
public class Agenda1 {
    ArrayList <Contatos> arraycontato;
    public Agenda1(){
        arraycontato = new ArrayList <>();
    }
    public void addContato(Contatos contato){
        arraycontato.add(contato);
    }
    
    public int getSize(){
        int numerodecontatos = 0;
        for(Contatos contato:arraycontato){
        numerodecontatos++;
        }
        return numerodecontatos;
    }
    public void listContatos(){
        int i;
        for (i=0; i<arraycontato.size(); i++){
            pesquisarContatos(arraycontato.get(i).nome);
        }
    }
    
    public void pesquisarContatos(String nome){
        int i;
        for (i=0;i<arraycontato.size();i++){
            if(nome.equals(arraycontato.get(i).nome)){
                System.out.println("Nome: "+arraycontato.get(i).nome);
                System.out.println("Telefone: "+arraycontato.get(i).telefone);
                System.out.println("Email: "+arraycontato.get(i).email);
                System.out.println("");
            }
        }
    }
    
    public boolean excluirContato(String nome){
        int i;
        for (i=0;i<arraycontato.size();i++){
            if(nome.equals(arraycontato.get(i).nome)){
                arraycontato.remove(i);
                return true;
            }
        }
        return false;
    }
    
}
