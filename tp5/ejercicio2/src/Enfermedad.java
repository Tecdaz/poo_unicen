import java.util.ArrayList;
import java.util.List;

public class Enfermedad{
    private String nombre;
    private List<String> estados_patologicos;

    public Enfermedad(String nombre, ArrayList<String> estados_patologicos){
        this.nombre = nombre;
        this.estados_patologicos = estados_patologicos;
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<String>(this.estados_patologicos);
    }

    @Override
    public boolean equals(Object obj) {
        return (getNombre() == ((Cultivo) obj).getNombre());
    }
    
}