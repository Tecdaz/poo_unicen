package ServidorPaginasWeb.Estilos;

import ServidorPaginasWeb.Modelos.Pagina;
import ServidorPaginasWeb.Modelos.Parrafo;

public class AgregarPesoFinalPagina implements Transformacion {

    public AgregarPesoFinalPagina() {
    }

    @Override
    public Pagina transformar(Pagina pagina) {
        Pagina res = pagina.copia();
        int size = pagina.getMiembros().size();
        res.agregarMiembro(new Parrafo(Float.toString(pagina.getPeso()), 12), size);
        return res;
    }
}
