import java.util.*;;
public class ratingIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-->0) {
            String ab = sc.next();
            int n = ab.length();
            boolean flag = false;
            int left = 0, right = 1;
        
            while (left < right && right < n) {
                if (ab.charAt(right) == '0') right++;
                else {
                    String b = ab.substring(right);
                    String a = ab.substring(0, right);
                    int l = Integer.valueOf(a);
                    int r = Integer.valueOf(b);
                    if (r > l) {
                        flag = true;
                        System.out.println(l+" "+r);
                        break;
                    }
                    right++;
                }
            }
            
            if (!flag) System.out.println(-1);
        }
        sc.close();
    }
}
