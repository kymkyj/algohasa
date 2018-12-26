package Baekjoon;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B-2를 출력하는 프로그램을 작성하시오.

/**
 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * 첫째 줄에 A+B-2를 출력한다.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		System.out.println((a+b)-2); 
	}
}
