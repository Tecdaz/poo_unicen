import java.util.Vector;

public class Serie {
    private final String nombre;
    private String descripcion;
    private String creador;
    private String genero;
    private Vector<Episodio> episodios;

    public Serie(String nombre, String descripcion, String creador, String genero) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.episodios = new Vector<Episodio>();
    }

    public void agregarEpisodio(Episodio episodio){
        episodios.add(episodio);
    }

    public float promedioSerie(){
        int sumatoria = 0;
        int contadorEpisodios = 0;
        float promedio = 0f;
        for(Episodio episodio:episodios){
            if (episodio.getCalificacion()>=1){
                contadorEpisodios++;
                sumatoria+=episodio.getCalificacion();
            }
        }
        promedio = (float) sumatoria /contadorEpisodios;
        return promedio;
    }

    public Vector<Episodio> episodiosPorTemporada(int temporada){
        Vector<Episodio> resultado = new Vector<Episodio>();
        for(Episodio episodio:episodios){
            if (episodio.getTemporada() == temporada && episodio.estaVisto()){
                resultado.add(episodio);
            }
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public int episodiosVistos(){
        int result = 0;
        for (Episodio episodio:episodios){
            if (episodio.estaVisto()){
                result++;
            }
        }
        return result;
    }

    public boolean estanTodosVistos(){
        return episodiosVistos() == episodios.size();
    }
}
