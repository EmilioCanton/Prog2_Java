package agendagui;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class ReadContacts {
    private static Scanner input;
    
    
    public ReadContacts(){
    
}
    public void openFile(){
      try
      {
         input = new Scanner(Paths.get("contacts.txt")); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }
    public void addAgenda(Agenda agenda){
        Contato contato;
        String[] dadosContatos;
        try 
        {
           while (input.hasNext()) 
           {       
               dadosContatos = input.next().split(";");
               contato = new Contato(dadosContatos[0],dadosContatos[1],
                       dadosContatos[2]);
               agenda.addContato(contato);
           }
        } 
        catch (NoSuchElementException elementException)
        {
           System.err.println("File improperly formed. Terminating.");
        } 
        catch (IllegalStateException stateException)
        {
           System.err.println("Error reading from file. Terminating.");
        } 
    }
    public void closeFile()
   {
      if (input != null)
         input.close();
   }
    
}
