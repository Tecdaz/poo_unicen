public class EmpleadoExtra extends Empleado{
    private int precioHoraExtra;
    private int horasExtras;
    public EmpleadoExtra(String nombre, int salario, int precioHoraExtra){
        super(nombre, salario);
        this.precioHoraExtra = precioHoraExtra;
    }

    public int getSalario(){
        return super.getSalario() + precioHoraExtra * horasExtras;
    }

    public void setPrecioHoraExtra(int precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
}
