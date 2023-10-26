package prefinal2021.Model;

import prefinal2021.Utils.CalculadorPoliza;

import java.time.LocalDate;

public class SeguroDecremental extends SeguroSimple{
    private LocalDate fechaInicio;
    public SeguroDecremental(int nroPoliza, String descripcion, int montoAsegurado, int DNI, LocalDate fechaInicio, CalculadorPoliza calculadorPoliza) {
        super(nroPoliza, descripcion, montoAsegurado, DNI, calculadorPoliza);
        this.fechaInicio = fechaInicio;
    }

    @Override
    public int getMontoAsegurado() {
        int diffAnios = LocalDate.now().getYear() - fechaInicio.getYear();
        if(diffAnios == 0){
            return super.getMontoAsegurado();
        }
        return super.getMontoAsegurado()/diffAnios;
    }
}
