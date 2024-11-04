package level0;
import java.lang.Math;
import java.util.Scanner;

public class Level0_relBig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("b를 입력하세요: ");
		int b = sc.nextInt();
		
		int B = b;
		int cnt = 0;
		
		while(B>0) {
			B /= 10;
			cnt++;
		}
		
		int ab = a*(int)Math.pow(10, cnt) + b;
		int ab2 = 2*a*b;
		
		if(ab>=ab2) {
			System.out.println(ab);
		}
		else {
			System.out.println(ab2);
		}
		
		sc.close();

	}

}
