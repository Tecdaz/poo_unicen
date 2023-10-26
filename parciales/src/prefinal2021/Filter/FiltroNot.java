package prefinal2021.Filter;

import prefinal2021.Model.Seguro;

public class FiltroNot implements Filter{
    Filter filter;

    public FiltroNot(Filter filter) {
        this.filter = filter;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return !filter.cumple(seguro);
    }
}
