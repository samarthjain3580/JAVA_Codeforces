import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            int n = s.length();

            int zero = 0, one = 0;

            for(char c : s.toCharArray()) {
                if(c == '0') zero++;
                else one++;
            }

            int used = 0;

            for(int i = 0; i < n; i++) {

                if(s.charAt(i) == '0') {
                    if(one > 0) {
                        one--;
                        used++;
                    } else break;
                } else {
                    if(zero > 0) {
                        zero--;
                        used++;
                    } else break;
                }
            }

            System.out.println(n - used);
        }

        sc.close();
    }
}
