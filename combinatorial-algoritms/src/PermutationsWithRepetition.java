import java.util.HashSet;
import java.util.Scanner;

public class PermutationsWithRepetition {
    public static String[] elements;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split(" ");

        permute(0);
    }

    private static void permute(int index) {
        if(index == elements.length) {
            print(elements);
            return;
        }
        HashSet<String> swapped = new HashSet<>();
        permute(index + 1);
        swapped.add(elements[index]);
        for(int i = index + 1; i < elements.length; i++) {
            if(!swapped.contains(elements[i])) {
                swap(elements, index, i);
                permute(index + 1);
                swap(elements, index, i);
                swapped.add(elements[i]);
            }

        }
    }

    private static void swap(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void print(String[] arr) {
        System.out.println(String.join(" ", arr));
    }
}
