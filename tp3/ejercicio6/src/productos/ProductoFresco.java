package productos;

public class ProductoFresco extends Producto{
    private String fechaEnvasado;
    private String granjaOrigen;

    public ProductoFresco(String nombre, String fechaVencimiento, int numeroLote, String fechaEnvasado, String granjaOrigen) {
        super(nombre, fechaVencimiento, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public String etiqueta(){
        String result = "";
        result += super.etiqueta();
        result += "Fecha envasado: " + fechaEnvasado + "\n";
        result += "Granja origen: " + granjaOrigen + "\n";
        return result;
    }
}
