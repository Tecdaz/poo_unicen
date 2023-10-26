package parcial2020.Filter;

import parcial2020.Model.Paragraph;

public class FilterLanguage implements Filter{
    String language;

    public FilterLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean cumple(Object o) {
        Paragraph paragraph = (Paragraph)o;
        return paragraph.getLanguage().equals(language);
    }
}
