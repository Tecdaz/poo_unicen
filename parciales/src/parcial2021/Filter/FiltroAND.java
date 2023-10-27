package parcial2021.Filter;

public class FiltroAND implements Filtro{
    Filtro f1;
    Filtro f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Object o) {
        return f1.cumple(o) && f2.cumple(f2);
    }
}
