package Candy.utils;

import Candy.Ficha;

import java.util.ArrayList;
import java.util.List;

public class ComparadorCompuesto{
    private List<ComparadorFicha> comparadores;
    public ComparadorCompuesto(ArrayList<ComparadorFicha> comparadores){
        this.comparadores = new ArrayList<>(comparadores);
    }

    public boolean cumple(Ficha ficha) {
        for (ComparadorFicha comparador: comparadores){
            if(!comparador.cumple(ficha)){
                return false;
            }
        }
        return true;
    }
}
