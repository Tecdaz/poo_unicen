public class Puerto{
    private ColaPrioridad barcos;
    private ColaPrioridad camiones;

    public Puerto(ColaPrioridad barcos, ColaPrioridad camiones) {
        this.barcos = barcos;
        this.camiones = camiones;
    }

    public void asignar(){
        while (!camiones.colaVacia()){
            if(!barcos.colaVacia()){
                Camion camion = (Camion)camiones.sacarPrimero();
                Barco barco = (Barco) barcos.sacarPrimero();
                barco.cargar();
                System.out.println("Barco nro "+ barco.getId() + " cargado con camion nro "+camion.getId()+". ");
            }
            else{
                System.out.println("No hay barcos suficientes");
                break;
            }
        }
    }
}
