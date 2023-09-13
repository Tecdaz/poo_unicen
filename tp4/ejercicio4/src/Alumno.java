import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<String> cualidades;
    private Casa casa;
    private boolean perteneceACasa;
    private ArrayList<Alumno> familiares;

    public Alumno(String nombre){
        this.nombre = nombre;
        this.cualidades = new ArrayList<String>();
        this.familiares = new ArrayList<Alumno>();
        this.perteneceACasa = false;
    }

    public void addCualidad(String cualidad){
        cualidades.add(cualidad);
    }

    public void addFamiliares(Alumno familiar){
        familiares.add(familiar);
    }

    public ArrayList<Alumno> getFamiliares(){
        return new ArrayList<Alumno>(familiares);
    }

    public ArrayList<String> getHabilidades(){
        return new ArrayList<String>(cualidades);
    }

    public String getNombre(){
        return nombre;
    }
}
