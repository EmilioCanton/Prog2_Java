package agendagui;

import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.HashMap;
import java.util.NoSuchElementException;  
import java.util.Scanner; 


public class CreateContacts {
    
    private static Formatter output;
    
    public CreateContacts(){
     
    }
    
    
    public void openFile(){
      try
      {
         output = new Formatter("contacts.txt");
      }
      catch (SecurityException securityException)
      {
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); 
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }
    
   public void addRecords(Agenda agenda){
        Scanner input = new Scanner(System.in);
        HashMap <String,Contato> contatos;
        contatos = agenda.getContatos();
      
        for (String key : contatos.keySet()){
            
            Contato value = contatos.get(key);
            output.format("%s;%s;%s%n", key,
                value.email, value.telefone);
    
        }
   
   }
   
   public void closeFile()
   {
      if (output != null)
         output.close();
   }
}
