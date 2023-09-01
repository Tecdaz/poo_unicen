package productos;

public abstract class ProductoCongelado extends ProductoRefrigerado{
    public ProductoCongelado(String nombre, String fechaVencimiento, int numeroLote, String fechaEnvasado, String granjaOrigen, int organismoSupervision, float temperaturaRecomendada) {
        super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, organismoSupervision, temperaturaRecomendada);
    }

    public String etiqueta(){
        return super.etiqueta();
    };
}
