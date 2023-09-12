package clases.cereales;

import clases.Lote;


import java.util.Set;

public abstract class Cereal {
    private String nombre;
    private Set<String> requerimientos;
    public Cereal(String nombre, Set<String> requerimientos) {
        this.nombre = nombre;
        this.requerimientos = requerimientos;
    }

    public boolean cumpleRequisitos(Lote lote){
        return lote.getMinerales().containsAll(requerimientos);
    }
}
