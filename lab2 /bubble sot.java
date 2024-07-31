public class file {
    public static void main(String[] args) {
        int[] array = {4, 34, 25, 12, 82, 11, 90};
        System.out.println("Original array:");
        printArray(array);
        bubbleSort(array);
        System.out.println("Sorted array:");
        printArray(array);
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }  
        }               
    }
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
