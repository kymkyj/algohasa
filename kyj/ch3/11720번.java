package Baekjoon;

import java.util.Scanner;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

/**
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); // nextInt() 와 nextLine 같이 사용하는 문제 
		sc.nextLine();	// nextInt()는 개행문자를 입력받지 않으므로 nextLine을 통해 개행한다.
		String tmp=sc.nextLine(); // String 타입을 선언하고 다음값이 있으면 계속 읽어온다. 
		int result =0; // 결과값을 선언해준다. 
		for(int i=0; i<tmp.length(); i++) {  // 문자의 길이만큼 반복문을 돈다  이유:  1, 12345 에서 12345가 1,2,3,4,5 인지 12,345인지 알수없기 때문
//			result += result +  tmp.charAt(i)-0; //  아스키 코드를 이용한 것
			result += Integer.parseInt(tmp.substring(i, i+1));  // Integer.ParseInt로 정수형으로 변환후 tmp(문자)를 substring으로 i를 자른다 
																// 시작과 끝을 지정해준다 
		}
		System.out.println(result);
		sc.close();
		
	}
}
