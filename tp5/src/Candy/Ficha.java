package Candy;

public class Ficha {
    private String nombre;
    private int fortaleza;
    private int espacioOcupado;
    private int destruccion;

    public Ficha(String nombre, int fortaleza, int espacioOcupado, int destruccion) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.espacioOcupado = espacioOcupado;
        this.destruccion = destruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    public int getDestruccion() {
        return destruccion;
    }

    public String toString(){
        return "Nombre: " + getNombre() + "\nFortaleza: " + getFortaleza() + "\nEspacio ocupado: " + getEspacioOcupado() + "\nDestruccion: " + getDestruccion();
    }
}
