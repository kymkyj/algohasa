package Baekjoon;

import java.util.Scanner;

// A/B
// ù° �ٿ� A/B�� ����Ѵ�. ����/��� ������ 10-9 ���� ����Ѵ�
/**
 *	����(int)�� ������ �Ǹ� �Ҽ��� ���ϴ� ������ ������
 *	�Ҽ�(double) Ÿ������ ����ؾ� �Ѵ�.
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
