package Candy.utils;

import Candy.Ficha;

public class ComparadorDestruccion extends ComparadorFicha{
    public ComparadorDestruccion(int limite){
        super(limite);
    }

    @Override
    public boolean filter(Ficha ficha) {
        return (ficha.getDestruccion() > getLimite());
    }
}
