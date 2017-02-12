/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * @author Estudiantes
 */
public class Musico {
	private Instrumento instrumento;
	private String nombre;

	public Musico(String nombre) {
		this.nombre = nombre;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public void tocarNota(String Nota, int n) {
		System.out.println("El musico " + n + " ha tocado la nota " + Nota + " con su "+ instrumento.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
