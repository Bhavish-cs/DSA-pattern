import java.util.Scanner;


public class random {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        System.out.println("OutPut:\n");
        divisionrule(n);

    }
    //number of the digit in the one number 

    public static void countthedigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;

        }
        System.out.println("Number of digits: " + count);
    }

    //reverse the  number like 443 into 344 and the 4403 where we omit the 0 so the output become 344

    public static void reversethenumber9(int n) {
        int number = n;
        int reverse = 0;
        while (n > 0) {
            int id = n % 10;
            reverse = (reverse * 10) + id;
            n = n / 10;

        }
        if (reverse == number) {
            System.out.println("Palindrome number ");

        } else {
            System.out.println(number + " not a palindrome number");
        }

    }

    public static void armsstrongnumber(int n) {
        int num = n;
        int sum = 0;
        int temp = num;
        int p = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, p);
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("Armstrong Number ");
        } else {
            System.out.println("Not an armstrong");
        }

    }
    //division rule 

    public static void divisionrule(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    public static boolean primenumber(int n) {

        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
}

    