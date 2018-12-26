package Baekjoon;

import java.util.Scanner;

// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

/**
 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); 
		int x=sc.nextInt(); // >> 정수 n과 x를 각각 선언함 
		int [] a= new int[n]; // 수열(배열) a를 이루는 정수 n개 >> 가변배열  
		for(int i=0; i<a.length; ++i) { // 배열(수열)의 길이만큼 반복문을 돈다.
			a[i] = sc.nextInt(); // 다음 정수값이 있으면 a[i] 배열 안에 집어넣는다.
		}
		sc.close();
		
		for(int i=0; i<a.length; ++i) { // 다시 배열의 길이만큼 반복문을 돈다.
			if (a[i]< x) { // a 배열이 x보다 작으면
				System.out.print(a[i] + " "); // 배열과 공백을 출력한다.
			}
		}
	}
}
