package level0;
import java.util.Scanner;


public class Level0_returnoddeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n값을 입력하세요: ");
		int n = sc.nextInt();
		
		int m = n/2;
		
		if(n%2 == 1) {
			System.out.println((n/2 + 1)*(n+1)/2);
		}
		else {
			System.out.println(m*(m+1)*(2*m + 1)/6 * 4);
		}
		
		sc.close();

	}

}
