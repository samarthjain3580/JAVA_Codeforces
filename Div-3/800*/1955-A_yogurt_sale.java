import java.util.*;
public class yogurt_sale {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-->0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int first = a*n;
            int second = (n/2)*b + (n%2)*a;
            
            System.out.println(Math.min(first, second));
        }
    }
}

