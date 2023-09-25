package agroquimicos;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Cultivo {
    private String nombre;
    private List<Enfermedad> enfermedades;

    public Cultivo(String nombre, List<Enfermedad> enfermedades){
        this.nombre = nombre;
        this.enfermedades = enfermedades;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public boolean esApto(ProductoQuimico quimico){
        if(quimico.getCultivosDesaconsejados().contains(this)){
            return false;
        }
        for(Enfermedad enfermedad: enfermedades){
            if (quimico.trataEnfermedad(enfermedad)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cultivo)) return false;
        Cultivo cultivo = (Cultivo) o;
        return Objects.equals(nombre, cultivo.nombre);
    }
}
