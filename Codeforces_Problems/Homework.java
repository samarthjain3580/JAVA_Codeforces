package Codeforces;
import java.util.*;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String a = sc.next();
			int m = sc.nextInt();
			String b = sc.next();
			String c = sc.next();
			
			for (int i=0; i<m; i++) {
				if (c.charAt(i) == 'D') {
					a += b.charAt(i);
				}
				else {
					a = b.charAt(i) + a;
				}
			}
			System.out.println(a);
		}
		sc.close();	
	}
}
