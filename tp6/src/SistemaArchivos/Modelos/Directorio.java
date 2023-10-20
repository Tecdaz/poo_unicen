package SistemaArchivos.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Elemento{
    private List<Elemento> elementos = new ArrayList<>();

    public Directorio(String nombre, List<Elemento> elementos){
        super(nombre);
        this.elementos = elementos;
    }

    @Override
    public float getTamanio() {
        float res = 0;
        for(Elemento elemento: elementos){
            res += elemento.getTamanio();
        }
        return res;
    }

    public int getCantidad(){
        return elementos.size();
    }

    public String toString(){
        return super.toString() + " Directorio";
    }
}
