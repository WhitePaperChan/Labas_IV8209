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
                {2, 4, 3},
                {3, 2, 4},
                {3, 4, 5}
        };
        char C[][] = {{0, 0, 0},{0, 0, 0},{0, 0, 0}};
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
        if (A.length != B[0].length || B.length != A[0].length){
            error_call.error();
        }
        System.out.println("C:");
        for (i=0; i < A.length; i++) {
            int max = 0;
            for (j = 0; j < B.length; j++) {
                C[i][j] = 0;
                for (k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[j][k];
                }
                trans = C[i][j];
                System.out.print(C[i][j] + " ");
                System.out.print("(" + trans + ") ");
                if (max < C[i][j]){
                    max = C[i][j];
                }
            }
            System.out.println();
            sum += max;
        }
        trans = sum;
        System.out.println("Sum:" + sum + " (" + trans + ")");
    }
}
