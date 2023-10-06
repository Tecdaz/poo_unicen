package Candy.utils;

import Candy.Ficha;

public class ComparadorEspacioMayor extends ComparadorFicha{
    public ComparadorEspacioMayor(int limite){
        super(limite);
    }

    public boolean cumple(Ficha ficha){
        return (ficha.getEspacioOcupado() > getLimite());
    }
}
