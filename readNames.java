/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst150lw150lwhw4readnames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lexus Washington
 */
public class CST150LW150LWHW4readNames {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        boolean found;
        int i;
        
       
        // Get the filename.
    String filename = JOptionPane.showInputDialog(null, "Enter the filename: ");

      // Open the file.
      File file = new File(filename);
      
      while (!file.exists()){
          
      JOptionPane.showInputDialog(null, "Enter the filename: ");
      
      }
      
      Scanner inputFile = new Scanner(file);
      

      // Read lines from the file until no more are left.
      while (inputFile.hasNext())
      {
          found = false;
         i = 0;
         // Read the next name.
         String friendName = inputFile.nextLine();
        
         
         // Display the name and intials.
          while(!found){
              if(friendName.charAt(i) == ' ')
                found = true;
            else
             i++;
          }
          
          //Display first and last name plus initials
         System.out.println(friendName + " " + friendName.charAt(0) +
                 "."+ friendName.charAt(i+1) + ".");

      }

      // Close the file.
      inputFile.close();
      }
    }


