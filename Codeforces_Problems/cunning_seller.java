package Codeforces;
import java.util.*;
public class cunning_seller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		while (t-- > 0) {
			int n = sc.nextInt();
			long total = 0;
			while (n>0) {
				int count = 0;
				while(n/Math.pow(3, count) >=3) {
					count++;
				}
				n-= Math.pow(3, count );
				total += ((Math.pow(3, count+1)) + (count * (Math.pow(3, count-1))));
			}
		
			System.out.println(total);
		}
	}

}
