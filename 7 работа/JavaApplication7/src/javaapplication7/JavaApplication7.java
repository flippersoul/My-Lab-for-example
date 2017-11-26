/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author студент
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
   
     String[] marki = new String[] {"Honda","Toyota", "Nissan", "Bmw", "Mazda", "Audi"};
     // сортировка методом sort по возрастанию
     System.out.println("По возрастанию sort");
     System.out.println();
     Arrays.sort(marki);
for(int i = 0; i <  marki.length; i++) {
	System.out.println(marki[i] + "  ");
}
     // сортировка методом sort по убыванию
     System.out.println();
     System.out.println("По убыванию sort");
     System.out.println();
     Arrays.sort(marki, Collections.reverseOrder());
     for(int i = 0; i <  marki.length; i++) {
	System.out.println(marki[i] + "  ");
    }
     
      
	
    }
}
   

   
    
        
   
