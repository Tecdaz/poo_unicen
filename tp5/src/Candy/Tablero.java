package Candy;

import Candy.utils.ComparadorDestruccion;
import Candy.utils.ComparadorEspacio;
import Candy.utils.ComparadorFicha;
import Candy.utils.ComparadorFortaleza;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private int puntajeMinimo = 0;
    private int dificultad = 0;
    private List<Ficha> fichas;

    public Tablero(List<Ficha> fichas, int puntajeMinimo){
        this.fichas = fichas;
        this.puntajeMinimo = puntajeMinimo;
        this.dificultad = getDificultad();
    }

    private int fortalezaTotal(){
        int sumatoria = 0;
        for(Ficha ficha: fichas){
            sumatoria += ficha.getFortaleza();
        }
        return sumatoria;
    }

    private int destruccionTotal(){
        int sumatoria = 0;
        for(Ficha ficha: fichas){
            sumatoria += ficha.getDestruccion();
        }
        return sumatoria;
    }

    public int getDificultad(){
        return fortalezaTotal()/destruccionTotal();
    }

    public void addFicha(Ficha ficha){
        this.fichas.add(ficha);
    }

    public ArrayList<Ficha> getFichas(){
        return new ArrayList<>(this.fichas);
    }

    private ArrayList<Ficha> cumplen(ComparadorFicha comparador){
        ArrayList<Ficha> result = new ArrayList<>();
        for(Ficha ficha:fichas){
            if(comparador.filter(ficha)){
                result.add(ficha);
            }
        }
        return result;
    }

    public ArrayList<Ficha> getDestruccionMayor(int limite){
        return cumplen(new ComparadorDestruccion(limite));
    }

    public ArrayList<Ficha> getEspacioMayor(int limite){
        return cumplen(new ComparadorEspacio(limite));
    }

    public ArrayList<Ficha> getFortalezaMayor(int limite){
        return cumplen(new ComparadorFortaleza(limite));
    }
}

