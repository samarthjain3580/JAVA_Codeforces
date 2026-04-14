import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int i=0, j=1;
            int ops = 0;
            while (j<n) {
                if (arr[i] > arr[j]) ops++;
                else i=j;
                j++;
            }
            System.out.println(ops);
            
        }
        sc.close();
    }
}
