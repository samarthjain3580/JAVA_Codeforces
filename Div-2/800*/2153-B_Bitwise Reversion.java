import java.util.*;
public class BitwiseReversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            boolean flag = true;

            // Check each bit using powers of 2
            for (int i = 0; i < 31; i++) {
                int power = (int) Math.pow(2, i);

                int xb = (x / power) % 2;
                int yb = (y / power) % 2;
                int zb = (z / power) % 2;

                if (!((xb == 0 && yb == 0 && zb == 0) ||
                      (xb == 0 && yb == 0 && zb == 1) ||
                      (xb == 0 && yb == 1 && zb == 0) ||
                      (xb == 1 && yb == 0 && zb == 0) ||
                      (xb == 1 && yb == 1 && zb == 1))) {
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
