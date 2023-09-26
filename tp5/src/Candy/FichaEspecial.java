package Candy;

public class FichaEspecial extends Ficha{
    public FichaEspecial(String nombre, int fortaleza, int espacioOcupado, int destruccion) {
        super(nombre, fortaleza, espacioOcupado, destruccion);
    }

    public int getDestruccion() {
        return getFortaleza()/getEspacioOcupado();
    }
}
