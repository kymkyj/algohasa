import java.util.Scanner;

public class chap4_10817 {
	/*
	 * 	문제
		세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
		
		입력
		첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
		
		출력
		두 번째로 큰 정수를 출력한다.
		
		20 30 10 -> 20
		30 30 10 -> 30
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		if((B >= A && A >= C) || (C >= A && A >= B)) {
			System.out.println(A);
		}else if((A >= B && B >= C) || (C >= B && B >= A)) {
			System.out.println(B);
		}else {
			System.out.println(C);
		}
	}
}
