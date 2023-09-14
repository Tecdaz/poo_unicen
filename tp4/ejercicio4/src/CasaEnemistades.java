import java.util.ArrayList;

public class CasaEnemistades extends Casa{
    private ArrayList<Casa> enemistades;

    public CasaEnemistades(String nombre, int capacidad, ArrayList<Casa> enemistades) {
        super(nombre, capacidad);
        this.enemistades = enemistades;
    }

    @Override
    public boolean esAceptado(Alumno alumno) {
        if(super.esAceptado(alumno)){
            for(Casa casa : enemistades){
                if (casa.esAceptado(alumno)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
