package Baekjoon;

import java.util.Scanner;

// �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
 * ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) { // 1���� n���� �����̹Ƿ� i�� �������� ++ ����
			System.out.printf("%d%n",i); 
		}
	}
}
