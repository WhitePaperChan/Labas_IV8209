import com.sun.corba.se.spi.ior.ObjectKey;
import javafx.concurrent.WorkerStateEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sentence {
    private ArrayList<Object> wordsOrPuncts = new ArrayList<>();
    private String sentenceString;
    public Sentence(String sentence_rare){
        sentenceString = sentence_rare;
        String [] sentence_split = sentenceString.split("(?=[" + Punct.punct_symbols + "])| ");
        for(String i : sentence_split){
            if (Punct.punct_symbols.contains(i)){
                wordsOrPuncts.add(new Punct(i));
            } else {
                wordsOrPuncts.add(new Word(i));
            }
        }
    }
    public String toString(){ return sentenceString; }
    public ArrayList<Object> getWordsOrPuncts(){
        return wordsOrPuncts;
    }
    public ArrayList<Word> getWords(){
        ArrayList<Word> words = new ArrayList<>();
        for (Object i: wordsOrPuncts){
            if (i instanceof Word){
                words.add((Word) i);
            }
        }
        return words;
    }
    public ArrayList<Symbol> getLetters(){
        ArrayList<Symbol> letters = new ArrayList<>();
        for (Word i: this.getWords()){
            letters.addAll(Arrays.asList(i.getLetters()));
        }
        return letters;
    }
    public ArrayList<Punct> getPuncts(){
        ArrayList<Punct> puncts = new ArrayList<>();
        for (Object i : wordsOrPuncts){
            if (i instanceof Punct){
                puncts.add((Punct) i);
            }
        }
        return puncts;
    }
}
