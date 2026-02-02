package CodeForces;

import java.util.Scanner;

public class two_elevators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t>0) {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            int c = sc.nextInt();
            
            int elevator_1 = Math.abs(a-1);
            int elevator_2 = Math.abs(b-c) + Math.abs(c-1);

            if (elevator_1 < elevator_2) {
                System.out.println(1);
            }
            else if (elevator_2 < elevator_1) {
                System.out.println(2);
            }
            else {
                System.out.println(3);
            }
            t--;
        }
        sc.close();
    }
}
