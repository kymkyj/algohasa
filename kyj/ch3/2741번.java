package Baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) { // 1부터 n까지 기준이므로 i를 기준으로 ++ 연산
			System.out.printf("%d%n",i);
		}
	}
}
