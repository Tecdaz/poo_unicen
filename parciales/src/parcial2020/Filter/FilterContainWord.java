package parcial2020.Filter;

import parcial2020.Model.Paragraph;

import java.util.List;

public class FilterContainWord implements Filter{
    String word;
    public FilterContainWord(String word){
        this.word = word;
    }

    @Override
    public boolean cumple(Object o) {
        Paragraph paragraph = (Paragraph)o;
        List<String> words = paragraph.getContent();
        return words.contains(word);
    }
}
