import java.util.Scanner;

public class recurssion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci elements: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(recursion4(i) + " ");
        }
        System.out.println();

        sc.close();
    }

    // Sum from i to n
    public static int recursion1(int i, int n) {
        if (i > n) {
            return 0;
        } else {
            return i + recursion1(i + 1, n);
        }
    }

    // Sum from n to 1
    public static int recursion2(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + recursion2(n - 1);
        }
    }

    // Reverse array recursively
    public static void recursion3(int i, int j, int arr[]) {
        if (i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        recursion3(i + 1, j - 1, arr);
    }

    // Fibonacci using recursion
    public static int recursion4(int n) {
        if (n <= 1) {
            return n; // Base cases: Fib(0)=0, Fib(1)=1
        }
        return recursion4(n - 1) + recursion4(n - 2);
    }

}
