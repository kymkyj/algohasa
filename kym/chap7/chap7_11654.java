import java.util.Scanner;

public class chap7_11654 {
	/*
	 * 	문제
		알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		
		입력
		알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
		
		출력
		입력으로 주어진 글자의 아스키 코드 값을 출력한다.
		
		결과 예시
		A -> 65
		
		문제이해
		1. 입력한 소문자, 대문자, 숫자를 아스키 코드값으로 변경함.

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(input.charAt(0)-0);
	}
}
