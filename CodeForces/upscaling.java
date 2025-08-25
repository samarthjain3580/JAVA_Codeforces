package CodeForces;
import java.util.*;
public class Upscaling {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        	int n = sc.nextInt();
        	String[][] s= {{"#","#",".","."},
        			       {"#","#",".","."},
        			       {".",".","#","#"},
        			       {".",".","#","#"}};
        	for (int i=0;i<n*2;i++) {
        		for (int j=0;j<n*2;j++) {
        			System.out.print(s[i%4][j%4]);
        		}
        		System.out.println();
        	}
        }
        sc.close();

	}

}
