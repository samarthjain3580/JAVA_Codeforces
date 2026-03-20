import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            boolean flag = true;
            int diff = 0;
            if (a>=x && b>=y) {
                System.out.println("YES");
                flag = false;
            }
            if (a<x) diff+=(x-a);
            if (b<y) diff+=(y-b);
            
            if (flag) {
                if (diff > c ) System.out.println("No");
                else System.out.println("Yes");
            }
            
        }
        sc.close();
    }
}
