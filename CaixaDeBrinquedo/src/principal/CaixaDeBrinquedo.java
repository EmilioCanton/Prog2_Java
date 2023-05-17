/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Emilio
 */
public class CaixaDeBrinquedo {
     ArrayList<Forma> formas = new ArrayList<>();

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void addBrinquedo(Forma forma) {
        this.formas.add(forma);
    }
    
    public void mostraBrinquedos(){
        for (Forma forma : formas){
            System.out.println(forma.euSou());
            
        }
    }
     
    
}
