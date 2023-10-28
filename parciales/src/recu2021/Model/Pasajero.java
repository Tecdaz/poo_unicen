package recu2021.Model;

import recu2021.Filter.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Elemento{
    private float precio;
    private float deuda;

    public Pasajero(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso) {
        super(nombre, destino, fechaPartida, fechaRegreso);
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public float getDeuda() {
        return deuda;
    }

    @Override
    public int cantAlumnos() {
        return 1;
    }

    @Override
    public Elemento alumnoMayorDeuda() {
        return this.copia();
    }

    @Override
    public Elemento copia() {
        return new Pasajero(getNombre(), getDestino(), getFechaPartida(), getFechaRegreso());
    }

    @Override
    public List<Elemento> buscar(Filtro filtro) {
        List<Elemento> res = new ArrayList<>();
        if(filtro.cumple(this)){
            res.add(this);
        }
        return res;
    }
}
