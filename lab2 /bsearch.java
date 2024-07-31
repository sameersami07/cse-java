public class bsearch{
    public static void main(String[] args) {
        int[] array = {4, 11, 12, 25, 34, 82, 90};
        int target = 25; 
        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    static int binarySearch(int[] arr, int target) {
        int left = 0; 
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (arr[mid] == target) {
                return mid; 
            }
            else if (arr[mid] < target) {
                left = mid + 1; 
            }
            else {
                right = mid - 1; 
            }
        }
        return -1; 
    }    
}

