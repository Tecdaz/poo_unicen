package prefinal2021.Filter;

import prefinal2021.Model.Seguro;

public class MontoMayor implements Filter{
    private int monto;

    public MontoMayor(int monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getMontoAsegurado()>monto;
    }
}
