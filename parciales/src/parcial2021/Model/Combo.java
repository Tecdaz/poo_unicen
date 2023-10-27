package parcial2021.Model;

import parcial2021.Filter.Filtro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combo extends Producto{
    private List<Producto> productos;

    public Combo(String nombre, List<Producto> productos) {
        super(nombre);
        this.productos = productos;
    }

    @Override
    public String getMarca() {
        return productos.get(0).getMarca();
    }

    @Override
    public float getPrecio() {
        float suma = 0f;
        for(Producto producto: productos){
            suma += producto.getPrecio();
        }
        return suma;
    }

    @Override
    public float getPeso() {
        float suma = 0f;
        for(Producto producto: productos){
            suma += producto.getPeso();
        }
        return suma;
    }

    @Override
    public float getVolumen() {
        float mayor = 0;
        for (Producto producto: productos){
            if (producto.getVolumen() > mayor){
                mayor = producto.getVolumen();
            }
        }
        return mayor;
    }

    @Override
    public List<String> getCaracteristicas() {
        Set<String> caracteristicas = new HashSet<>();
        for (Producto producto: productos){
            caracteristicas.addAll(producto.getCaracteristicas());
        }
        return new ArrayList<>(caracteristicas);
    }

    @Override
    public List<Producto> filtrar(Filtro filtro){
        List<Producto> res = super.filtrar(filtro);
        for(Producto producto: productos){
            res.addAll(producto.filtrar(filtro));
        }
        return res;
    }

    @Override
    public List<Producto> copia(Filtro filtro) {
        List<Producto> res = new ArrayList<>();
        for(Producto producto: productos){
            res.addAll(producto.copia(filtro));
        }
        if (!res.isEmpty()){
            res.add(new Combo(getNombre(), new ArrayList<>(productos)));
        }
        return res;
    }

}
