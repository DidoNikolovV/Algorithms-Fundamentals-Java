import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        long fact = calculateFactorial(n);

        System.out.println(fact);
    }

    public static long calculateFactorial(int num) {
        if(num == 1) {
            return 1;
        }

        return num * calculateFactorial(num - 1);

    }
}
