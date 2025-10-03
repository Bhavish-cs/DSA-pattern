import java.util.Scanner;

public class recurssion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sum = recurssion2( n);  // fixed: provide both parameters
        System.out.println("Sum = " + sum);

    }

    public static int recurssion1(int i, int n) {
        if (i > n) {
            return 0;
        } else {
            return i + recurssion1(i + 1, n);
        }
    }

    public static int recurssion2(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + recurssion2(n - 1);
        }
    }
}
