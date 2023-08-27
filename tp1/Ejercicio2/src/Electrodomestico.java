public class Electrodomestico {
    private String nombre;
    private float precioBase;
    private String color = "gris plata";
    private float consumo;
    private float peso;

    public Electrodomestico() {
        this.color = "gris plata";
        this.consumo = 10f;
        this.precioBase = 100f;
        this.peso = 2f;
    }

    public boolean esBajoConsumo() {
        return consumo < 45;
    }

    public float balance() {
        return precioBase / peso;
    }

    public boolean esAltaGama() {
        return balance() > 3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
