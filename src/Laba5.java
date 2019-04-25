import java.util.ArrayList;

public class Laba5 {
    public static void main(String[] args) {
        final String replaceWord = "nya";
        final int replaceNum = 3;
        Text text = new Text("It's a beautiful day outside... Birds are singing... Okay, that's all!");

        ArrayList<Object> wordsOrPuncts = text.getWordsOrPuncts();
        for (Object i : wordsOrPuncts) {
            if (i instanceof Word) {
                Word word = (Word) i;
                if (word.getLetters().length == replaceNum) {
                    System.out.print(replaceWord);
                } else {
                    System.out.print(i);
                }
            } else {
                System.out.print(i);
            }
            int i_index = wordsOrPuncts.indexOf(i);
            if (i_index != wordsOrPuncts.size() - 1) {
                if (wordsOrPuncts.get(i_index + 1) instanceof Word) {
                    System.out.print(" ");
                }
            }
        }
    }
}