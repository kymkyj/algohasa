package Baekjoon;

import java.util.Scanner;

// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

/**
 *	알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 *	입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char ascii;
		ascii = sc.next().charAt(0);
		
		System.out.println(Integer.valueOf(ascii));
		
		// 1. parseInt() 와 valueOf() 의 차이는 뭘까?

		// parseInt의 리턴타입은 기본 자료형 , valueOf의 리턴 타입은 객체를 반환한다.
		
	}
}
