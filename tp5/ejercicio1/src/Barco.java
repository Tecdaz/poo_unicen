public class Barco extends ObjetoComparable{
    private int id;
    private int capacidad;
    private boolean estaLibre = false;

    public Barco(int id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void cargar(){
        estaLibre = false;
    }

    @Override
    public boolean esMenor(ObjetoComparable ob) {
        return this.capacidad < ((Barco) ob).getCapacidad();
    }
}
