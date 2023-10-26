package prefinal2021.Filter;

import prefinal2021.Model.Seguro;

public class FiltroAND implements Filter{
    Filter f1;
    Filter f2;

    public FiltroAND(Filter f1, Filter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }


    @Override
    public boolean cumple(Seguro seguro) {
        return f1.cumple(seguro) && f2.cumple(seguro);
    }
}
