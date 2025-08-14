package CodeForces;
import java.util.*;
public class colourblindness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-->0) {
            boolean flag = true;
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            for(int i=0; i<n; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    if (a.charAt(i) == 'R' || b.charAt(i) == 'R') {
                        System.out.println("No");
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
