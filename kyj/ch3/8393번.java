package Baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum = 0;
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum += i; // sum = sum + i;
		}	// 계속해서 for문 전체값이 다 출력되길래 당황했는데.. for문을 제대로 닫지 않아서 였다. OTL
			System.out.println(sum);
		}
	}

