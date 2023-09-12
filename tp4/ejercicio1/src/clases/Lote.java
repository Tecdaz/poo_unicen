package clases;
import java.util.Set;

public class Lote {
    private int superficie;
    private Set<String> minerales;

    public Lote(int superficie, Set<String> minerales) {
        this.superficie = superficie;
        this.minerales = minerales;
    }

    public Set<String> getMinerales() {
        return minerales;
    }

    public boolean esEspecial(Set<String> mineralesObjetivo){
        return minerales.containsAll(mineralesObjetivo);
    }

    public int getSuperficie(){
        return superficie;
    }
}
