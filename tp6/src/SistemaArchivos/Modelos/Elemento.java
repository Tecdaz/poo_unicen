package SistemaArchivos.Modelos;

import java.time.LocalDate;
import java.util.Date;

public abstract class Elemento {
    private String nombre;
    private LocalDate fechaCreacion = LocalDate.now();

    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public LocalDate getFechaCreacion(){
        return  fechaCreacion;
    }

    public abstract float getTamanio();

    @Override
    public String toString(){
        return "Nombre: " + nombre + " tamanio: " + getTamanio();
    }
}
