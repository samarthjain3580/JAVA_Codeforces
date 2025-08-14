package CodeForces;

import java.util.Scanner;

public class vlad_best_of_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t>0) {
            int count_a = 0;
            int count_b = 0;
            String s = sc.next();
            String[] arr  = s.split("");

            for (int i=0; i<arr.length; i++) {
                if (arr[i].equals("A")) {
                    count_a++;
                }
                else {
                    count_b++;
                }
            }
            if (count_a > count_b) {
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }
            t--;
        }
        sc.close();
    }
}
