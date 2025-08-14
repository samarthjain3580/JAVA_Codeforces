package CodeForces;
import java.util.*;
public class little_nikita {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while (t>0) {
            int n = Sc.nextInt();
            int m = Sc.nextInt();
            if (n>=m) {
                if ((n-m) % 2 == 0 ) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
            else {
                System.out.println("No");
            }
            t--;
        }
        Sc.close();
    }
}
