package Baekjoon;

import java.util.Scanner;

/*
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 

즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 */

/**
 *	첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
 *	각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
 *	각 테스트 케이스에 대해 P를 출력한다.
 *
 	힌트 : 문자열을 특정 개수만큼 반복해서 출력하는 문제이다. 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int input = sc.nextInt(); // 전체 몇번할건지 입력받고 저장 
		
		int [] repeatarr = new int[input]; // 그 개수만큼 숫자담을 배열을 생성한다. 
		String[] str = new String[input]; // 그 개수만큼 문자담을 배열을 생성한다.
		
		for(int i=0; i<input; i++) {
			repeatarr[i] =sc.nextInt(); // 그 개수만큼 숫자 입력받기
			str[i] = sc.next(); // 그 개수만큼 문자 입력받기 
		}
		for(int i=0; i<input; i++) {
			char[] segment = str[i].toCharArray(); // 쪼개서 배열에 넣기 
			for(int a=0; a<segment.length; a++) { // 쪼갠 문자 하나하나 돌리기 
				for(int b=0; b<repeatarr[i]; b++) { // 입력받은 문자만큼 반복한다. 
					System.out.print(segment[a]); // 출력한다. 
				}
			}
			System.out.println();	// 그 다음것은 다음줄에 보여주기 
		}
		
	}
}
