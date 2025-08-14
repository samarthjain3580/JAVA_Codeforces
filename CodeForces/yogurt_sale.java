package CodeForces;
import java.util.*;
public class yogurt_sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t > 0) {
            int min_cost = 0;
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (2*a < b ) {
                min_cost+= n*a;
            }
            else{
                min_cost+= (n/2)*b+a*(n%2);
            }
            System.out.println(min_cost);

            t--;
            
        } 
        sc.close();
    }  
}
