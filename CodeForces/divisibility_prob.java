package CodeForces;
import java.util.*;
public class divisibility_prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 0;
            if (a%b != 0) {
                int rem = a%b;
                ans = b-rem;
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
