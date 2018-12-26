package Baekjoon;

import java.util.Scanner;

// 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

/**
 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 *	두 번째로 큰 정수를 출력한다.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();		// >> 세 정수 a, b, c를 각각 선언한다
		int c=sc.nextInt();
		int mid=0; // mid(중간값)을 선언한다 
//		int[] array = new int [3] 3개의 정수가 있는 배열을 선언한다. 
//		for(int i=0 i<array.length; i++) { 배열의 길이만큼 반복문을 돈다.
//		array[i] = sc.nextInt(); // 배열에서 다음값이 있으면 다음 정수를 가져온다.  
//		}
		sc.close();
//		Arrays.sort(array); sort를 통해 배열의 크기순대로 정렬한다.
//		System.out.println(array[1]); // 우리는 두번째로 큰 값을 찾는 것이므로 array[1]을 찾으면 된다. 
		
		if((a>=b && b>=c) || (c>=b) && (b>=a)) { // 조건식에서 a>=b와 b>=c를 모 만족하거나 또는 c>=b 와 b>=a를 만족하면 중간값은 b
			mid = b;	// 중간값 b
		}else if((b>=a && a>=c) || (c>=a) && (a>=b)) { // 조건식에서 b>=a 와 a>=c를 만족하거나 또는 c>=a 와 a>=b를 만족하면 중간값은 a
			mid = a; // 중간값 a
		}else { // 그 외에 나머지 조건식을 만족하는 것은 중간값이 c인 경우이다. 
			mid = c; // 중간값 c
		}
		System.out.println(mid); // 중간값을 출력한다. 
	}
}
