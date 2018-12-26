package Baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); // �����̰� ������ �� ������ ����
		int total = 0; // ������ ������ 
		int max = 0; // ������ �� �������� �ִ밪 
		int score; // ���� �������� 
		for(int i=0; i<n; ++i) { // �����̰� ������ �� ������� �ݺ����� ������. (1) for �� 
			score=sc.nextInt(); // ���� ������ ������ �о�´�.(2)
			total += score; // ������ ���������� ���Ѵ� (1) �� �ݺ��Ѵ�. 
			if(score > max) { // ���������� �ִ밪���� Ŀ���� �Ǹ� 
				max = score; // �ִ밪�� ���������� �����Ѵ�.  
			}	
		}
		sc.close();
		
		double average = 0; // ����� �Ҽ������� ������ �������� �����Ƿ� double�� �����Ѵ�. 
		average = 100.0 * total / max / n; // ���⼭ >> ��� = M * 100.0 �̹Ƿ� 
										   // 100.0 * ������ / �ְ����� / ������ ���� 
		System.out.printf("%.2f", average); // %.2f >> �� ������ �ش��ϴ� ����(2)��ŭ �Ҽ��� ������ �ڸ����� �ݿø��Ͽ� ���̸� �����. 
	}
}
