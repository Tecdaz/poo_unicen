import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductoQuimico{
    private String nombre;
    private List<String> cultivos_desaconsejados;
    private List<String> estados_patologicos;

    public ProductoQuimico(String nombre, ArrayList<String> cultivos_desaconsejados, ArrayList<String> estados_patologicos){
        this.nombre = nombre;
        this.cultivos_desaconsejados = cultivos_desaconsejados;
        this.estados_patologicos = estados_patologicos;
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<String> getCultivosDesaconsejados(){
        return new ArrayList<String>(this.cultivos_desaconsejados);
    }

    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<String>(this.estados_patologicos);
    }

    public boolean puedeTratarEnfermedad(Enfermedad enfermedad){
        return getEstadosPatologicos().containsAll(enfermedad.getEstadosPatologicos());
    }

    @Override
    public boolean equals(Object obj) {
        ProductoQuimico o = (ProductoQuimico) obj;
        if (getNombre() != o.getNombre()){
            return false;
        }
        if (!(getCultivosDesaconsejados().equals(o.getCultivosDesaconsejados()))){
            return false;
        }
        if (!(getEstadosPatologicos().equals(o.getEstadosPatologicos()))){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre, cultivos_desaconsejados, estados_patologicos);
    }
}