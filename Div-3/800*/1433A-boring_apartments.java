package CodeForces;
import java.util.Scanner;
public class boring_apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t>0) {
            int n = sc.nextInt();
            int digit = String.valueOf(n).length();
            int count = 0;
            if (n%10 != 0) {
                count = count + (((n%10)-1)*10);
            }
            if (digit == 2) {count+=3;}
            else if(digit == 3) {count+=6;}
            else if(digit == 4) {count+=10;}
            else {count++;}
            System.out.println(count);
            t--;
        }
        sc.close();
    }
}
