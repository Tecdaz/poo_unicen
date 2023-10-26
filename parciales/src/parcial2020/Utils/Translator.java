package parcial2020.Utils;

import java.util.HashMap;

public class Translator {
    HashMap<String, String> words = new HashMap<>();
    private String language = "";
    public Translator(){
    }

    public void addWord(String word, String translation){
        words.put(word, translation);
    }

    public String translate(String text) {
        if (words.get(text) != null) {
            return words.get(text);
        }
        return "ERROR";
    }

    public String getLanguage() {
        return language;
    }

}
