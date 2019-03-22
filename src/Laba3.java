import java.util.Arrays;
import java.util.Scanner;

public class Laba3 {
    String check(String text, String symbol, int len, String replace){
        if (text.indexOf(symbol) == text.length() - 1){
            if (text.length() == len + 1) {
                text = replace + symbol;
            } else {
                text += "+";
            }
        }
        return text;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer("Lorem! ipsum? dolor sit amet, consectetur adipiscing elit. Duis matti. kisds: sdfsa;");
        String text_str = new String(text);
        String[] words = text_str.split(" ");
        String[] symbols = {".", ",", "!", "?", ":", ";"};
        String point = new String(".");
        Laba3 s_check = new Laba3();
        int len = 5;

        System.out.println("Text: " + text);
        System.out.println("How long word have to be?");
        if (scanner.hasNextInt()){
            len = scanner.nextInt();
        } else {
            System.out.println("It's not an integer. Standard length - 5.");
            scanner.next();
        }
        System.out.println("Replace word with length " + len + " to:");
        String replace = scanner.next();
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < symbols.length; j++){
                words[i] = s_check.check(words[i], symbols[j], len, replace);
            }
            if (words[i].indexOf("+") == words[i].length() - 1){
                StringBuffer word = new StringBuffer(words[i]);
                word.deleteCharAt(word.length() - 1);
                System.out.print(word + " ");
            } else if (words[i].length() == len){
                System.out.print(replace + " ");
            } else {
                System.out.print(words[i] + " ");
            }
        }
    }
}
