import java.util.*;
public class circle_of_apple_trees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 1;
            for(int i=1; i<arr.length; i++) {
                if (arr[i] > arr[i-1]) count++;
            }
            System.out.println(count);
        }
    }
}
