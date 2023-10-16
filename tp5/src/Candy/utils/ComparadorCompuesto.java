package Candy.utils;

import Candy.Ficha;

import java.util.ArrayList;
import java.util.List;

public class ComparadorCompuesto extends ComparadorFicha {
    private List<ComparadorFicha> comparadores;
    public ComparadorCompuesto(int limite, ArrayList<ComparadorFicha> comparadores){
        super(limite);
        this.comparadores = new ArrayList<>(comparadores);
    }

    @Override
    public boolean filter(Ficha ficha) {
        for (ComparadorFicha comparador: comparadores){
            if(!comparador.filter(ficha)){
                return false;
            }
        }
        return true;
    }
}
