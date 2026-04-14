import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(optimalShifts(n, s));
        }
        sc.close();
    }
    
    public static int optimalShifts(int n, String s) {
        s = s+s;
        int count = 0;
        int max = 0;
        for (int i=0; i<2*n; i++) {
            if (s.charAt(i) == '0') count++;    
            else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        max = Math.max(count, max);
        return max;
        
        
    }
}
