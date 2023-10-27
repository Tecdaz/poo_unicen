package parcial2021.Model;

import parcial2021.Filter.Filtro;

import java.util.ArrayList;
import java.util.List;

public class ProductoSimple extends Producto{
    private String marca;
    private float precio;
    private float peso;
    private float volumen;
    private List<String> caracteristicas = new ArrayList<>();


    public ProductoSimple(String nombre, String marca, float precio, float peso, float volumen, List<String> caracteristicas) {
        super(nombre);
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.volumen = volumen;
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public float getVolumen() {
        return volumen;
    }

    @Override
    public List<String> getCaracteristicas() {
        return new ArrayList<>(caracteristicas);
    }

    @Override
    public List<Producto> copia(Filtro filtro) {
        List<Producto> res = new ArrayList<>();
        if(filtro.cumple(this)){
            res.add(new ProductoSimple(getNombre(), marca, precio, peso, volumen, caracteristicas));
        }
        return res;
    }
}
