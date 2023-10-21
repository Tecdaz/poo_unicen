package ServidorPaginasWeb.Modelos;

public class Parrafo extends MiembroPagina{
    private String contenido;

    public Parrafo(String contenido, float tamanio) {
        super(tamanio);
        this.contenido = contenido;
    }

    @Override
    public float getPeso() {
        return contenido.length()*getTamanio();
    }
}
