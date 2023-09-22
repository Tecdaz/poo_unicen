import java.util.ArrayList;
import java.util.List;

public class Cultivo{
    private final String nombre;
    private final List<Enfermedad> enfermedades;

    public Cultivo(String nombre, ArrayList<Enfermedad> enfermedades) {
        this.nombre = nombre;
        this.enfermedades = enfermedades;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Enfermedad> getEnfermedades() {
        return new ArrayList<Enfermedad>(this.enfermedades);
    }

    public boolean esDeUtilidad(ProductoQuimico producto) {
        if (producto.getCultivosDesaconsejados().contains(this.nombre)) {
            return false; //Caso donde el producto no es aconsejable con ese quimico
        }
        for (Enfermedad enfermedad : enfermedades) {
            if (producto.puedeTratarEnfermedad(enfermedad)) {
                return true; //Caso en el que el producto trata al menos una enfermedad
            }
        }
        return false; //Caso en el que es producto no cumple ninguna opcion para ser viable
    }

    @Override
    public boolean equals(Object obj) {
        return (getNombre() == ((Cultivo) obj).getNombre());
    }
}