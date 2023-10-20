package CorreoPostal.Modelos;

public abstract class Envio {

    private String destinatario;
    private String direccionDestinatario;
    private String remitente;
    private String direccionRemitente;
    private boolean retiraSucursal;
    private int tracking;

    public Envio(boolean retiraSucursal, int tracking) {
        this.retiraSucursal = retiraSucursal;
        this.tracking = tracking;
    }

    public abstract float getPeso();

    public int getTracking(){
        return tracking;
    }

    public void setTracking(int nuevo){
        this.tracking = nuevo;
    };

    public String getDireccionDestinatario(){
        return direccionDestinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public boolean isRetiraSucursal() {
        return retiraSucursal;
    }

    public void setRetiraSucursal(boolean retiraSucursal) {
        this.retiraSucursal = retiraSucursal;
    }
}
