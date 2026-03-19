import java.util.*;
public class Main {
    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            boolean value = true;
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i + 1] == 0) {
                    value = false;
                    break;
                }

                while (arr[i] >= arr[i + 1]) {
                    arr[i] /= 2;
                    count++;
                }

                if (arr[i] >= arr[i + 1]) {
                    value = false;
                    break;
                }
            }

            System.out.println(value ? count : -1);
        }
    }
}
