package Candy.utils;

import Candy.Ficha;

public class ComparadorFortaleza extends ComparadorFicha{
    public ComparadorFortaleza(int limite){
        super(limite);
    }

    @Override
    public int filter(Ficha ficha) {
        return (ficha.getFortaleza() - getLimite());
    }
}
