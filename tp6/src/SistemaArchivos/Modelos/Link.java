package SistemaArchivos.Modelos;

public class Link extends Elemento{
    private Elemento referencia;

    public Link(String nombre, Elemento referencia) {
        super(nombre);
        this.referencia = referencia;
    }

    public Elemento getReferencia() {
        return referencia;
    }

    public void setReferencia(Elemento nuevo){
        referencia = nuevo;
    }

    @Override
    public float getTamanio() {
        return 1;
    }

    public String toString(){
        return super.toString() + " Link";
    }
}
