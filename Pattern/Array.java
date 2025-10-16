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

    public static void printArray(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        printArray(nums);
        largestSmallest(nums, nums.length);
    }
}
