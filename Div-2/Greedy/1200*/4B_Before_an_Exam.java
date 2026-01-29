import java.util.*;

public class before_an_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int sumTime = sc.nextInt();

        int[] minTime = new int[d];
        int[] maxTime = new int[d];
        int minTotal = 0, maxTotal = 0;

        for (int i = 0; i < d; i++) {
            minTime[i] = sc.nextInt();
            maxTime[i] = sc.nextInt();
            minTotal += minTime[i];
            maxTotal += maxTime[i];
        }

        if (sumTime < minTotal || sumTime > maxTotal) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

        int[] schedule = new int[d];
        int remaining = sumTime - minTotal;

        for (int i = 0; i < d; i++) {
            schedule[i] = minTime[i];
        }

        for (int i = 0; i < d && remaining > 0; i++) {
            int add = Math.min(remaining, maxTime[i] - minTime[i]);
            schedule[i] += add;
            remaining -= add;
        }

        for (int i = 0; i < d; i++) {
            System.out.print(schedule[i] + " ");
        }
        System.out.println();
    }
}
