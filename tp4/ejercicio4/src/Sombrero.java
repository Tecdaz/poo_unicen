import java.util.ArrayList;

public class Sombrero {
    private ArrayList<Casa> casas;
    private ArrayList<Alumno> alumnos;

    public Sombrero(ArrayList<Casa> casas, ArrayList<Alumno> alumnos) {
        this.casas = casas;
        this.alumnos = alumnos;
    }

    public void repartir() {
        for (Alumno alumno : alumnos) {
            for (Casa casa : casas) {
                if (casa.esAceptado(alumno)) {
                    casa.addAlumno(alumno);
                    alumno.setCasa(casa);
                    break;
                }
            }
        }
    }
}
