import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] result = new char[n];
            Arrays.fill(result, 0, k, '1');
            Arrays.fill(result, k, n, '0');
            System.out.println(new String(result));
        }
    }
}
