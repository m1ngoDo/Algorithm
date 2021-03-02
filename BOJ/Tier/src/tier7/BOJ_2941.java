package tier7;

import java.util.Scanner;

public class BOJ_2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String croatia[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        String str = sc.next();
        
        for(int i = 0; i < croatia.length; i++) {      
        	str = str.replace(croatia[i], "#");        	
        }
        
        System.out.println(str.length());
	}
}
