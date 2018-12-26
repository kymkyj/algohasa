package Baekjoon;

import java.util.Scanner;

// ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
 * ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
 * ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); 
		int x=sc.nextInt(); // >> ���� n�� x�� ���� ������ 
		int [] a= new int[n]; // ����(�迭) a�� �̷�� ���� n�� >> �����迭  
		for(int i=0; i<a.length; ++i) { // �迭(����)�� ���̸�ŭ �ݺ����� ����.
			a[i] = sc.nextInt(); // ���� �������� ������ a[i] �迭 �ȿ� ����ִ´�.
		}
		sc.close();
		
		for(int i=0; i<a.length; ++i) { // �ٽ� �迭�� ���̸�ŭ �ݺ����� ����.
			if (a[i]< x) { // a �迭�� x���� ������
				System.out.print(a[i] + " "); // �迭�� ������ ����Ѵ�.
			}
		}
	}
}
