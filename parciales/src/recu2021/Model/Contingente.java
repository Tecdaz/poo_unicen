package recu2021.Model;

import recu2021.Filter.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contingente extends Elemento{
    private List<Elemento> contingentes;
    private List<Filtro> condiciones;

    public Contingente(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaRegreso) {
        super(nombre, destino, fechaPartida, fechaRegreso);
        this.contingentes = new ArrayList<>();
    }

    public List<Filtro> getCondiciones(){
        return new ArrayList<>(condiciones);
    }

    public void addContingente(Elemento contingente){
        boolean agregar = true;
        for(Filtro filtro: getCondiciones()){
            if(!filtro.cumple(contingente)){
                agregar = false;
                break;
            }
        }
        if (agregar){
            contingentes.add(contingente);
        }
    }

    public void addCondicion(Filtro filtro){
        condiciones.add(filtro);
    }

    @Override
    public float getPrecio() {
        float sum = 0;
        for(Elemento elemento: contingentes){
            sum += elemento.getPrecio();
        }
        return sum;
    }

    @Override
    public float getDeuda() {
        float sum = 0;
        for(Elemento elemento: contingentes){
            sum += elemento.getDeuda();
        }
        return sum;
    }

    @Override
    public int cantAlumnos() {
        int cant = 0;
        for(Elemento elemento:contingentes){
            cant += elemento.cantAlumnos();
        }
        return cant;
    }

    @Override
    public Elemento alumnoMayorDeuda() {
        Elemento res = null;
        for(Elemento elemento:contingentes){
            Elemento candidato = elemento.alumnoMayorDeuda();
            if(candidato != null){
                if(res == null){
                    res = elemento;
                }else{
                    if(candidato.getDeuda() > res.getDeuda()){
                        res = candidato;
                    }
                }
            }
        }
        return res;
    }

    @Override
    public Elemento copia() {
        Contingente copia = new Contingente(getNombre(), getDestino(), getFechaPartida(), getFechaRegreso());
        for(Elemento elemento:contingentes){
            copia.addContingente(elemento.copia());
        }
        return copia;
    }

    @Override
    public List<Elemento> buscar(Filtro filtro) {
        List<Elemento> res = new ArrayList<>();
        if (filtro.cumple(this)){
            res.add(this);
            return res;
        }
        for(Elemento elemento:contingentes){
            res.addAll(elemento.buscar(filtro));
        }
        return res;
    }
}
