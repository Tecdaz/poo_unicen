public class Computadora extends ObjetoComparable{
    private int id;
    private boolean estaLibre;
    private Proceso procesoActivo;
    private int velocidad;

    public Computadora(int id, int velocidad) {
        this.id = id;
        this.velocidad = velocidad;
        this.estaLibre = true;
    }

    public int getId() {
        return id;
    }

    public boolean estaLibre() {
        return estaLibre;
    }

    public Proceso getProcesoActivo() {
        return procesoActivo;
    }

    public void setProcesoActivo(Proceso procesoActivo) {
        this.procesoActivo = procesoActivo;
        this.estaLibre = false;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean esMenor(ObjetoComparable ob) {
        return this.getVelocidad() < ((Computadora)ob).getVelocidad();
    }
}
