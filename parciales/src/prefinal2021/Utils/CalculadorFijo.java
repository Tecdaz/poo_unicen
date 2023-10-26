package prefinal2021.Utils;

public class CalculadorFijo implements CalculadorPoliza{
    private int montoFijo;

    public CalculadorFijo(int montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public float calcular(int montoAsegurado) {
        return montoFijo;
    }
}
