
package model;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Filme> catalogo;
    
    public Catalogo(){
        catalogo = new ArrayList<>();
    }

    public ArrayList<Filme> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Filme> catalogo) {
        this.catalogo = catalogo;
    }
    
    public Filme verificaExistencia(String nome){
        for(Filme f: catalogo){
            if(nome.equals(f.getTitulo())){
                return f;
            }
        }
        return null;
    }
       
}

//copias = estoque.verificaDisponibilidade(verificaExistencia(nome));