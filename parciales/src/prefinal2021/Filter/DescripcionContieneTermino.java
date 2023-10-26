package prefinal2021.Filter;

import prefinal2021.Model.Seguro;

public class DescripcionContieneTermino implements Filter{
    private String termino;

    public DescripcionContieneTermino(String termino) {
        this.termino = termino;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDescripcion().contains(termino);
    }
}
