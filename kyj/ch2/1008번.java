package Baekjoon;

import java.util.Scanner;

// A/B
// 첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10-9 까지 허용한다
/**
 *	정수(int)로 나누게 되면 소수점 이하는 버리기 때문에
 *	소수(double) 타입으로 계산해야 한다.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		sc.close();
		System.out.println(a/b); 
	}
}
