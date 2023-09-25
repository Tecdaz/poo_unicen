package ejercicio1;

public class Proceso implements Comparable<Proceso>{
    private final int memoriaRequerida;

    public Proceso(int memoriaRequerida){
        this.memoriaRequerida = memoriaRequerida;
    }

    public int getMemoriaRequerida() {
        return memoriaRequerida;
    }

    @Override
    public int compareTo(Proceso p){
        return this.memoriaRequerida - p.getMemoriaRequerida();
    }

    @Override
    public String toString(){
        return "Memoria requerida: " + getMemoriaRequerida();
    }

}
