package Codeforces;
import java.util.*;

public class only_one_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int m = 9;
            while (x > 0) {
                int digit = x % 10;
                if (digit < m) {
                    m = digit;
                }
                x = x / 10;
            }
            System.out.println(m);
        }
        sc.close();
    }
}


