package CorreoPostal.Modelos;

import CorreoPostal.Filtros.Filtro;
import CorreoPostal.Filtros.FiltroCiudadIgual;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Envio{
    List<Envio> envios = new ArrayList<>();
    public Combo(boolean retiraSucursal,int tracking) {
        super(retiraSucursal, tracking);
    }

    @Override
    public float getPeso() {
        float res = 0;
        for(Envio envio: envios){
            res += envio.getPeso();
        }
        return res;
    }

    @Override
    public void setTracking(int nuevo){
        super.setTracking(nuevo);
        for(Envio envio: envios){
            envio.setTracking(this.getTracking());
        }
    }

    public void addEnvio(Envio envio){
        if (envios.isEmpty()){
            setDestinatario(envio.getDestinatario());
            setRemitente(envio.getRemitente());
            setDireccionRemitente(envio.getDireccionRemitente());
            setDireccionDestinatario(envio.getDireccionDestinatario());
        }

        Filtro ciudad = new FiltroCiudadIgual(this.getDireccionDestinatario());
        if(ciudad.cumple(envio)){
            envio.setTracking(this.getTracking());
            envios.add(envio);
        }
    }
}
