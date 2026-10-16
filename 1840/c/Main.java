import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static void solveTestCase() {
        int n = scanner.nextInt(), minDays = scanner.nextInt(), maxTemp = scanner.nextInt();
        int[] temps = new int[n + 1];

        for (int i = 0; i < n; i++) {
            temps[i] = scanner.nextInt();
        }

        temps[n] = Integer.MAX_VALUE;
       
        long ans = 0;
        int lengthOfSegment = 0;

        for (int temp : temps) {
            if (temp > maxTemp) {
                if (lengthOfSegment >= minDays) {
                    long x = lengthOfSegment + 1 - minDays;
                    ans += x * (x + 1) / 2;
                }

                lengthOfSegment = 0;
            } else {
                lengthOfSegment++;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();

        while(t != 0) {
            solveTestCase();
            t--;
        }

        scanner.close();
    }
}
