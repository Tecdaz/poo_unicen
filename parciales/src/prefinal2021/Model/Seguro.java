package prefinal2021.Model;

import prefinal2021.Filter.Filter;

import java.util.List;

public interface Seguro {
    public int getDNI();
    public int getMontoAsegurado();
    public int getNroPoliza();
    public String getDescripcion();
    public float calcularCosto();
    public List<Seguro> filtrar(Filter filter);
}
