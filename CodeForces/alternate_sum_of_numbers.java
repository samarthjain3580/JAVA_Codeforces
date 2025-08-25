package Codeforces;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int ans=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i=0; i<n; i+=2) {
                ans+= arr[i];           // odd index
            }
            
            for (int i=1; i<n; i+=2) {
                ans-= arr[i];          // even index
            }
            System.out.println(ans);
        }
    }
}

