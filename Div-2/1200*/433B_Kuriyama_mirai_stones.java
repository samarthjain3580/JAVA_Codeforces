import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextLong();
        }
        long[] sort = arr.clone();
        Arrays.sort(sort,1,n+1);
        
        //maintain prefix sums
        long[] prefix1 = new long[n+1];
        long[] prefix2 = new long[n+1];
        
        prefix1[0] = arr[0];
        prefix2[0] = sort[0];
        for(int i=1; i<=n; i++) {
            prefix1[i] = prefix1[i-1] + arr[i];            
            prefix2[i] = prefix2[i-1] + sort[i];            
        }
        int m = sc.nextInt();
        while (m-->0) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            if (type == 1) System.out.println(prefix1[r] - prefix1[l-1]); 
            else System.out.println(prefix2[r] - prefix2[l-1]);
        }
        sc.close();
    }
}
