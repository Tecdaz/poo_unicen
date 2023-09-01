public class AlarmaLuminosa extends Alarma{
    private Luz luz = new Luz();

    public AlarmaLuminosa() {
    }

    public void comprobar() {
        super.comprobar();
        if(vidrioRoto || puertaAbierta || movimiento) {
            luz.encender();
        }
    }
}
