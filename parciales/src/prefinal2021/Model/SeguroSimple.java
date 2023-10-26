package prefinal2021.Model;

import prefinal2021.Filter.Filter;
import prefinal2021.Utils.CalculadorPoliza;

import java.util.ArrayList;
import java.util.List;

public class SeguroSimple implements Seguro{
    private int nroPoliza;
    private String descripcion;
    private int montoAsegurado;
    private int DNI;
    private CalculadorPoliza calculadorPoliza;

    public SeguroSimple(int nroPoliza, String descripcion, int montoAsegurado, int DNI, CalculadorPoliza calculadorPoliza) {
        this.nroPoliza = nroPoliza;
        this.descripcion = descripcion;
        this.montoAsegurado = montoAsegurado;
        this.DNI = DNI;
        this.calculadorPoliza = calculadorPoliza;
    }

    @Override
    public String getDescripcion(){
        return descripcion;
    }

    public void setCalculadorPoliza(CalculadorPoliza calculadorPoliza){
        this.calculadorPoliza = calculadorPoliza;
    }

    @Override
    public float calcularCosto() {
        return calculadorPoliza.calcular(montoAsegurado);
    }

    @Override
    public List<Seguro> filtrar(Filter filter) {
        List<Seguro> res = new ArrayList<>();
        if (filter.cumple(this)){
            res.add(this);
        }
        return res;
    }

    @Override
    public int getDNI() {
        return DNI;
    }

    @Override
    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    @Override
    public int getNroPoliza() {
        return nroPoliza;
    }
}
