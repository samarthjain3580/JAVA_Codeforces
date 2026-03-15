import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int c=0;
        int left = 0, right = n-1;
        int prev = 0;
        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            c++;
            if (arr[left] > prev && arr[right] > prev) {
                if (arr[left] < arr[right]) {
                    prev=arr[left];
                    left++;
                    sb.append("L");
                }
                else {
                    prev = arr[right];
                    right--;
                    sb.append("R");
                }
            } else if(arr[left]>prev){
                    prev=arr[left];
                    left++;
                    sb.append("L");
            } else if(arr[right]>prev){
                    prev = arr[right];
                    right--;
                    sb.append("R");
            } else{
                c--;
                break;
            }
        }
        System.out.println(c);
        System.out.println(sb.toString());
        sc.close();
    }
}
