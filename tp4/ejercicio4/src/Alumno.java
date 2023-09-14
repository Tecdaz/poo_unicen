import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<String> cualidades;
    private Casa casa;
    private ArrayList<Alumno> familiares;
    private boolean perteneceACasa;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<String>();
        this.familiares = new ArrayList<Alumno>();
        this.perteneceACasa = false;
    }

    public void addCualidad(String cualidad) {
        cualidades.add(cualidad);
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = new ArrayList<String>(cualidades);
    }

    public List<String> getCualidades() {
        return cualidades;
    }


    public Casa getCasa() {
        return casa;
    }

    public boolean perteneceACasa() {
        return perteneceACasa;
    }

    public void addFamiliar(Alumno familiar) {
        familiares.add(familiar);
    }

    public ArrayList<Alumno> getFamiliares() {
        return new ArrayList<Alumno>(familiares);
    }

    public String getNombre() {
        return nombre;
    }


    public void setCualidades(List<String> cualidades) {
        this.cualidades = cualidades;
    }

    public void setCasa(Casa casa) {
        this.perteneceACasa = true;
        this.casa = casa;
    }

    public void setFamiliares(ArrayList<Alumno> familiares) {
        this.familiares = familiares;
    }
}
