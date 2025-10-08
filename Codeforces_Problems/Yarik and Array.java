import java.util.*;
public class yarik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int curr = arr[0];

            for (int i = 1; i < n; i++) {
                if ((arr[i] % 2 + 2) % 2 != (arr[i - 1] % 2 + 2) % 2) {
                    curr = Math.max(curr + arr[i], arr[i]);
                } else {
                    curr = arr[i];
                }
                max = Math.max(max , curr);
            }

            System.out.println(max);
        }
    }
}
