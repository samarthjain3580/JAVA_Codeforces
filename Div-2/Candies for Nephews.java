import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            if (n%3 == 0) {
                System.out.println(0);
            }
            else {
               System.out.println(3 - n%3); 
            }
        }
    }
}
