package recu2021.Model;

import recu2021.Filter.DestinoIgual;
import recu2021.Filter.Filtro;

import java.time.LocalDate;

public class Egresados extends Contingente{
    public Egresados(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso) {
        super(nombre, destino, fechaPartida, fechaRegreso);
        addCondicion(new DestinoIgual("Bariloche"));
    }

    @Override
    public void addCondicion(Filtro filtro) {
    }
}
