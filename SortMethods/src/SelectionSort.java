public class SelectionSort {

    // Method to perform selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Main method to test the selection sort
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(array);

        System.out.println("Sorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
