import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] A = new int[n];
            for(int i=0; i<n; i++) {
                A[i] = sc.nextInt();
            }
            
            int[] B = new int[n];
            for(int i=0; i<n; i++) {
                B[i] = sc.nextInt();
            }
            int min = Math.min(n,k);
            // 4,12,16
            // 1,9,10  16+(10*7) = 86 
            int[] prefix = new int[min+1];
            int[] max_prefix = new int[min+1];
            for(int i=1; i<=min; i++) {
                prefix[i] = prefix[i-1]+A[i-1];
                max_prefix[i] = Math.max(B[i-1], max_prefix[i-1]);
            }
            
            int ans = 0;
            for(int i=1; i<=min; i++) {
                int b_max = (k-i)*max_prefix[i];
                ans = Math.max(ans, b_max+prefix[i]);
            } 
            System.out.println(ans);
        }
        sc.close();
    }
}
