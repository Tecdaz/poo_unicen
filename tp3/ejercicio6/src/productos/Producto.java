package productos;

public class Producto {
    private String nombre;
    private String fechaVencimiento;
    private int numeroLote;


    public Producto(String nombre, String fechaVencimiento, int numeroLote) {
        this.fechaVencimiento = fechaVencimiento;
        this.numeroLote = numeroLote;
        this.nombre = nombre;
    }

    public String etiqueta(){
        String result = "";
        result += "Nombre: " + this.nombre + "\n";
        result += "Fecha vencimiento: " + this.fechaVencimiento + "\n";
        result += "Numero lote" + this.numeroLote + "\n";
        return result;
    }
}

























