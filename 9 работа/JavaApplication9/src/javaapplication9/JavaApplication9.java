/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author студент
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArr = {9, 1, 3, 2, 7, 4, 6, 12, 18, 36, 72};
for(int i=0; i< intArr.length; i++){
	if(intArr[i] % 3 == 0){
            if(intArr[i] % 6 == 0){
		System.out.print(intArr[i] + " ");
            }
	}
}
    }
    
}
