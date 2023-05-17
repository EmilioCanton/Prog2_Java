
package novaagenda;

/**
 *
 * @author Emilio
 */
public class Contatos {
    String nome;   
    String telefone;
    String email;
    
    public Contatos(){
        nome = "";
        telefone = "";
        email = "";
    }

    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getEmail(){
        return email;
    }
     
    public void setEmail(String email1){
        email = email1;
    }
     
    public void setTelefone(String telefone1){
        telefone = telefone1;
    }
     
    public void setNome(String nome1){
        nome = nome1;
    }
    
    public Contatos(String nome1, String telefone1, String email1){
        nome = nome1;
        telefone = telefone1;
        email = email1;
    }
}

