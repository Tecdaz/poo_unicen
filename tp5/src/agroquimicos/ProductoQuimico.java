package agroquimicos;

import java.util.HashSet;
import java.util.List;

public class ProductoQuimico{
    private String nombre;
    private List<Cultivo> cultivosDesaconsejados;
    private List<String> estadosPatologicos;

    public ProductoQuimico(String nombre, List<Cultivo> cultivosDesaconsejados, List<String> estadosPatologicos){
        this.nombre = nombre;
        this.cultivosDesaconsejados = cultivosDesaconsejados;
        this.estadosPatologicos = estadosPatologicos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Cultivo> getCultivosDesaconsejados() {
        return cultivosDesaconsejados;
    }

    public List<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }

    public boolean trataEnfermedad(Enfermedad enfermedad) {
        List<String> estadosPatologicosQuimico = getEstadosPatologicos();
        return (new HashSet<>(estadosPatologicosQuimico).containsAll(enfermedad.getEstadosPatologicos()));
    }

    @Override
    public String toString(){
        return nombre;
    }
}
