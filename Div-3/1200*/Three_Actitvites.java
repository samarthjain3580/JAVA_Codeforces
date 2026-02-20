import java.util.*;
public class three_activites {

    static class Pair {
        long val;
        int idx;
        Pair(long v, int i) {
            val = v;
            idx = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Pair[] A = new Pair[n];
            Pair[] B = new Pair[n];
            Pair[] C = new Pair[n];

            for (int i = 0; i < n; i++) A[i] = new Pair(sc.nextLong(), i);
            for (int i = 0; i < n; i++) B[i] = new Pair(sc.nextLong(), i);
            for (int i = 0; i < n; i++) C[i] = new Pair(sc.nextLong(), i);

            Arrays.sort(A, (x, y) -> Long.compare(y.val, x.val));
            Arrays.sort(B, (x, y) -> Long.compare(y.val, x.val));
            Arrays.sort(C, (x, y) -> Long.compare(y.val, x.val));

            long ans = 0;

            for (int i = 0; i < Math.min(3, n); i++) {
                for (int j = 0; j < Math.min(3, n); j++) {
                    for (int k = 0; k < Math.min(3, n); k++) {

                        int x = A[i].idx;
                        int y = B[j].idx;
                        int z = C[k].idx;

                        if (x != y && y != z && x != z) {
                            ans = Math.max(ans,
                                    A[i].val + B[j].val + C[k].val);
                        }
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
