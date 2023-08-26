import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
    private final int dni;
    private Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");
    private int edad;
    private String sexo = "femenino";
    private String nombre = "N";
    private String apellido = "N";
    private float peso = 1.0f;
    private float altura = 1.0f;


    public Persona(int dni) throws ParseException {
        this.dni = dni;
        this.edad = edad();
    }

    public int getDni() {
        return dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double imc() {
        return peso / Math.pow(altura, 2);
    }

    public boolean estaEnForma() {
        double calculoImc = this.imc();

        return calculoImc >= 18.5 && calculoImc <= 25;
    }

    public boolean cumpleAnios() {
        int mesActual = new Date().getMonth();
        int mesNacimiento = fechaNacimiento.getMonth();

        if (mesNacimiento == mesActual) {
            int diaActual = new Date().getDay();
            int diaNacimiento = fechaNacimiento.getDay();

            return diaNacimiento == diaActual;
        }
        return false;
    }

    private int edad() {
        long tiempoNacimiento = fechaNacimiento.getTime();
        long tiempoActual = new Date().getTime();
        long diferencia = tiempoActual - tiempoNacimiento + 93600000;
//      Suma una diferencia de 26 horas


        Date periodo = new Date(diferencia);
        int edadCalculada = periodo.getYear() - 70;
        System.out.println(edadCalculada);
        return edadCalculada;
    }

    public boolean mayorDeEdad() {
        return edad() >= 18;
    }

    public boolean puedeVotar() {
        return edad() >= 16;
    }

    public boolean esCoherente(){
        return edad() == edad;
    }
    public String mostraInformacion() {
        String data = "Nombre: " + nombre + "\n";
        data += "Apellido: " + apellido + "\n";
        data+= "Edad: " + edad + "\n";
        data+= "DNI: " + dni + "\n";
//        Formato fecha
        String fecha = DateFormat.getDateInstance(DateFormat.SHORT).format(fechaNacimiento);
        data+= "Fecha de nacimiento: " + fecha + "\n";
        data+= "Sexo: " + sexo + "\n";
        data+= "Peso: " + peso + "\n";
        data += "Altura: " + altura + "\n";
        return data;
    }
}
