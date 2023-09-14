import java.util.ArrayList;
import java.util.HashSet;

public class Casa {
    private String nombre;
    private int capacidad;
    private ArrayList<Alumno> alumnos;
    private ArrayList<String> habilidadesRequeridas;


    public Casa(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.alumnos = new ArrayList<Alumno>();
        this.habilidadesRequeridas = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esAceptado(Alumno alumno) {
        if (capacidad == alumnos.size()) {
            return false;
        }
        if(alumno.perteneceACasa()){
            return false;
        }
        return new HashSet<>(alumno.getCualidades()).containsAll(habilidadesRequeridas);
    }

    public void addAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
}
