package Baekjoon;

import java.util.Scanner;
/*
(A+B)%C�� (A%C + B%C)%C �� ������?

(A��B)%C�� (A%C �� B%C)%C �� ������?

�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
/**
 * ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
 * ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
	System.out.println((a+b)%c);
	System.out.println((a%c + b%c)%c);
	System.out.println((a*b)%c);
	System.out.println((a%c * b%c)%c);
	}
}
