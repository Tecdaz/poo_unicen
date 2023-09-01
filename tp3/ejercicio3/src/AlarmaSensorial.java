import java.util.ArrayList;
import java.util.List;

public class AlarmaSensorial extends Alarma{
    private List<Sensor> sensores = new ArrayList<Sensor>();

    private final Timbre timbre = new Timbre();

    public AlarmaSensorial() {
    }

    public void comprobar(){
        for(Sensor sensor: sensores){
            if(sensor.isActivo()){
                timbre.hacerSonar();
                System.out.println("Sector: " + sensor.getNombre());
            }
        }
    }

    public void addSensor(String nombre){
        sensores.add(new Sensor(nombre));
    }
}
