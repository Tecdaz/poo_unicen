package Model;

import Utils.Translator;
import Utils.TranslatorEnglish;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends Article{
    private List<String> content = new ArrayList<>();
    private boolean isMutable = true;

    public Paragraph(String title, String language,String content) {
        super(title, language);
        this.content.addAll(List.of(content.split(" ")));
    }

    public void setMutable(boolean value) {
        this.isMutable = value;
    }

    @Override
    public int cantWords() {
        return content.size();
    }

    @Override
    public Article translate(Translator translator) {
        if (!isMutable){
            return new Paragraph(getTittle(), getLanguage(), content.toString());
        }
        String res = "";
        if(translator.getLanguage() != "english" && getLanguage() != "english"){
            TranslatorEnglish english = new TranslatorEnglish();
            for(String word:content){
                res = res.concat(translator.translate(english.translate(word)));
            }
            return new Paragraph(getTittle(), translator.getLanguage(), res);
        }
        for(String word:content){
            res = res.concat(translator.translate(word));
        }
        return new Paragraph(getTittle(), translator.getLanguage(), res);
    }
}
