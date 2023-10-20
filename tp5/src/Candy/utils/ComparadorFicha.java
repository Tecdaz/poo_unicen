package Candy.utils;

import Candy.Ficha;

public abstract class ComparadorFicha {
    private int limite;
    public ComparadorFicha(int limite){
        this.limite = limite;
    }

    public int getLimite(){
        return limite;
    }
    public abstract boolean filter(Ficha ficha);
}
