import java.util.*;
public class roof_construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            // find largest power of 2 < n
            int k = 1;
            while (k * 2 < n) k *= 2
          
            for (int i = k - 1; i >= 0; i--) {
                System.out.print(i + " ");
            }

            for (int i = k; i < n; i++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
