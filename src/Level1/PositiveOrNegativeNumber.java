package Level1;

import java.util.*;

public class PositiveOrNegativeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("Positive");
		} else if(n<0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

}
