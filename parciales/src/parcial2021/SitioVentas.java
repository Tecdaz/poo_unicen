package parcial2021;

import parcial2021.Filter.Filtro;
import parcial2021.Filter.FiltroCompuesto;
import parcial2021.Model.Combo;
import parcial2021.Model.Producto;
import parcial2021.Model.ProductoSimple;

import java.util.ArrayList;
import java.util.List;

public class SitioVentas {
    private List<Producto> productos = new ArrayList<>();
    private List<Filtro> politicasEnvioGratis = new ArrayList<>();

    public SitioVentas(List<Producto> productos, List<Filtro> politicasEnvioGratis) {
        this.productos = productos;
        this.politicasEnvioGratis = politicasEnvioGratis;
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public void addPoliticaGratis(Filtro filtro){
        politicasEnvioGratis.add(filtro);
    }

    public boolean envioGratis(Producto producto){
        FiltroCompuesto filtro = new FiltroCompuesto(politicasEnvioGratis);
        return filtro.cumple(producto);
    }

    public float obtenerPrecio(Producto producto){
        return producto.getPrecio();
    }

    public int cantCombo(Combo combo){
        return combo.getCaracteristicas().size();
    }

    public List<String> obtenerCaracteristicas(Producto producto){
        return producto.getCaracteristicas();
    }

    public List<Producto> filtrarProductos(List<Filtro> filtros){
        FiltroCompuesto filtroCompuesto = new FiltroCompuesto(filtros);
        List<Producto> res = new ArrayList<>();
        for(Producto producto: productos){
            res.addAll(producto.filtrar(filtroCompuesto));
        }
        return res;
    }

    public List<Producto> obtenerCopia(List<Filtro> filtros){
        FiltroCompuesto filtroCompuesto = new FiltroCompuesto(filtros);
        List<Producto> res = new ArrayList<>();
        for(Producto producto: productos){
            res.addAll(producto.copia(filtroCompuesto));
        }
        return res;
    }
}
