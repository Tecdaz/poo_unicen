package parcial2020.Filter;

public class FilterAnd implements Filter{
    Filter f1;
    Filter f2;

    public FilterAnd(Filter f1, Filter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Object o) {
        return f1.cumple(o) && f2.cumple(o);
    }
}
