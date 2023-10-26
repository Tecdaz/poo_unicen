package prefinal2021.Model;

import prefinal2021.Filter.Filter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeguroTransitorio implements Seguro{
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Seguro seguro;

    public SeguroTransitorio(LocalDate fechaInicio, LocalDate fechaFin, Seguro seguro) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.seguro = seguro;
    }

    @Override
    public int getDNI() {
        return seguro.getDNI();
    }

    private boolean enFecha(){
        int anioActual = LocalDate.now().getYear();
        return anioActual >= fechaInicio.getYear() && anioActual <= fechaFin.getYear();
    }

    @Override
    public int getMontoAsegurado() {
        if(enFecha()){
            return seguro.getMontoAsegurado();
        }
        return 0;
    }

    @Override
    public int getNroPoliza() {
        return seguro.getNroPoliza();
    }

    @Override
    public String getDescripcion() {
        return seguro.getDescripcion();
    }

    @Override
    public float calcularCosto() {
        if (enFecha()){
            return seguro.calcularCosto();
        }
        return 0;
    }

    @Override
    public List<Seguro> filtrar(Filter filter) {
        List<Seguro> res = new ArrayList<>();
        if(enFecha()){
            res.addAll(seguro.filtrar(filter));
        }
        return res;
    }

}
