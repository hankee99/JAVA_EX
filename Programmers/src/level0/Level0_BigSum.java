package level0;
import java.lang.Math;
import java.util.Scanner;

public class Level0_bigsum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a값을 입력하세요: ");
		int a = sc.nextInt();
		System.out.println("b값을 입력하세요: ");
		int b = sc.nextInt();
		
		int A = a;
		int B = b;
		int cnt1 = 0;
		int cnt2 = 0;
		
		while(A>0) {
			A /= 10;
			cnt1++;
		}
		
		while(B>0) {
			B /= 10;
			cnt2++;
		}
		
		int ab = a*(int)Math.pow(10, cnt2) + b;
		int ba = b*(int)Math.pow(10, cnt1) + a;
		
		if(ab>=ba) {
			System.out.println(ab);
		}
		else {
			System.out.println(ba);
		}
		
		sc.close();

	}

}
