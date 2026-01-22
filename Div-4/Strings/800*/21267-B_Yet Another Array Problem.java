import java.util.*;
public class arrayProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long ans = -1;

            for (long x = 2; x < 101; x++) {
                boolean flag = false;
                for (long num : arr) {
                    if (gcd(num, x) == 1) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    ans = x;
                    break;
                }
            }

            System.out.println(ans);
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
