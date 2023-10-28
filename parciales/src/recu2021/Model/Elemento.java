package recu2021.Model;

import recu2021.Filter.Filtro;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
    private String nombre;
    private String destino;
    private LocalDate fechaPartida;
    private LocalDate fechaRegreso;

    public Elemento(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso) {
        this.destino = destino;
        this.fechaPartida = fechaPartida;
        this.fechaRegreso = fechaRegreso;
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDestino() {
        return destino;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public LocalDate getFechaRegreso() {
        return fechaRegreso;
    }

    public abstract float getPrecio();
    public abstract float getDeuda();
    public abstract int cantAlumnos();
    public abstract Elemento alumnoMayorDeuda();
    public abstract Elemento copia();
    public abstract List<Elemento> buscar(Filtro filtro);

}
