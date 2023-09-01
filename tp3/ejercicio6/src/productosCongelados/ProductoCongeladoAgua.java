package productosCongelados;
import productos.ProductoCongelado;

public class ProductoCongeladoAgua extends ProductoCongelado{
    private int salididad;

    public ProductoCongeladoAgua(String nombre, String fechaVencimiento, int numeroLote, String fechaEnvasado, String granjaOrigen, int organismoSupervision, float temperaturaRecomendada, int salididad) {
        super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, organismoSupervision, temperaturaRecomendada);
        this.salididad = salididad;
    }

    public String etiqueta(){
        String result = super.etiqueta();
        result += "Salinidad: " + salididad + " gramos de sal por litro de agua.\n";
        return result;
    }
}
