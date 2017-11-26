/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4_1;




/**
 *
 * @author студент
 */
public class JavaApplication4_1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Point p1 = new Point(); 
       Point p2 = new Point(); 
       p1.init(10,20); 
       p2.init(42,99); 
       Point3D p = new Point3D(10, 20, 30);
       
      
       System.out.println("x = " + p1.х + " у = "+ p1.у); 
       System.out.println("x = " + p2.х + " у = "+ p2.у);
       System.out.println("p1.distance(60, 80) = " + p1.ds(60, 80)); 
       System.out.println( " x = " + p.х + " y = " + p.у + " z = " + p.z); 
       System.out.println("p1.distance(4, 6) = " + p1.distance(4, 6)); 
       
 

    }
    
}
class Point { 
    int х , у ;
    
void init(int х, int у) { 
    
    this.х = х; 
    this.у = у;
}
    double ds(int х, int у) {      
int dx =  this.х - х; 
int dy = this.у - у; 
return Math.sqrt(dx*dx + dy*dy); 
} 

}  
class Point3D extends Point{
    int z;
    Point3D(int x, int y, int z){
      
     super(x, y);  
      this.z = z;
    }
     Point3D(){
      this(-1,-1,-1); 
       
    }
     double distance(int х, int у,  int z) { 
int dx = this.х - х; 
int dy = this.у - у; 
int dz = this.z - z; 
return Math.sqrt(dx*dx + dy*dy + dz*dz); 
} 

}
