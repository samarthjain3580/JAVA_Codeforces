package CodeForces;
import java.util.*;;
public class Rating_Increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t>0) {
            String ab = sc.next();
            int half = ab.length()/2;
            while (half>0) {
                String b = ab.substring(half);
                String a = ab.substring(0, half);
                int k = Integer.valueOf(a);
                int l = Integer.valueOf(b);
                if (l > k) {
                    System.out.println(k+" "+l);
                    break;
                }
                else if (l == k) {
                    System.out.println(-1);
                    break;
                }
                else {
                    half--;
                }
            }
            t--;
        }
        sc.close();
    }
}
