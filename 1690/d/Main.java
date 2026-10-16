import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void solveTestCase() {
        int n = SCANNER.nextInt(), k = SCANNER.nextInt();
        SCANNER.nextLine();
        char[] stripe = SCANNER.nextLine().toCharArray();

        int numWhite = 0;
        int i = 0, j = 0;

        while (j < k) {
            numWhite += stripe[j++] == 'W' ? 1 : 0;
        }

        int minWhiteToBlackRepaint = numWhite;

        while (j < n) {
            numWhite -= stripe[i++] == 'W' ? 1 : 0;
            numWhite += stripe[j++] == 'W' ? 1 : 0;

            minWhiteToBlackRepaint = Math.min(numWhite, minWhiteToBlackRepaint);
        }
        
        System.out.println(minWhiteToBlackRepaint);
    }

    public static void main(String[] args) {
        int t = SCANNER.nextInt();

        while(t > 0) {
            solveTestCase();
            t--;
        }
    }
}
