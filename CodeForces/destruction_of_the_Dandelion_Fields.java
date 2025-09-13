import java.util.*;
public class dandelions {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            long sum = 0;
            int count = 0;
            Arrays.sort(arr);
            List<Integer> odd_l = new ArrayList<>();
            for(int i=0; i<n; i++) {
                if (arr[i] % 2 != 0) {
                    odd_l.add(arr[i]);
                    count++;
                }
                else {
                    sum+=arr[i];
                }
            }
            
            if(count == 0) {
                System.out.println(0);
            }
            else if (count == 1) {
                System.out.println(sum+odd_l.get(0));
            }
            else {
                int l = count/2;
                for(int i=l; i<count; i++) {
                    sum+=odd_l.get(i);
                }
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
