import java.util.Scanner;

public class MinCostCalculator {

    private static void computeMinimumCost(Scanner scanner) {
        int size = scanner.nextInt();
        long[] values = new long[size];

        // Read input values
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextLong();
        }

        long minCost = Long.MAX_VALUE;

        for (int i = 0; i < size; ) {
            int j = i;
            while (j + 1 < size && values[j + 1] == values[i]) {
                j++;
            }

            long value = values[i];
            long cost = value * ((long) i + (long) (size - 1 - j));
            minCost = Math.min(minCost, cost);
            i = j + 1;
        }

        System.out.println(minCost);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            for (int t = 0; t < testCases; t++) {
                computeMinimumCost(scanner);
            }
        }
    }
}
