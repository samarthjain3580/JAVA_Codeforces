import java.util.*;
public class least_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int zero = 0, neg = 0;
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) zero++;
                else if (arr[i] < 0) neg++;
            }
            
            if ((neg%2 != 0) || zero > 0) {
                System.out.println(0);
            }
            else {
                System.out.println(1);
                System.out.println("1"+" "+"0");
            }
        }
        sc.close();
    }
}
