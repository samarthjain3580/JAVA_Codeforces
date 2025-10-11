import java.util.*;
public class can_I_Square {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			long sum=0;
			for(int i=0;i<n;i++) {
				long num=sc.nextInt();
				sum+=num;
			}
			if(isPerfectSquare(sum)) System.out.println("YES");
			else System.out.println("NO");
		}
		
	}
    
    public static boolean isPerfectSquare(long sum) {
    	double var = Math.sqrt(sum);
		int ans=(int)var;
		return ans==var;
    }
}
