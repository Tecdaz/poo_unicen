import java.time.LocalDate;

public class Camion extends ObjetoComparable{
    private int id;
    private LocalDate fecha;

    public Camion(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public boolean esMenor(ObjetoComparable ob) {
        return this.getFecha().isBefore(((Camion)ob).getFecha());
    }
}
