package Baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum = 0;
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum += i; // sum = sum + i;
		}	// ����ؼ� for�� ��ü���� �� ��µǱ淡 ��Ȳ�ߴµ�.. for���� ����� ���� �ʾƼ� ����. OTL
			System.out.println(sum);
		}
	}

