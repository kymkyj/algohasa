import java.util.Scanner;

public class chap7_2908 {
	/*
	 * 상수는 숫자를 잘못읽는다.
	 * 0이 포함되어있지 않은 세자리수 두개가 주어졌을 경우 비교하는 문제이다.
	 * 예를 들어 상수는  734 893 숫자가 있을 경우 437 389로 읽어서 437이 크다고 한다.
	 * 이렇게 출력 결과를 나오게 하라.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println((change(num1)>change(num2) ? change(num1) : change(num2)));
		
	}
	
	static int change(int num) {
		// 734 893 -> 437 398
		num = (num%10)*100 + ((num%100)/10)*10 + num/100;
		
		return num;
	}
}
