import java.util.Scanner;

public class chap2_1008 {
	/**
	 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
	 * 첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두수를 입력해주세요!");
		double A = (double) sc.nextInt();
		double B = (double) sc.nextInt();
		
		if(A > 0 && B > 0) {
			System.out.println(A/B);
		}
		sc.close();
	}
}
