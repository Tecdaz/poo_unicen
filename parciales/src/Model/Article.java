package Model;

import Utils.Translator;
import Utils.TranslatorEnglish;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private String tittle;
    private String language;
    private List<Article> content = new ArrayList<>();

    public Article(String tittle, String language){
        this.tittle = tittle;
        this.language = language;
    }

    public void addContent(Article article){
        content.add(article);
    }

    public String getLanguage(){
        return language;
    }

    public int cantWords(){
        int res = 0;
        for(Article article: content){
            res+= article.cantWords();
        }
        return res;
    }

    public String getTittle(){
        return tittle;
    }
    public Article translate(Translator translator){
        Article res = new Article(tittle, translator.getLanguage());
        if(translator.getLanguage() != "english" && getLanguage() != "english"){
            Article resEnglish = new Article(tittle, "english");
            TranslatorEnglish english = new TranslatorEnglish();
            for(Article article:content){
                resEnglish.addContent(article.translate(english));
            }
            return resEnglish.translate(translator);
        }
        for(Article article:content){
            res.addContent(article.translate(translator));
        }
        return res;
    }
}
