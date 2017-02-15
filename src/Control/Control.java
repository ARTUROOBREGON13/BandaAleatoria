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
       int cantidadMusicos= (int) Math.random()*10;
       Banda band = new Banda(cantidadMusicos);
       band.Afinar();
       band.Tocar();
       band.VerBanda();
   } 
}
