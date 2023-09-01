package productosCongelados;
import productos.ProductoCongelado;

public class ProductoCongeladoNitrogeno extends ProductoCongelado{
    private String metodoCongelacion;
    private int tiempoExposicion;

    public ProductoCongeladoNitrogeno(String nombre, String fechaVencimiento, int numeroLote, String fechaEnvasado, String granjaOrigen, int organismoSupervision, float temperaturaRecomendada, String metodoCongelacion, int tiempoExposicion) {
        super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, organismoSupervision, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String etiqueta(){
        String result = super.etiqueta();
        result+= "Metodo empleado: " + metodoCongelacion + "\n";
        result += "Tiempo de exposicion al nitrogeno: " + tiempoExposicion + " segundos\n";
        return result;
    }
}
