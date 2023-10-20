package SistemaArchivos.Modelos;

import java.util.List;

public class ArchivoComprimido extends Directorio{
    private float tasaCompresion;

    public ArchivoComprimido(String nombre, float tasaCompresion, List<Elemento> elementos) {
        super(nombre, elementos);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public float getTamanio() {
        return super.getTamanio() * tasaCompresion;
    }

    public String toString(){
        return super.toString() + " ArchComprimido";
    }
}
