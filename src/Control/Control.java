/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 * @author Estudiantes
 */
public class Control {
   public static void main(String[] args){
       int cantidadMusicos=0;
       //bucle para tener una cantidad aleatoria de musicos entre 3 y 10
       while(cantidadMusicos<3){
        cantidadMusicos = (int) Math.ceil((Math.random()*10));
       }
       Banda band = new Banda(cantidadMusicos);
       band.Afinar();
       band.TocarNotaAleatoria();
       band.Tocar();
       band.VerBanda();
   } 
}
