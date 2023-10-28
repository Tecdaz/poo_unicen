package recu2021.Filter;

import recu2021.Model.Elemento;

public class DestinoIgual implements Filtro{
    private String destino;

    public DestinoIgual(String destino) {
        this.destino = destino;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getDestino().equals(destino);
    }
}
