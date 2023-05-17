package agendagui;

/**
 *
 * @author Emilio
 */
public class Contato {
    String nome;
    String telefone;
    String email;
    
    public Contato(){
        nome = null;
        telefone = null;
        email = null;
    }
    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
