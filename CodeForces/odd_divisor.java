package CodeForces;
// import java.util.Scanner;
// public class word_game {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt(); 
//         while(t-->0) {
//             int n = sc.nextInt();
//             for (int i=0; i<n; i++) {
//                 String a = sc.next()+" ";
//                 String b = sc.next()+" ";
//                 String c = sc.next()+" ";
//             }
//         }
//         sc.close();
//     }
// }
import java.util.*;
public class odd_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-->0) {
            // boolean flag = true;
            long n = sc.nextLong();
            // for (long i=2; i<=n; i++) {
            //     if (n%i == 0){
            //         if (i%2 != 0) {
            //             System.out.println("YES");
            //             flag = false;
            //             break;
            //         }
            //     }
            // }
            while(n%2==0){
                n/=2;
            }
            if (n!=1)
                System.out.println("YES");
            else
                System.out.println("NO");
            
            // if (flag == true) {
            //     System.out.println("NO");
            // }
        }
        sc.close();
    }
}
