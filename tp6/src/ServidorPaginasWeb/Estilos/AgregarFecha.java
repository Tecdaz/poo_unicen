package ServidorPaginasWeb.Estilos;

import ServidorPaginasWeb.Modelos.Pagina;
import ServidorPaginasWeb.Modelos.Parrafo;

import java.time.LocalDate;

public class AgregarFecha implements Transformacion{
    public AgregarFecha() {
    }

    @Override
    public Pagina transformar(Pagina pagina) {
        Pagina res = pagina.copia();
        int size = pagina.getMiembros().size();
        LocalDate fecha = LocalDate.now();
        res.agregarMiembro(new Parrafo(fecha.toString(), 12), size);
        return res;
    }
}
