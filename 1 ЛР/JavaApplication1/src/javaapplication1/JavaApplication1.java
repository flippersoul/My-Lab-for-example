/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author студент
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int[] Number = new int[32];
        
       //ввод алфавита
       char[] Alpa = new char[32];
        for (int i=0; i<32; i++){
            Alpa[i] = (char)('а'+i);
        }
               */
       //ввод строки 
       String alphabet = "В одной строке печатать текст с двумя пробелами между буквами" ;
       int  c = 0;
       for (int i  = 0; i < alphabet.length(); i++){
        c = alphabet.codePointAt(i);        
          if (c >= 1072&c <= 1103){
            System.out.print(c-1071);
            System.out.print("  ");
       }
          else if (c>=1040 & c <= 1071){
            System.out.print(c-1039);
            System.out.print("  ");
      
          if (c==32){
            System.out.print("  ");  
          }
       }
       }
       System.out.println();
         for (int i  = 0; i < alphabet.length(); i++){
         System.out.println((int) alphabet.charAt(i)); 
         System.out.print("  ");
        
      
    }
    
    }
}
