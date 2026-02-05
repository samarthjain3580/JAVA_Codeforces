import java.util.*;
public class MagicWand {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
            
            int even = 0, odd = 0;
            for(int i=0; i<n; i++) {
            	if (arr[i] % 2 == 0) {
            		even++;
            	}
            	else {
            		odd++;
            	}
            }
            
            if (even == n || odd == n) {
            	for(int i=0; i<n; i++) {
            		System.out.print(arr[i] + " ");
            	}
            }
            else {
            	Arrays.sort(arr);
				for(int i=0; i<n; i++) {
					System.out.print(arr[i] + " ");
				}
            }   
            System.out.println();
        }
    }
}
