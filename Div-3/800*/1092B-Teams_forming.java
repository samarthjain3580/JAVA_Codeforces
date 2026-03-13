import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<n; i+=2) {
            int diff = arr[i+1]-arr[i];
            count+=diff;
        }
        System.out.print(count);
        sc.close();
    }
}
