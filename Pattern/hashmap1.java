import java.util.Scanner;

public class hashmap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         
        System.out.print("Enter a string: ");
        String str = sc.next();

        
        int[] hash = new int[26];

       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hash[ch-'a']++;
        }

        
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter a word  to query: ");
            String ch=sc.next();
            for (int i = 0; i < ch.length(); i++) {

                char c =ch. charAt(i);
                System.out.println("Frequency of '" + c + "': " + hash[c-'a']);
            }

        }

        sc.close();
    }
}
