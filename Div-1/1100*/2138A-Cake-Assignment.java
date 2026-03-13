import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            long x = sc.nextLong();

            long start = 1L << k;
            long total = 1L << (k + 1);

            List<Integer> ops = new ArrayList<>();

            long cur = x;
            while (cur != start) {

                if (cur <= start) {
                    ops.add(1);
                    cur = cur * 2;
                } 
                else {
                    ops.add(2);
                    cur = 2 * cur - total;
                }
            }

            Collections.reverse(ops);

            System.out.println(ops.size());
            for (int op : ops) System.out.print(op + " ");
            System.out.println();
        }

        sc.close();
    }
}
