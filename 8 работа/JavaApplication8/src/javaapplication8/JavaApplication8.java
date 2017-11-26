/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author студент
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
   

	public static void main(String[] args) {
      int[][] matrixC;
		matrixC = new int[3][3];

		matrixC[0][0] = 1;
		matrixC[0][1] = 2;
		matrixC[0][2] = 3;
		matrixC[1][0] = 4;
		matrixC[1][1] = 1;
		matrixC[1][2] = 7;	
                matrixC[2][0] = 5;
		matrixC[2][1] = 9;
		matrixC[2][2] = 3;
                
      int[][] matrixD;
                
		matrixD = new int[3][3];
		
		matrixD[0][0] = 2;
		matrixD[0][1] = 4;
		matrixD[0][2] = 5;
		matrixD[1][0] = 3;
		matrixD[1][1] = 8;
		matrixD[1][2] = 4;	
                matrixD[2][0] = 6;
		matrixD[2][1] = 7;
		matrixD[2][2] = 1;
       int[][] matrixA;
                
		matrixA = new int[3][3];
                
       int[][] matrixB;
                
		matrixB = new int[3][3];
     System.out.println("Матрица С");
     System.out.println();
        for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) { 
        System.out.print(matrixC[i][j] + "\t");
    }
    System.out.println();
}     
    System.out.println();   
     System.out.println("Матрица D");
     System.out.println();
        for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) { 
        System.out.print(matrixD[i][j] + "\t");
    }
    System.out.println();
}
                
     // сложение
       System.out.println();
       System.out.println("Сложение элементов матрицы");
       System.out.println();
         for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) { 
        matrixA[i][j] = matrixC[i][j] + matrixD[i][j];       
    }      
        }
        for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) { 
        System.out.print(matrixA[i][j] + "\t");
    }
    System.out.println();
}
   // умножение 
       System.out.println();
       System.out.println("Умножение элементов матрицы");
       System.out.println(); 
        int s ;
          for (int i = 0; i <3 ; i++) {
           for (int j = 0; j <3; j++) {   
                 s=0;
            for (int k=0; k < 3;k++){
       s = s+ matrixC[i][k]*matrixD[k][j]; 
       } 
       matrixB[i][j]= s;
     
       }
          }
        for (int i = 0; i < 3; i++) {     
    for (int j = 0; j < 3; j++) { 
        System.out.print(matrixB[i][j] + "\t");
    }
    System.out.println();
}
    }  
}
