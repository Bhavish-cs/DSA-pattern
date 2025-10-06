import java.util.Scanner;

public class hashmap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            if (arr[i] < 13) { // bounds checking
                hash[arr[i]]++;
            }
        }

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter number to query: ");
            int number = sc.nextInt();
            if (number < 13) {
                System.out.println("Frequency of " + number + ": " + hash[number]);
            } else {
                System.out.println("Number out of range (0-12)");
            }
        }
        
        sc.close();
    }
}