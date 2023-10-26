package prefinal2021.Filter;

import prefinal2021.Model.Seguro;

public class DNIIgual implements Filter{
    private float DNI;

    public DNIIgual(float DNI) {
        this.DNI = DNI;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDNI() == DNI;
    }
}
