package CodeForces;
import java.util.*;
public class tales_of_a_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    ans = Math.max(ans, arr[i]);
                }
            }

            System.out.println(ans);
        }
    }
}

