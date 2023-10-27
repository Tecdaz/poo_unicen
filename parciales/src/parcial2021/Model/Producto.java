package parcial2021.Model;

import parcial2021.Filter.Filtro;

import java.util.ArrayList;
import java.util.List;

public abstract class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract String getMarca();

    public abstract float getPrecio();

    public abstract float getPeso();

    public abstract float getVolumen();

    public abstract List<String> getCaracteristicas();

    public List<Producto> filtrar(Filtro filtro) {
        List<Producto> res = new ArrayList<>();
        if(filtro.cumple(this)){
            res.add(this);
        }
        return res;
    }

    public abstract List<Producto> copia(Filtro filtro);
}
