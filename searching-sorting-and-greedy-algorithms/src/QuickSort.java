import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        sort(arr);

        StringBuilder builder = new StringBuilder();

        for(int number: arr) {
            builder.append(number).append(" ");
        }

        System.out.println(builder.toString());
    }

    private static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index

    private static void sort(int[] arr, int low, int high) {
        if(low < high) {
            /* pi is partitioning index, arr[pi] is
            now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* This method takes last elements as pivot,
    places the pivot elements at its correct
     position in sorted array, and places all
     smaller (smaller than pivot) to left of
     pivot and all greater elements to right of pivot*/

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
