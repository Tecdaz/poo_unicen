public class Computadora extends ObjetoComparable{
    private int id;
    private boolean estaLibre;
    private Proceso procesoActivo;
    private int velocidad;

    public Computadora(int id, Proceso procesoActivo, int velocidad) {
        this.id = id;
        this.procesoActivo = procesoActivo;
        this.velocidad = velocidad;
        this.estaLibre = false;
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
