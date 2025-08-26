import java.util.Scanner;

public class energyCrystals {

    static void computeResult(Scanner scanner) {
        long number = scanner.nextLong();
        int highestBitPosition = 63 - Long.numberOfLeadingZeros(number);
        long result = 2L * highestBitPosition + 3;
        System.out.println(result);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            
            for (int i = 0; i < testCases; i++) {
                computeResult(scanner);
            }
        }
    }
}
