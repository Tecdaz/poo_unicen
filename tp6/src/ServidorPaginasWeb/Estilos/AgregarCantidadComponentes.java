package ServidorPaginasWeb.Estilos;

import ServidorPaginasWeb.Modelos.Pagina;
import ServidorPaginasWeb.Modelos.Parrafo;

public class AgregarCantidadComponentes implements Transformacion{
    public AgregarCantidadComponentes() {
    }


    @Override
    public Pagina transformar(Pagina pagina) {
        Pagina res = pagina.copia();
        int size = res.getMiembros().size();
        int cantidad = size;
        cantidad += res.getLinks().size();
        res.agregarMiembro(new Parrafo(Integer.toString(cantidad), 12),size );
        return res;
    }
}
