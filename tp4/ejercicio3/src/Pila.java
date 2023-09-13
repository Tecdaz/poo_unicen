import java.util.ArrayList;
import java.util.List;

public class Pila {

    private List<Object> elementos;
    private int size;

    public Pila(){
        elementos = new ArrayList<>();
        size = 0;
    }

    public void push(Object o){
        elementos.add(o);
        size ++;
    }

    public Object pop(){
        Object o = elementos.get(size - 1);
        elementos.remove(size - 1);
        size --;
        return  o;
    }

    public Object top(){
        return elementos.get(size - 1);
    }

    public int size(){
        return size;
    }

    public Pila copy(){
        Pila copia = new Pila();
        for(Object elemento: elementos){
            copia.push(elemento);
        }
        return copia;
    }

    public Pila reverse(){
        Pila reversa = new Pila();
        for(int i = size-1; i >= 0; i--){
            reversa.push(elementos.get(i));
        }
        return reversa;
    }
}
