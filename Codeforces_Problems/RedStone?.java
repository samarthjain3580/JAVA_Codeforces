import java.util.*;
public class redstone {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(isValid(arr));
        }
    }
    
    public static String isValid(int [] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                return "Yes";
            }
        }
        return "No";
    }
}

