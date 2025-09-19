import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        System.out.println("\nPattern 1: Decreasing Numbers");
        somerandom(n);

    }

    public static void printDecreasingNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReversePyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i - 1) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSandglass(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printBinaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int start = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void printnumbertraingle(int n) {

        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;

            }
            System.out.println();
        }

    }

    //A
    //AB
    //ABC

    public static void characterpyramid(int n) {

        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }
    //ABC
    //AB
    //A

    public static void reversecharacterpyramid(int n) {

        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + n - i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }

    //A
    //BB
    //CCC

    public static void onlycharacter(int n) {

        for (int i = 0; i < n; i++) {
            char ch1 = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch1);
            }
            System.out.println();

        }
    }
    //     A
    //    ABA
    //   ABCBA
    //  ABCDCBA
    // ABCDEDCBA


    
    public static void pyramidcharacter(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            //Alphabet
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
    

    public static void somerandom(int n) {
        for (int i = 0; i <= n; i++) {
            for (char c = (char) ('E' - i); c <= 'E'; c++) {
                System.out.print(c);

            }
            System.err.println();
        }
    }
}
  
    












