public class Alarma {

    protected boolean vidrioRoto = false;
    protected boolean puertaAbierta = false;
    protected boolean movimiento = false;
    private Timbre timbre = new Timbre();

    public Alarma() {
    }

    public void comprobar() {
        if (vidrioRoto || puertaAbierta || movimiento) {
            timbre.hacerSonar();
        }
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }
}
