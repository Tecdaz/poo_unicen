import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int capacidad;
    private ArrayList<Alumno> alumnos;
    private ArrayList<String> habilidadesRequeridas;
    private ArrayList<Casa> enemistades;

    public Casa(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.alumnos = new ArrayList<Alumno>();
        this.habilidadesRequeridas = new ArrayList<String>();
        this.enemistades = new ArrayList<Casa>();
    }
    public boolean esAceptado(Alumno alumno){
        if(capacidad == alumnos.size()){
            return false;
        }
        if (!(habilidadesRequeridas.containsAll(alumno.getHabilidades()))){
            return false;
        }
        boolean tieneFamiliares = true;
        for(Alumno familiar: alumno.getFamiliares()){

        }
    }
    public void addAlumno(Alumno alumno){
    }



}
