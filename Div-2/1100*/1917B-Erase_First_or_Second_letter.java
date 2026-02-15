import java.util.*;
public class erase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int[] arr = new int[n];
            
            int i = 0, count = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for(char ch: s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch,0)+1);
                
                if (map.get(ch) == 1) count++;
                arr[i++] = count;
            }
            
            long ans = 0;
            for(int num : arr) {
                ans+=num;
            }
            
            System.out.println(ans);
            
        }
        sc.close();
    }
}
