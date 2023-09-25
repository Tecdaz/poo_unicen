package ejercicio1;

import utils.ColaPrioridad;

import java.util.ArrayList;
import java.util.Collection;

public class CentroComputo{

    private ColaPrioridad colaComputadoras;
    private ColaPrioridad colaProcesos;

    public CentroComputo(){
        this.colaComputadoras = new ColaPrioridad();
        this.colaProcesos = new ColaPrioridad();
    }

    public void agregarComputadora(Computadora c){
        if(colaProcesos.isEmpty()){
            colaComputadoras.add(c);
        }else {
            colaProcesos.popFirst();
            Proceso proceso = (Proceso) colaProcesos.getFirst();
            atenderProceso(proceso, c);
        }
    }

    private void atenderProceso(Proceso p, Computadora c){
        System.out.println("Corriendo proceso" + p + " en computadora " + c);
    }

    public void agregarProceso(Proceso p){
        boolean success = false;
        for(int i = 0; i < colaComputadoras.getSize(); i++){
            Computadora computadora = (Computadora) colaComputadoras.get(i);
            if (computadora.getMemoria() >= p.getMemoriaRequerida()){
                colaComputadoras.remove(i);
                atenderProceso(p, computadora);
                success = true;
                break;
            }
        }
        if (!success){
            colaProcesos.add(p);
        }
    }
    public static void main(String[] args) {
        CentroComputo centroComputo = new CentroComputo();
        // Agregar computadoras
        centroComputo.agregarComputadora(new Computadora(4, 2));
        centroComputo.agregarComputadora(new Computadora(8, 4));
        centroComputo.agregarComputadora(new Computadora(16, 8));
        centroComputo.agregarComputadora(new Computadora(32, 16));
        centroComputo.agregarComputadora(new Computadora(64, 32));
        // Agregar procesos
        centroComputo.agregarProceso(new Proceso(1));
        centroComputo.agregarProceso(new Proceso(2));
        centroComputo.agregarProceso(new Proceso(4));
        centroComputo.agregarProceso(new Proceso(8));
        centroComputo.agregarProceso(new Proceso(16));
        centroComputo.agregarProceso(new Proceso(32));
        centroComputo.agregarProceso(new Proceso(64));
        centroComputo.agregarProceso(new Proceso(128));
        centroComputo.agregarProceso(new Proceso(256));
        centroComputo.agregarProceso(new Proceso(512));
    }

}

