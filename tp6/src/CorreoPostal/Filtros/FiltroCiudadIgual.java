package CorreoPostal.Filtros;

import CorreoPostal.Modelos.Envio;

public class FiltroCiudadIgual implements Filtro{
    private String nombre;

    public FiltroCiudadIgual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Envio envio) {
        return (this.nombre).equals(envio.getDireccionDestinatario());
    }
}
