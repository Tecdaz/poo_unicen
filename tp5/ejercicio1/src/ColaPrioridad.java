import java.util.ArrayList;

public class ColaPrioridad {
    private ArrayList<ObjetoComparable> elementos = new ArrayList<ObjetoComparable>();

    public ColaPrioridad() {
    }

    public boolean colaVacia(){
        return elementos.isEmpty();
    }

    public ObjetoComparable obtenerPrimero(){
        return elementos.get(0);
    }

    public ObjetoComparable sacarPrimero(){
        return elementos.remove(0);
    }

    public void add(ObjetoComparable o){
        int i = 0;
        while (i < elementos.size() && o.esMenor(elementos.get(i))){
            i ++;
        }
        if (i < elementos.size()){
            elementos.add(i, o);
        }else {
            elementos.add(o);
        }
    }
}
