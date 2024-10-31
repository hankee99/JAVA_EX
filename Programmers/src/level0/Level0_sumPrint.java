package level0;
import java.util.Scanner;

public class Level0_sumPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a를 입력하세요");
		int a = sc.nextInt();
		System.out.print("b를 입력하세요");
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.printf("%d + %d = %d",a,b,a+b);
		sc.close();
		
		
	}

}
