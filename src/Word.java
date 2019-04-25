public class Word {
    private Symbol [] symbols;
    private String wordString;
    Word(String word_rare){
        //Symbol [] symbols;
        wordString = word_rare;
        String [] word_split = wordString.split("");
        symbols = new Symbol[word_split.length];
        for(int i = 0; i < word_split.length; i++){
            symbols[i] = new Symbol(word_split[i]);
        }
    }
    public String toString(){
        return wordString;
    }
    public Symbol [] getLetters(){
        return symbols;
    }
}
