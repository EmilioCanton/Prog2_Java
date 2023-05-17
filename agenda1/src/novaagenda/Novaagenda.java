
package novaagenda;


import java.util.HashMap;

/**
 *
 * @author Emilio
 */
public class Novaagenda {
    HashMap <String,Contatos> contatos;
    
    public Novaagenda(){
        contatos = new HashMap <>();
    }
    public void listContatos(){
        for (String key : contatos.keySet()) 
        {
            Contatos value = contatos.get(key);
            System.out.println(key + " = " + value.email +","+ value.telefone);
        }
    }
    
    public int getSize(){
        return contatos.size();
    }
    
    public void addContato(Contatos contato){
        contatos.put(contato.nome,contato);
    }
     
    public void buscarContatos(String nome){
        System.out.println(contatos.get(nome));
        System.out.println("");
    }
    
    public boolean excluirContato(String nome){
        contatos.remove(nome);
        if(contatos.get(nome) == null){
            return true;
        }
        return false;
    }
    
    
}
