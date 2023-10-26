package Utils;

import Model.Paragraph;

import java.util.HashMap;

public class TranslatorEnglish extends Translator{
    //keys are words from different idioms
    //Values are words of their translation
    private String language = "english";
    HashMap<String, String> words = new HashMap<>();
    public TranslatorEnglish(){
        super();
    }
}
