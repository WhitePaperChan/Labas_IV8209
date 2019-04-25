import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.SynchronousQueue;

public class Text {
    private ArrayList<Sentence> sentences = new ArrayList<>();
    private String textString;
    public Text(String text_rare){
        textString = text_rare;
        String [] text_split = textString.split("(?<=[.!?]) ");
        for (String i: text_split) {
            sentences.add(new Sentence(i));
        }
    }
    public String toString(){
        return textString;
    }
    public ArrayList<Sentence> getSentences(){
        return sentences;
    }
    public ArrayList<Object> getWordsOrPuncts(){
        ArrayList<Object> wordsOrPuncts = new ArrayList<>();
        for (Sentence i:sentences){
            wordsOrPuncts.addAll(i.getWordsOrPuncts());
        }
        return wordsOrPuncts;
    }
    public ArrayList<Word> getWords(){
        ArrayList<Word> words = new ArrayList<>();
        for (Sentence i: sentences){words.addAll(i.getWords());
        }
        return words;
    }
    public ArrayList<Symbol> getLetters(){
        ArrayList<Symbol> letters = new ArrayList<>();
        for (Sentence i: sentences){
            letters.addAll(i.getLetters());
        }
        return letters;
    }
    public ArrayList<Punct> getPuncts(){
        ArrayList<Punct> puncts = new ArrayList<>();
        for (Sentence i: sentences){
            puncts.addAll(i.getPuncts());
        }
        return puncts;
    }
}
