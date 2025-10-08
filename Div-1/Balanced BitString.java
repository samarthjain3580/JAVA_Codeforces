import java.util.*;
public class balanced_bitstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            
            boolean flag = true;
            
            for(int i=k; i<n; i++) {
                if (ch[i] == '0') {
                    if (ch[i%k] == '1') {
                        flag = false;
                    }
                    ch[i%k] = '0';
                }
                else if (ch[i] == '1') {
                    if (ch[i%k] == '0') {
                        flag = false;
                    }
                    ch[i%k] = '1';
                }
            }
            
            if (!flag) {
				System.out.println("NO");
				continue;
			}
            
            int zero = 0, one = 0;
            for(int i=0; i<k; i++) {
                if (ch[i] == '0') zero++;
                else if (ch[i] == '1') one++;
            }
            
            if (zero > k/2 || one > k/2) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
            
        }
    }
}
