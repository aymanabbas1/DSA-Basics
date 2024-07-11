import java.util.*;

public class MergeSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = (low + high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid , high);
    }

    static void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        List<Integer> tempList = new ArrayList<>();

        while(left <= mid && right <= high){
            if(arr[left]<= arr[right]){
                tempList.add(arr[left]);
                left++;

            }
            else {
                tempList.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            tempList.add(arr[left]);
            left++;
        }
        while(right <= high){
            tempList.add(arr[right]);
            right++;
        }

        for(int i = low; i<=high; i++){
            arr[i] = tempList.get(i - low);
        }
    }

}

