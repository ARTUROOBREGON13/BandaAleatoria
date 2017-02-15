/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.Scanner;

/**
 * @author Estudiantes
 */
public class Control {
   public static void main(String[] args){
       //Creado para leer datos por teclado
       Scanner sc = new Scanner(System.in); 
       
       int cantidadMusicos=0;
       
       //bucle para tener una cantidad aleatoria de musicos entre 3 y 10
       while(cantidadMusicos<3){
        cantidadMusicos = (int) Math.ceil((Math.random()*10));
       }
       Banda band = new Banda(cantidadMusicos);
       // Variable que almacena la decisión 
       int opcion;
       
 do{
       System.out.println("\t Por favor, seleccione una de las siguientes opciones: \n");
       System.out.println("1. Afinar la banda \n");
       System.out.println("2. La banda tocará una nota aleatoria \n");
       System.out.println("3. La banda tocará una canción aleatoria\n");
       System.out.println("4. Se mostrará la banda\n");
       System.out.println("Con otra opción el programa finalizará.\n");
      
        opcion = sc.nextInt();
       
       switch(opcion){
           case 1: 
               band.Afinar();
               break;
           case 2:
               band.TocarNotaAleatoria();
               break;
           case 3:
               band.Tocar();
               break;
           case 4:
               band.VerBanda();
               break;
               
           default:
               System.out.println(" ");
       }
       
      
 }while(opcion>=1 && opcion<=4 );
   } 
}
