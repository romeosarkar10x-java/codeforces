import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), a = scanner.nextInt();

        scanner.close();

        long l = (n + a - 1) / a;
        long b = (m + a - 1) / a;

        System.out.println(l * b);
    }
}
