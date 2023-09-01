public class EmpleadoComision extends Empleado{
    private float comisionPorVenta;

    public void setComisionPorVenta(float comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    private int numeroVentas;

    public EmpleadoComision(String nombre, int salario, float comisionPorVenta){
        super(nombre, salario);
        this.comisionPorVenta = comisionPorVenta;
    }

    public int getSalario(){
        return super.getSalario() + (int)(comisionPorVenta * numeroVentas);
    }
}
