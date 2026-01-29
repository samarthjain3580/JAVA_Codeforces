package CodeForces;
import java.util.Scanner;
public class morning_sandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-->0) {
            int b = sc.nextInt();
            int f = sc.nextInt()+sc.nextInt();
            int layer;
            if (b>f){
                layer=2*f+1;
            }
            else{layer=2*b-1;}
            System.out.println(layer);
        }
        sc.close();
    }
}
