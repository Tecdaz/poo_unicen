package prefinal2021.Utils;

import java.util.ArrayList;
import java.util.List;

public class CalculadorCompuesto implements CalculadorPoliza{
    List<CalculadorPoliza> calculadores = new ArrayList<>();
    public CalculadorCompuesto(List<CalculadorPoliza> calculadores){
        this.calculadores = calculadores;
    }
    @Override
    public float calcular(int montoAsegurado) {
        float res = 0f;
        for(CalculadorPoliza calculador: calculadores){
            res += calculador.calcular(montoAsegurado);
        }
        return res;
    }

    public void addCalculador(CalculadorPoliza calculadorPoliza){
        calculadores.add(calculadorPoliza);
    }
}
