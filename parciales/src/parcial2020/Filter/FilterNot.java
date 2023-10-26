package parcial2020.Filter;

public class FilterNot implements Filter{
    Filter f1;

    public FilterNot(Filter f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Object o) {
        return !f1.cumple(o);
    }
}
