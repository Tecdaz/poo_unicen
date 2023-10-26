package parcial2020.Filter;

import parcial2020.Model.Paragraph;

public class FilterContieneCantidadMenor implements Filter{
    private int limit;
    public FilterContieneCantidadMenor(int limit){
        this.limit = limit;
    }

    @Override
    public boolean cumple(Object o) {
        Paragraph paragraph = (Paragraph)o;
        return paragraph.cantWords() < limit;
    }
}
