package agendagui;
import java.util.HashMap;

/**
 *
 * @author Emilio
 */
public class Agenda {
    private HashMap <String,Contato> contatos;
    
    public Agenda(){
        contatos = new HashMap <>();
    }
    
    public int getSize(){
        return contatos.size();
    }

    public void addContato(Contato contato){
        contatos.put(contato.nome,contato);
    }

    public Contato buscarContatos(String nome){
        return contatos.get(nome);
    }

    public boolean excluirContato(String nome){
        if(contatos.get(nome) == null){
            return false;
        }
        contatos.remove(nome);
        return true;
    }

    public HashMap<String, Contato> getContatos() {
        return contatos;
    }
    public boolean existeContato(String nome){
        return contatos.containsKey(nome);
    }

}

