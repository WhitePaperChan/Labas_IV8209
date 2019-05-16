package Laba5;

import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> sentences = new ArrayList<>();
    public Text(String text_rare){
        String [] text_split = text_rare.split("(?<=[.!?]) ");
        for (String i: text_split) {
            sentences.add(new Sentence(i));
        }
    }
    public String toString(){
        StringBuilder string = new StringBuilder();
        ArrayList<Object> wordsOrPuncts = this.getWordsOrPuncts();
        for (Object i: wordsOrPuncts){
            string.append(i.toString());
            int index = wordsOrPuncts.indexOf(i);
            if (index != wordsOrPuncts.size() - 1){
                if (wordsOrPuncts.get(index + 1) instanceof Word){
                    string.append(" ");
                }
            }
        }
        return string.toString();
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

    public void changeWord(int replaceNum, String replaceWord){
        for(Sentence i: sentences){
            i.changeWord(replaceNum, replaceWord);
        }
    }

}
