public class Proceso extends ObjetoComparable{
    private int id;
    private int memoriaRequerida;

    public Proceso(int id, int memoriaRequerida) {
        this.id = id;
        this.memoriaRequerida = memoriaRequerida;
    }

    public int getId() {
        return id;
    }

    public int getMemoriaRequerida() {
        return memoriaRequerida;
    }

    @Override
    public boolean esMenor(ObjetoComparable ob) {
        return this.getMemoriaRequerida() < ((Proceso) ob).getMemoriaRequerida();
    }
}
