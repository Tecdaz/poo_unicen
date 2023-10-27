package parcial2021.Filter;

public class FiltroNOT implements Filtro{
    Filtro filtro;

    public FiltroNOT(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Object o) {
        return !filtro.cumple(o);
    }
}
