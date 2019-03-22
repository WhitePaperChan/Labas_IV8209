import java.util.ArrayList;
import java.util.List;

public class Laba2 {
    void error(){
        System.out.println("A x B is impossible");
        System.exit(0);
    }
    public static void main(String[] args) {
        //8209 C5 = 4 C7 = 5 C11 = 3
        Laba2 error_call = new Laba2();
        int i, j, k, trans;
        char A[][] = {
                {10, 2, 3},
                {2, 4, 5},
                {3, 5, 4}};
        char B[][] = {
                {10, 4},
                {3, 10},
                {3, 4}
        };
        List<ArrayList<Character>> C = new ArrayList<ArrayList<Character>>();
        char sum = 0;
        for (i = 1; i < A.length; i++){
            if (A[0].length != A[i].length){
                error_call.error();
            }
        }
        for (i = 1; i < B.length; i++){
            if (B[0].length != B[i].length){
                error_call.error();
            }
        }
        if (B.length != A[0].length){
            error_call.error();
        }
        System.out.println("C (A x B):");
        for (i=0; i < A.length; i++) {
            int max = Integer.MIN_VALUE;
            C.add(new ArrayList<Character>());
            for (j = 0; j < B[0].length; j++) {
                char elem = 0;
                for (k = 0; k < B[0].length; k++) {
                    elem += A[i][k] * B[j][k];
                }
                C.get(i).add(elem);
                trans = elem;//C.get(i).get(j);
                System.out.print(elem + " (" + trans + ") ");
                if (max < elem){
                    max = elem;
                }
            }
            System.out.println();
            sum += max;
        }
        trans = sum;
        System.out.println("Сума найбільших елементів у рядку:\n" + sum + " (" + trans + ")");
    }
}
