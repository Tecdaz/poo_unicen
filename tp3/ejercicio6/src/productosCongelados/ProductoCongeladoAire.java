package productosCongelados;
import productos.ProductoCongelado;

public class ProductoCongeladoAire extends ProductoCongelado{
    private float nitrogeno;
    private float oxigeno;
    private float co2;
    private float vaporAgua;

    public ProductoCongeladoAire(String nombre, String fechaVencimiento, int numeroLote, String fechaEnvasado, String granjaOrigen, int organismoSupervision, float temperaturaRecomendada, float nitrogeno, float oxigeno, float co2, float vaporAgua) {
        super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, organismoSupervision, temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.co2 = co2;
        this.vaporAgua = vaporAgua;
    }

    public String etiqueta(){
        String result = super.etiqueta();
        result += "Composicion:\n";
        result += nitrogeno+"% nitrogeno\n";
        result += oxigeno+"% oxigeno\n";
        result += co2+"% CO2\n";
        result += vaporAgua+"% vapor de agua\n";
        return result;
    }
}
