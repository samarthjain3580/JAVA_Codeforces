package Codeforces;
import java.util.*;
public class No_Casino_in_Mountains {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();  
            int k = sc.nextInt();  
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int[] s = new int[n + 1];
            for (int i = 0; i < n; i++) {
                s[i + 1] = s[i] + a[i];
            }

            int ans = 0;
            int i = 0;
            while (i + k <= n) {
                int sum = s[i + k] - s[i];
                if (sum == 0) {
                    ans++;
                    i += k + 1;  
                } else {
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}
