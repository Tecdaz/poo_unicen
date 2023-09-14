import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto(barcos(), camiones());
        CentroDeComputos centroDeComputos = new CentroDeComputos(compus(), new ColaPrioridad());
        ColaPrioridad procesos = procesos();
        puerto.asignar();
        centroDeComputos.asignarProceso((Proceso) procesos.sacarPrimero());
        
    }
    
    public static ColaPrioridad camiones(){
        ColaPrioridad camiones = new ColaPrioridad();
        for (int i = 0; i < 5; i++){
            camiones.add(new Camion(i, LocalDate.of(2000, 8, i+1)));
        }
        return camiones;
    }
    
    public static ColaPrioridad barcos(){
        ColaPrioridad barcos = new ColaPrioridad();
        for (int i = 0; i < 5; i++){
            barcos.add(new Barco(i, i*100));
        }
        return barcos;
    }
    public static ColaPrioridad compus(){
        ColaPrioridad compus = new ColaPrioridad();
        for (int i = 0; i < 5; i++){
            compus.add(new Computadora(i, i*100));
        }
        return compus;
    }
    public static ColaPrioridad procesos(){
        ColaPrioridad procesos = new ColaPrioridad();
        for (int i = 0; i < 5; i++){
            procesos.add(new Proceso(i, i*200));
        }
        return procesos;
    }
}
