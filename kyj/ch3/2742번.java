package Baekjoon;

import java.util.Scanner;

// �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
 * ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;n--) { // n���� 1�����Ƿ� n�� �������� --����
			System.out.printf("%d%n",n);
		}
	}
}
