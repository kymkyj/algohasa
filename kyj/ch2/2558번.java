package Baekjoon;

import java.util.Scanner;

// �� ���� A�� B�� �Է¹��� ����, A+B-2�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
 * ù° �ٿ� A, ��° �ٿ� B�� �־�����. (0 < A, B < 10)
 * ù° �ٿ� A+B-2�� ����Ѵ�.
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
