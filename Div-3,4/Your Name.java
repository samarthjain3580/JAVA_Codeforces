import java.util.*;
public class your_Name {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            
            List<Character> list_s = new ArrayList<>();
            for(char ch:s.toCharArray()) {
            	list_s.add(ch);
            }
            
            List<Character> list_t = new ArrayList<>();
            for(char ch:t.toCharArray()) {
            	list_t.add(ch);
            }
            
            Collections.sort(list_s);
            Collections.sort(list_t);
            
            boolean flag = false;
            for(int i=0; i<n; i++) {
            	if (list_s.get(i) != list_t.get(i)) {
            		System.out.println("No");
            		flag = true;
					break;
            	}
            }
            
            if (!flag) System.out.println("Yes");
            
        }
    }
}
