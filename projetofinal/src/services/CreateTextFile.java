/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import model.Catalogo;
import model.Estoque;

/**
 *
 * @author Admin
 */
public class CreateTextFile {
    private static Formatter output; // outputs text to a file
 
    public CreateTextFile(){
        
    }

   // open file clients.txt
   public static void openFile()
   {
      try
      {
         output = new Formatter("locadora.txt"); // open the file
      }
      catch (SecurityException securityException)
      {
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); // terminate the program
      } 
      catch (FileNotFoundException fileNotFoundException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1); // terminate the program
      } 
   } 

   // add records to file
   public static void addRecords(Estoque estoque)
   {     
       //output.format("Nome;Telefone;Email\n");
     try
     {
        // output new record to file; assumes valid input
        output.format(estoque.listaFilmes());                             
     } 
     catch (FormatterClosedException formatterClosedException)
     {
        System.err.println("Error writing to file. Terminating.");

     } 
     catch (NoSuchElementException elementException)
     {
        System.err.println("Invalid input. Please try again.");
     } 

     System.out.print("? ");
   }

   // close file
   public static void closeFile()
   {
      if (output != null)
         output.close();
   }
}
