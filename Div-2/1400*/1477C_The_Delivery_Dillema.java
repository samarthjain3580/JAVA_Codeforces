import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            
            for(int i=0; i<n; i++) {
                arr[i][0] = sc.nextInt();
            }

            for(int i=0; i<n; i++) {
                arr[i][1] = sc.nextInt();
            }
            
            Arrays.sort(arr, (x,y) -> y[0]-x[0]);
            
            // 7 5 4 3
            // 1 4 2 2
            
            int min = arr[0][0];
	        int next = arr[0][1];
	        for(int i = 1; i<n; i++) {
	            int temp = arr[i][0];
	            int max = Math.max(temp, next);
	            if(max > min) break;
	            else {
	                min = max;
	            }
	            
	            next += arr[i][1];
	        }
	        
	        System.out.println(Math.min(next, min));

        }
        sc.close();
    }
}
