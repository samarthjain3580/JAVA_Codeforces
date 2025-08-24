import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            
            int sub = a-b;
            
            if (sub == 0) {count = 0;}
            
            while (sub!= 0) {
                if (sub > 0) {
                    if (sub % 2 == 0) {
                        count++;
                    }
                    else {
                        count+=2;
                    }
                }
                
                if (sub < 0) {
                    if (sub % 2 != 0) {
                        count++;
                    }
                    else {
                        count+=2;
                    }
                }
                sub = 0;
            }
            System.out.println(count);
        }
    }
}
