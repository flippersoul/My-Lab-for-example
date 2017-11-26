/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Stack;

/**
 *
 * @author студент
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Stack stack = new Stack(); 
       int n = 65;
       char [] nomer = String.valueOf(n).toCharArray();
       for (char number : nomer)
           stack.push(number); 
       
       while (!stack.empty()){
        char obrstack = (char) stack.pop();
        
       System.out.print(obrstack);
    }

} 
}

