package Model;

/**
 * @author R2D2
 */
public abstract class Instrumento {

    /* Atributos*/
    private String nombre;
    private String tipo;
    private int afinacion;

    /* Constructor
    No se sabe si el instrumento esta afinado o no, por eso se le da un valor aleatorio*/
    Instrumento() {
        afinacion = (int) Math.ceil(Math.random() * 10);
    }
    
    /* Métodos get and set*/
    public int getAfinacion() {
        return afinacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
    /* Métodos*/

    public void afinar() {
        afinacion = 0;
    }

}
