package CodeForces;
import java.util.*;
public class Tales_of_a_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t>0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j=0; j<n-1; j++) {
                if (arr[j] >= arr[j+1]) {
                    for (int k=0; k<n; k++) {
                        arr[k] = Math.max(0, arr[k]-1);
                    }
                }
                
            }
            t--;
        }
        sc.close();
    }    
}
