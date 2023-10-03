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
    public int filter(Ficha ficha) {
        for (ComparadorFicha comparador: comparadores){
            if()
        }
    }
}
