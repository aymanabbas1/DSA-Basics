public class QuickSort {

    // Function to perform the QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1); // Recursively sort the left part
            quickSort(array, pi + 1, high); // Recursively sort the right part
        }
    }

    // Function to find the partition position
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the rightmost element as pivot
        int i = (low - 1); // Pointer for the greater element

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap elements at i and j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the greater element at i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition point
        return (i + 1);
    }

    // Main method to test the QuickSort
    public static void main(String[] args) {
        int[] array = { 10, 7, 8, 9, 1, 5 };
        int n = array.length;

        System.out.println("Unsorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        quickSort(array, 0, n - 1);

        System.out.println("\nSorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
