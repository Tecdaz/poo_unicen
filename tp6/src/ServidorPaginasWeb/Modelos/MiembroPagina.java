package ServidorPaginasWeb.Modelos;

public abstract class MiembroPagina {
    private float tamanio;
    public MiembroPagina(float tamanio){
        this.tamanio = tamanio;
    }

    public abstract float getPeso();
    public void modificarTamanio(float escala){
        tamanio = tamanio * escala;
    };

    public float getTamanio(){
        return tamanio;
    }

}
