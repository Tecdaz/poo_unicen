package ejercicio1;

public class Computadora implements Comparable<Computadora>{
    private final int memoria;
    private final int velocidadComputo;

    public Computadora(int memoria, int velocidadComputo){
        this.memoria = memoria;
        this.velocidadComputo = velocidadComputo;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getVelocidadComputo() {
        return velocidadComputo;
    }


    @Override
    public int compareTo(Computadora c) {
        return this.velocidadComputo - c.getVelocidadComputo();
    }

    @Override
    public String toString(){
        return "Memoria: " + getMemoria() + " Velocidad: " + getVelocidadComputo();
    }
}
