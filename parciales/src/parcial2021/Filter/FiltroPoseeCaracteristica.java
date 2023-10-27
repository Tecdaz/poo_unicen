package parcial2021.Filter;

import parcial2021.Model.Producto;

public class FiltroPoseeCaracteristica implements Filtro{
    public String caracteristica;

    public FiltroPoseeCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(Object o) {
        Producto producto = (Producto) o;
        return producto.getCaracteristicas().contains(caracteristica);
    }
}
