import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Shuffling {
    public static int[] counts;

    public static void main(String[] args) {

        int[] arr = {13, 5, 2, 2, 1};
        
        Arrays.sort(arr);

        for(int rand: arr) {
            System.out.println(rand);
        }
        
    }

    private static void getAsRand(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, random.nextInt(arr.length));
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
