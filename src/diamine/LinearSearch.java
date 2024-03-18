package diamine;

public class LinearSearch {
    public static void main(String[] args) {
        // Array of integers
        int[] nums = {10, 20, 21 ,19, 12, 14 };
        // Target element to search for
        int target = 19;
        // Call linearSearch function to find the target element
        int ans = linearSearch(nums,target);
        // Print the index where the target element is found (-1 if not found)
        System.out.println(ans);
    }

    // Linear search function
    static int linearSearch(int[] arr , int target){
        // If the array is empty, return -1 (indicating target not found)
        if(arr.length == 0){
            return -1;
        }
        // Iterate through the array
        for (int i=0 ; i<arr.length;i++){
            // Get the current element
            int element = arr[i];
            // If the current element matches the target, return its index
            if(element == target){
                return i;
            }
        }
        // If the target is not found in the array, return -1
        return -1;
    }
}
