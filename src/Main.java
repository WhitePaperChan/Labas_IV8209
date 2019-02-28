import java.util.Scanner;

public class Main {
    int scan(){
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            input = scanner.nextInt();
        } else {
            System.out.println("It's not an integer");
            System.exit(0);
        }
        return input;
    }
    public static void main(String[] args) {
        //8209
        int a, b, n, m;
        final int C = 1;
        float S = 0;
        Scanner scanner = new Scanner(System.in);
        Main input = new Main();

        System.out.println("a=");
        a = input.scan();
        System.out.println("n=");
        n = input.scan();

        if (a <= C && n >= C){
            System.out.println("Division by Zero");
            System.exit(0);
        }
        if (a > n){
            System.out.println("a > n");
            System.exit(0);
        }

        System.out.println("b=");
        b = input.scan();
        System.out.println("m=");
        m = input.scan();

        if (b > m){
            System.out.println("b > m");
            System.exit(0);
        }

        for (float i = a; i <= n; i++){
            for (float j = b; j <= m; j++){
                S += (i - j)/(i - C);
            }
        }
        System.out.println(S);
    }
}
