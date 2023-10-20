package CorreoPostal.Filtros;

import CorreoPostal.Modelos.Envio;

public interface Filtro {
    public boolean cumple(Envio envio);
}
