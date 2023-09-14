public class CasaPura extends Casa{
public CasaPura(String nombre, int capacidad) {
        super(nombre, capacidad);
    }

    @Override
    public boolean esAceptado(Alumno alumno) {
        if(super.esAceptado(alumno)){
            for(Alumno familiar : alumno.getFamiliares()){
                if (familiar.getCasa().getNombre() == this.getNombre()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
