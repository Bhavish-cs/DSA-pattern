import java.util.ArrayList;

public class sorting {

    
    
    // Bubble Sort method
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1-i ; j++) {

                if (nums[j] > nums[j+1]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }
        }
        
    }

    public static void selectionsort(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j <= nums.length-1; j++) {

                if (nums[min] > nums[j]) {
                    min = j;

                }

            }
            int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
        }
    }

    //insertion sort 
    public static void insertionsort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;

            }
            nums[j + 1] = key;
        }

    }
    
    public static void mergesort(int[] arr,int  low ,int high){
        if(low >=high)
        return;
        int mid= (low+high)/2;
        mergesort(arr, low, mid );
        mergesort(arr, mid+1,high);
        merge(arr, low, mid, high);
    }

    public static void merge (int[] arr, int low,  int mid,  int high){
            int left =low;
            int right= mid+1;
            ArrayList<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }


        }
        while(left <=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high;i++){
            arr[i] =temp.get(i-low);
        }

    }

    // Counting Sort (for 0,1,2 problem)
    public static void countingSort(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int i = 0;
        while (count0-- > 0)nums[i++] = 0;
         while (count1-- > 0)nums[i++] = 1;
         while (count2-- > 0)nums[i++] = 2;


        
    }


    public static void recursivebubblesort(int[] arr, int n) {
        if (n == 1)
            return;

        for (int i = 0; i <= n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
            recursivebubblesort(arr, n-1);
    }

    //  Method to print array (optional utility)
    public static void printArray(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        
        recursivebubblesort(nums, nums.length-1);    

        // print result
        printArray(nums);
    }
}
