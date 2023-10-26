package prefinal2021.Model;

import prefinal2021.Filter.Filter;

import java.util.ArrayList;
import java.util.List;

public class SeguroIntegrador implements Seguro{
    private int DNI;
    private List<Seguro> seguros = new ArrayList<>();
    public SeguroIntegrador(int DNI, List<Seguro> seguros){
        this.DNI = DNI;
        this.seguros = seguros;
    }

    @Override
    public int getDNI() {
        return DNI;
    }

    @Override
    public int getMontoAsegurado() {
        int suma = 0;
        for(Seguro seguro: seguros){
            suma += seguro.getMontoAsegurado();
        }
        return suma;
    }

    @Override
    public int getNroPoliza() {
        int mayor = 0;
        for(Seguro seguro: seguros){
            int polizaSeguro = seguro.getNroPoliza();
            if (polizaSeguro > mayor){
                mayor = polizaSeguro;
            }
        }
        return mayor;
    }

    @Override
    public String getDescripcion() {
        String res = "";
        for(Seguro seguro:seguros){
            res = res.concat(seguro.getDescripcion());
        }
        return res;
    }

    @Override
    public float calcularCosto() {
        float costo = 0f;
        for(Seguro seguro: seguros){
            costo += seguro.calcularCosto();
        }
        return costo;
    }

    @Override
    public List<Seguro> filtrar(Filter filter) {
        List<Seguro> res = new ArrayList<>();
        for(Seguro seguro: seguros){
            res.addAll(seguro.filtrar(filter));
        }
        return res;
    }

}
