package Pattern;
import java.util.*;
public class Pattern28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int count = i*(i+1)/2;
			for(int j=1; j<=i; j++) {
				System.out.print(count-j+1);
				if(j <= i-1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
