import java.util.ArrayList;

public class Laba5 {
    public static void main(String[] args) {
        final String replaceWord = "nya";
        final int replaceNum = 3;
        Text text = new Text("It's a beautiful day outside... Birds are singing... Okay, that's all!");
        text.changeWord(replaceNum, replaceWord);
        System.out.print(text);
    }
}