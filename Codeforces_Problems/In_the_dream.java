package codeforces;
import java.util.*;
public class inTheDream{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0) {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt()-a;
	        int d = sc.nextInt()-b;
	        
	        boolean x = Math.max(a, b) <= 2 * Math.min(a, b) + 2;
	        boolean y =  (c>=0 && d>=0) &&Math.max(c, d) <= 2 * Math.min(c, d) + 2;

	        if (x && y) {
	        	System.out.println("YES");
	        } else {
	        	System.out.println("NO");
	        }
	    }
	}
}
