public class CentroDeComputos {
    private ColaPrioridad compus;
    private ColaPrioridad procesos;

    public CentroDeComputos(ColaPrioridad compus, ColaPrioridad procesos){
        this.compus = compus;
        this.procesos = procesos;
    }

    public void asignarProceso(Proceso proceso){
        if(!compus.colaVacia()){
            Computadora compuDesignada = (Computadora) compus.sacarPrimero();
            compuDesignada.setProcesoActivo(proceso);
        }else{
            procesos.add(proceso);
        }
    }
}
