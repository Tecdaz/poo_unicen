package Candy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Tablero tablero = new Tablero(fillTablero(), 20);

       System.out.println("Fichas con poder de destruccion mayor a 2:");
       for(Ficha ficha: tablero.getDestruccionMayor(2)){
           System.out.println(ficha + "\n");
       }

       System.out.println("Fichas que ocupan mas de 4 lugares:");
       for(Ficha ficha: tablero.getEspacioMayor(4)){
           System.out.println(ficha + "\n");
       }

       System.out.println("Fichas con fortaleza mayor a 5:");
       for(Ficha ficha: tablero.getFortalezaMayor(5)){
           System.out.println(ficha + "\n");
       }
    }

    public static ArrayList<Ficha> fillTablero(){
        ArrayList<Ficha> fichas= new ArrayList<>();
        fichas.add(new Ficha("chocolate", 1, 1,0));
        fichas.add(new Ficha("piedra", 6, 1,0));
        fichas.add(new Ficha("caramelo a rayas", 1, 1,10));
        fichas.add(new Ficha("torta", 8, 4,4));
        fichas.add(new FichaEspecial("rainbow", 6, 4,0));
        return fichas;
    }
}
