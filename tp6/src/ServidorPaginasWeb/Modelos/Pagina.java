package ServidorPaginasWeb.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Pagina {
    private List<MiembroPagina> miembros;
    private List<Pagina> links;

    public Pagina() {
    }

    public Pagina copia(){
        return this;
    }

    public int getPeso(){
        int sum = 0;
        for(MiembroPagina miembroPagina: miembros){
            sum += miembroPagina.getPeso();
        }
        for(Pagina pagina:links){
            sum += pagina.getPeso();
        }
        return sum;
    }
    public List<MiembroPagina> getMiembros(){
        return new ArrayList<>(miembros);
    }

    public List<MiembroPagina> getLinks(){
        return new ArrayList<>(miembros);
    }
    public void agregarMiembro(MiembroPagina miembroPagina, int index){
        miembros.add(index, miembroPagina);
    }
}