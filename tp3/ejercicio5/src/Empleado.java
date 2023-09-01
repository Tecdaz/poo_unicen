public class Empleado{
    private int salarioFijo;
    private String nombre;

    public Empleado(String nombre, int salarioFijo){
        this.nombre = nombre;
        this.salarioFijo = salarioFijo;
    }

    public int getSalario(){
        return salarioFijo;
    };
}
