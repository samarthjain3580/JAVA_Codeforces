import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int[] freq = new int[26];
            for(char ch: s.toCharArray()) {
                freq[ch-'A']++;
            }
            
            int count = 0;
            for(int i=0; i<26; i++) {
                if (freq[i] >= i+1) count++;
            }
            System.out.println(count);
            
        }
        sc.close();
    }
}
