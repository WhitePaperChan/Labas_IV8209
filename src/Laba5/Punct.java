package Laba5;

public class Punct extends SentenceElems{
    static String punct_symbols = "!?.,:;";
    private String punctString;
    Punct(String punct_symb){
        punctString = punct_symb;
    }
    public String toString(){
        return punctString;
    }
}
