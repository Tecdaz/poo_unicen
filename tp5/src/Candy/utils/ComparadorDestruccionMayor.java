package Candy.utils;

import Candy.Ficha;

public class ComparadorDestruccionMayor extends ComparadorFicha{
    public ComparadorDestruccionMayor(int limite){
        super(limite);
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return (ficha.getDestruccion() > getLimite());
    }
}
