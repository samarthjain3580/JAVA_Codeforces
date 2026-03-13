import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // zero
        int b = sc.nextInt(); // one
        int x = sc.nextInt(); // alternate indice
        
        StringBuilder sb = new StringBuilder();
        // repeat 0,1,0,1 ... till x-1 times
        
        int temp = (a >= b) ? 0 : 1;

        while (x-- > 0) {
            sb.append(temp);
        
            if (temp == 0) {
                temp = 1;
                a--;
            } else {
                temp = 0;
                b--;
            }
        }
        
        if (temp == 0) {
            for(int i=0; i<b; i++) sb.append(1);
            for(int i=0; i<a; i++) sb.append(0);
        }
        else {
            for(int i=0; i<a; i++) sb.append(0);
            for(int i=0; i<b; i++) sb.append(1);
        }
        
        System.out.print(sb.toString());
        
        sc.close();
    }
}
