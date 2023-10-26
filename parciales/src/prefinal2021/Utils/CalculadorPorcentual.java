package prefinal2021.Utils;

public class CalculadorPorcentual implements CalculadorPoliza{
    private float porcentaje;

    public CalculadorPorcentual(float porcentaje){
        this.porcentaje = porcentaje/100;
    }
    @Override
    public float calcular(int montoAsegurado) {
        return montoAsegurado*porcentaje;
    }
}
