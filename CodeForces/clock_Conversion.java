package CodeForces;
import java.util.*;
public class Clock_Conversion {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        	String s = sc.next();
        	String hh = s.substring(0,2);
        	String mm = s.substring(3);
        	int x = Integer.valueOf(hh);
        	String post = (x<12)?"AM":"PM";
        	if (x>12) {
        		hh=((x-12)/10)+""+((x-12)%10);
        	}
        	if (x==0) {hh="12";}
        	System.out.println(hh+":"+mm+" "+post);
        }
        sc.close();

	}


}
