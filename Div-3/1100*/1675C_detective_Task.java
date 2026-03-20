import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            int n = s.length();
            System.out.println(detectiveThief(s, n));
        }
        sc.close();
    }
    
    public static int detectiveThief(String s, int n) {
        if (n == 1) return n;
        
        int one = 0, thief = 0;
        for(char ch: s.toCharArray()) {
            if (ch == '1') one++;
        }
        
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            if (s.charAt(i) == '1') {
                set.add(1);
                one--;
                if (one == 0 && !set.contains(0)) thief++;
            }
            else if (s.charAt(i) == '0') {
                if (one == 0 && !set.contains(0)) thief++;
                set.add(0);
            }
            else {
                if (one == 0 && !set.contains(0)) thief++;
            }
        }
        
        return thief;
    }
}
