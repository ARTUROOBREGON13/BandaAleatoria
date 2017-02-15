
package Control;

import Model.Banda;

import java.util.Scanner;

public class Control {
    
    
    
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in); //Se crea el lector
        

       int NumeroMusicos= sc.nextInt(); 
       Banda b= new Banda(NumeroMusicos);
   } 
}
