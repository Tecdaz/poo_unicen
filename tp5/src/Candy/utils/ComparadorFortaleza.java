package Candy.utils;

import Candy.Ficha;

public class ComparadorFortaleza extends ComparadorFicha{
    public ComparadorFortaleza(int limite){
        super(limite);
    }

    @Override
    public boolean filter(Ficha ficha) {
        return (ficha.getFortaleza() > getLimite());
    }
}
