package Codeforces;
import java.util.*;
public class bePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int neg = 0, zero = 0;
            for(int i=0; i<n; i++) {
                if (arr[i] == -1) {
                    neg++;
                }
                else if (arr[i] == 0) {
                    zero++;
                }
            }
            
            int count = zero;
            if (neg % 2 != 0) count+=2;
            System.out.println(count);
        }
    }
}
