package CodeForces;

import java.util.Scanner;

public class max_multiple_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t>0) {
            int n = sc.nextInt();
            for (int x=2; x<=n; x++) {
                int k = n;
                int sum = 0;
                while (k>=2) {
                    if (k%x == 0) {
                        sum=sum+k;
                        k=k-x; 
                    }
                    else {
                        k--;
                    }
                }
                System.out.println(sum);  
            }
        }
        sc.close();
    }
}
