package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ColaPrioridad{
    private ArrayList elementos;

    public ColaPrioridad(){
        elementos = new ArrayList<>();
    }

    public int getSize(){
        return elementos.size();
    }

    public boolean isEmpty(){
        return elementos.isEmpty();
    }

    public void add(Comparable o){
        boolean success = false;
        for (int i = 0; i < elementos.size(); i++){
            if (o.compareTo(elementos.get(i)) > 0){
                elementos.add(i,o);
                success = true;
                break;
            }
        }
        if (!success){
            elementos.add(o);
        }
    }

    public Object getFirst(){
        return elementos.get(0);
    }

    public void popFirst(){
        elementos.remove(0);
    }

    public Object remove(int index){
        return elementos.remove(index);
    }

    public Object get(int index){
        return elementos.get(index);
    }
}
