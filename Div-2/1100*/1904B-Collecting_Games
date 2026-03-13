import java.util.*;
public class main {
    
    public static class Pair {
        long val;
        int idx;
        Pair(long v, int i) {
            val = v;
            idx = i;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            Pair[] arr = new Pair[n];
            for(int i=0; i<n; i++) {
                arr[i] = new Pair(sc.nextLong(), i);
            }
            
            Arrays.sort(arr, Comparator.comparingLong(a -> a.val));
            
            //prefix sum;
            long[] prefix = new long[n];
            prefix[0] = arr[0].val;
            
            for(int i=1; i<n; i++) {
                prefix[i] = prefix[i-1] + arr[i].val;
            }
            
            // reach arr;
            
            int[] reach = new int[n];
            reach[n-1] = n-1;
            int r = n-1;
            
            for(int i=n-2; i>=0; i--) {
                if (prefix[i] >= arr[i+1].val) {
                    reach[i] = r;
                }
                else {
                    reach[i] = i;
                    r=i;
                }
            }
            
            // print index according to reach;
            
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[arr[i].idx] = reach[i];
            }
            
            for(int i=0; i<n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
