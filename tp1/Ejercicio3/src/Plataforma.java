import java.util.Vector;

public class Plataforma {
    private Vector<Serie> series;

    public Plataforma() {
        this.series = new Vector<Serie>();
        inicializar();
    }

    private void inicializar() {
        Serie serie1 = new Serie("Breaking Bad", "chupame la pija", "walter white", "suspenso");
        Serie serie2 = new Serie("GOT", "un nn", "jjj", "asdf");
        Serie serie3 = new Serie("The Office", "asdfasdf", "asdfasdf", "asdfasdf");

        serie1.agregarEpisodio(new Episodio("episodio 1", "episodio 1", 3));
        serie1.agregarEpisodio(new Episodio("episodio 3", "episodio 1", 2));
        serie1.agregarEpisodio(new Episodio("episodio 6", "episodio 1", 2));
        serie1.agregarEpisodio(new Episodio("episodio 7", "episodio 1", 1));

        serie2.agregarEpisodio(new Episodio("episodio 1", "episodio 1", 3));
        serie2.agregarEpisodio(new Episodio("episodio 3", "episodio 1", 2));
        serie2.agregarEpisodio(new Episodio("episodio 6", "episodio 1", 2));
        serie2.agregarEpisodio(new Episodio("episodio 7", "episodio 1", 1));

        serie3.agregarEpisodio(new Episodio("episodio 1", "episodio 1", 3));
        serie3.agregarEpisodio(new Episodio("episodio 3", "episodio 1", 2));
        serie3.agregarEpisodio(new Episodio("episodio 6", "episodio 1", 2));
        serie3.agregarEpisodio(new Episodio("episodio 7", "episodio 1", 1));

        series.add(serie1);
        series.add(serie2);
        series.add(serie3);
    }

    public float promedioSerie(String nombre) {
        for (Serie serie : series) {
            if (nombre == serie.getNombre()) {
                return serie.promedioSerie();
            }
        }
        System.out.println("No se encontro la serie " + nombre + ".");
        return -1;
    }
}
