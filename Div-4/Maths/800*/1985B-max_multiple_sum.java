package CodeForces;

import java.util.*;
public class max_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int bestX = 2;
            long maxSum = computeSum(n, 2);
            
            for (int x = 3; x <= n; x++) {
                long sum = computeSum(n, x);
                if (sum > maxSum) {
                    maxSum = sum;
                    bestX = x;
                }
            }
            System.out.println(bestX);
        }
        sc.close();
    }
    
    private static long computeSum(int n, int x) {
        long k = n / x;
        return x * k * (k + 1) / 2;
    }
}
