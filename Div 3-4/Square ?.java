import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if (a == b && b == c && c == d && a == d) {
            	System.out.println("YES");
			} else {
				System.out.println("NO");
            }
        }
    }
}
