package productos;

public class ProductoRefrigerado extends ProductoFresco{
    private int organismoSupervision;
    private float temperaturaRecomendada;

    public ProductoRefrigerado(String nombre, String fechaVencimiento, int numeroLote, String fechaEnvasado, String granjaOrigen, int organismoSupervision, float temperaturaRecomendada) {
        super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen);
        this.organismoSupervision = organismoSupervision;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String etiqueta(){
        String result = super.etiqueta();
        result += "Organismo de supervicion(codigo): " + organismoSupervision + "\n";
        result += "Temperatura recomendada: " + temperaturaRecomendada + " grados\n";
        return result;
    }
}
