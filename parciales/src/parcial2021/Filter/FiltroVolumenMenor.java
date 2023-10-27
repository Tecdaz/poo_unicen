package parcial2021.Filter;

import parcial2021.Model.Producto;

public class FiltroVolumenMenor implements Filtro{
    private float limite;

    public FiltroVolumenMenor(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean cumple(Object o) {
        Producto producto = (Producto) o;
        return producto.getVolumen() < limite;
    }
}
