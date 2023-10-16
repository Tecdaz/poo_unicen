package Candy.utils;

import Candy.Ficha;

public class ComparadorEspacio extends ComparadorFicha{
    public ComparadorEspacio(int limite){
        super(limite);
    }

    public boolean filter(Ficha ficha){
        return (ficha.getEspacioOcupado() > getLimite());
    }
}
