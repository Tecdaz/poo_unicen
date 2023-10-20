package CorreoPostal.Modelos;

public class Comun extends Envio{
    private float peso;

    public Comun(boolean retiraSucursal, float peso, int tracking) {
        super(retiraSucursal, tracking);
        this.peso = peso;
    }

    @Override
    public float getPeso(){
        return peso;
    }
}
