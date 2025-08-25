import java.util.*;
public class villagers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-->0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long sum = 0;
                        
            for(int i=n-1; i>=0;i-=2) {
            	sum+=arr[i];
            }
            System.out.println(sum);
        }
    }   
}

