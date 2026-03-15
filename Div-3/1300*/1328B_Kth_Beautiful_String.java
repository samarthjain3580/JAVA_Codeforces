import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int left = -1;
            int right = -1;
            
            for(int i=1;i<n;i++){
                if(k > i) k -= i;
                else{
                    left = n - i - 1;
                    right = n - k;
                    break;
                }
            }
            
            char[] arr = new char[n];
            Arrays.fill(arr, 'a');
            arr[left] = 'b';
            arr[right] = 'b';
            System.out.println(new String(arr));
        }
        sc.close();
    }
}
