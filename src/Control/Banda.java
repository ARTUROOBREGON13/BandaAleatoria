/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.*;
import java.util.ArrayList;

/**
 * @author Estudiantes
 */
public class Banda {

	// Constantes para las notas musicales y los nombres de los musicos
	public static final String[] Notas = { "Do", "Re", "Mi", "Fa", "Sol", "La", "Si" };
	public static final String[] Nombres = { "Julio", "Cristiano", "Nicolas", "Tulio", "Renaldo", "Alejandro",
			"Silvio" };
	public static final String[] Canciones = { "La cucaracha", "Cucarachita", "Cucarachon" };

	/* Constructor */

	public Banda(int NumeroMusicos) {
		ListaInstrumentos = new ArrayList<Instrumento>();
		ListaMusicos = new ArrayList<Musico>();
		// se incluye cada tipo de instrumento en la lista
		ListaInstrumentos.add(new Chelo());
		ListaInstrumentos.add(new Cuatro());
		ListaInstrumentos.add(new Guitarra());
		ListaInstrumentos.add(new Trompeta());
		ListaInstrumentos.add(new Violin());

		// Nombre e instrumento aleatorio para cada musico
		for (int a = 0; a < NumeroMusicos; a++) {
                    /*Se tiene en cuenta la cantidad de nombres y de instrumentos, de sus respectivos arreglos,
                    para que sean asignados aleatoriamente*/
                        int posicion = (int) Math.ceil((Math.random()*(Nombres.length-1)));
			Musico musico = new Musico(Nombres[posicion]);
			musico.setInstrumento(ListaInstrumentos.get((int) Math.ceil(Math.random() * (ListaInstrumentos.size()-1))));
                        ListaMusicos.add(musico);
		}
	}

	/* Atributos */
	private String nombreBanda;
	private String generoBanda;

	private ArrayList<Musico> ListaMusicos;
	private ArrayList<Instrumento> ListaInstrumentos;

	/* Metodos get and set */
	public String getNombreBanda() {
		return nombreBanda;
	}

	public String getGeneroBanda() {
		return generoBanda;
	}

	public ArrayList<Musico> getListaMusicos() {
		return ListaMusicos;
	}

	public ArrayList<Instrumento> getListaInstrumentos() {
		return ListaInstrumentos;
	}

	public void setNombreBanda(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}

	public void setGeneroBanda(String generoBanda) {
		this.generoBanda = generoBanda;
	}

	public void addListaMusicos(Musico musico) {
		this.ListaMusicos.add(musico);
	}

	public void addListaInstrumentos(Instrumento instrumento) {
		this.ListaInstrumentos.add(instrumento);
	}

	/* Metodos */
	public void Afinar() {
		for (Musico m : ListaMusicos) {
			m.getInstrumento().afinar();
		}
                System.out.println("\t La banda se ha afinado");
	}

	public void TocarNotaAleatoria() {
		int a = (int) Math.ceil(Math.random() * (Notas.length-1));
		int i = 1;
		// Si el instrumento esta afinado, deberia tener la afinacion un valor
		// de 0
		for (Musico m : ListaMusicos) {
			int afinacion = m.getInstrumento().getAfinacion();
			int pos = (a + afinacion);
                        if(pos >= Notas.length)
                            pos-=Notas.length;
                        m.tocarNota(Notas[pos], i);
			i++;
		}
	}

	public void Tocar() {
                //Canción aleatoria del arreglo
		int a = (int) Math.ceil(Math.random() * (Canciones.length-1));
		System.out.println("La banda ha tocado la cancion: " + Canciones[a]);
	}

	public void VerBanda() {
		int i = 1;
                //bucle dependiendo del tamaño del arreglo de ListaMusicos, extrayendo un musico a la vez y mostrando su informacion
		for (Musico m : ListaMusicos) {
			System.out.println(
					"El musico " + i + " Nombre: " + m.getNombre() + " Instrumento: " + m.getInstrumento().getNombre()+"\n");
                    i++;
                }
	}

}

