package clases.cereales;

import clases.Lote;

import java.util.Set;

public class Pastura extends Cereal{
    public Pastura(String nombre, Set<String> requerimientos) {
        super(nombre, requerimientos);
    }

    @Override
    public boolean cumpleRequisitos(Lote lote) {
        return super.cumpleRequisitos(lote) && lote.getSuperficie() >= 50;
    }
}

