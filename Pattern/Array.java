
import java.util.HashMap;

public class Array {

    public static int findSmallest(int[] arr, int n) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        return (secondSmallest == Integer.MAX_VALUE) ? -1 : secondSmallest;
    }

    public static int findLargest(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void largestSmallest(int[] arr, int n) {
        int secSmall = findSmallest(arr, n);
        int secLarge = findLargest(arr, n);

        System.out.println("Second Smallest = " + secSmall);
        System.out.println("Second Largest = " + secLarge);
    }

    public static void leftarray(int[] nums, int d) {
        int n = nums.length;
        int k = d % n;
        int[] temp = new int[n];
        for (int i = 0; i < k; i++) {

            temp[i] = nums[i];

        }

        // shifiting 
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }

    }
    
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    public static void optimalreverse(int[] arr, int k) {
        int n = arr.length;
        int d = k % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

    }


    public static  int[] twosumoptimal(int[] arr, int target) {
        HashMap< Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{}; // if no pair found

        }
    

 
    public static void printArray(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

  
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 3,  1, 0};
        int[] result = twosumoptimal(nums, 4); // store returned array
        printArray(result);


          

    }
}
