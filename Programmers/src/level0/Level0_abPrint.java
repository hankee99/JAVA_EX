package level0;
import java.util.Scanner;
/*입출력 예
입력 #1
4 5

출력 #1
a = 4
b = 5
*/
public class Level0_abPrint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a값을 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("b값을 입력하세요: ");
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();
	}

}
