package Candy;

import Candy.utils.ComparadorCompuesto;
import Candy.utils.ComparadorFicha;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<Ficha> fichas;

    public Tablero(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public List<Ficha> filtrar(ArrayList<ComparadorFicha> comparadores){
        ComparadorCompuesto comparadorCompuesto = new ComparadorCompuesto(comparadores);
        List<Ficha> resultados = new ArrayList<>();
        for (Ficha ficha: fichas){
            if(comparadorCompuesto.cumple(ficha)){
                resultados.add(ficha);
            }
        }
        return resultados;
    }
}
