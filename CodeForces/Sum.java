package CodeForces;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a+b == c || a+c == b || b+c == a) {System.out.println("Yes"); }
            else {System.out.println("No");}
            t--;
        }
        sc.close();
}
    
}
