package parcial2021.Filter;

import java.util.List;

public class FiltroCompuesto implements Filtro{
    private List<Filtro> filtros;

    public FiltroCompuesto(List<Filtro> filtros) {
        this.filtros = filtros;
    }

    @Override
    public boolean cumple(Object o) {
        for (Filtro filtro: filtros){
            if (!filtro.cumple(o)){
                return false;
            }
        }
        return true;
    }
}
