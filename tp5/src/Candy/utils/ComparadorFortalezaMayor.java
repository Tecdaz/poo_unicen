package Candy.utils;

import Candy.Ficha;

public class ComparadorFortalezaMayor extends ComparadorFicha{
    public ComparadorFortalezaMayor(int limite){
        super(limite);
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return (ficha.getFortaleza() > getLimite());
    }
}
