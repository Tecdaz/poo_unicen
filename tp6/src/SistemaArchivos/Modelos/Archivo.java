package SistemaArchivos.Modelos;

import java.time.LocalDate;

public class Archivo extends Elemento {
    private float tamanio;
    private LocalDate fechaModificacion = LocalDate.now();

    public Archivo(String nombre, float tamanio){
        super(nombre);
        this.tamanio = tamanio;
    }

    public void modificar(){
        this.fechaModificacion = LocalDate.now();
    }

    public LocalDate getFechaModificacion(){
        return fechaModificacion;
    }

    @Override
    public float getTamanio(){
        return tamanio;
    }

    public String toString(){
        return super.toString() + " Archivo";
    }
}
