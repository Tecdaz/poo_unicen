package ServidorPaginasWeb.Modelos;

public class Imagen extends MiembroPagina {
    private float alto;
    private float ancho;

    public Imagen(float tamanio) {
        super(tamanio);
        this.alto = tamanio;
        this.ancho = tamanio;

    }

    @Override
    public float getPeso(){
        return alto * ancho;
    }

    @Override
    public void modificarTamanio(float escala){
        super.modificarTamanio(escala);
        this.alto = alto*escala;
        this.ancho = ancho*escala;
    }
}