import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int key =  Integer.parseInt(scanner.nextLine());

        System.out.println(binarySearch(arr, 0, arr.length - 1, key));

    }
    private static int binarySearch(int[] arr, int start, int end, int key) {
        while(end >= start) {
            int mid = (start + end) / 2;
            if(key < arr[mid]) {
                end = mid - 1;
            } else if(key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return - 1;
    }

}
