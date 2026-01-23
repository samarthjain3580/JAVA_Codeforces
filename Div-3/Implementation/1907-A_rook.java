package CodeForces;

import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            String s = sc.next();
            String alpha = s.substring(0, 1);
            int num = s.charAt(1)-48;
            int[] arr = {1,2,3,4,5,6,7,8};
            String[] array = {"a","b","c","d","e","f","g","h"}; 
            for (int i=0; i<8; i++ ) {
                if (arr[i] != num) {
                    System.out.println(alpha+""+arr[i]);
                }
                if (array[i].equals(alpha)) {
                    continue;
                }
                else {
                    System.out.println(array[i]+""+num);
                }
            }
            t--;
        }
        sc.close();
    }
}
