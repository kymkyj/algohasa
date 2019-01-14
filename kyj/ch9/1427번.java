package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

/**
 *	첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 */

/**
 *	해결방법 :
 *
 * 	1. 문자열로 숫자를 입력받는다.
 * 	2. 문자열의 길이만큼 배열을 선언한다.
 * 	3. 문자열로 입력받은 배열을 정수로 변환, 각 숫자를 배열에 담는다.
 * 	4. 배열을 정렬한 후 작은 순으로 출력한다. 
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n= sc. next(); // 문자열로 숫자를 입력받음 
		
		int [] array = new int[n.length()]; // 문자열의 길이만큼 배열을 선언 
		int number = Integer.parseInt(n);	//  입력받은 배열을 정수로 변환
		
		
		 for(int i=0; i< n.length(); i++) { // 길이만큼 반복문을 돌려 
		 array[i] = number % 10;	
		 number /= 10;			// 각 숫자를 배열에 담는다.
	}
		 Arrays.sort(array); // arrays.sort()로 배열을 정렬하고 
		 for(int i= n.length()-1; i>=0; i--)	// 작은순으로 
		 System.out.print(array[i]); // 출력 

	}
}


// ************************************************************************************************************************
/*
 * 먼저 문자열로 숫자를 입력받은 후 배열에 데이터를 삽입한 후, Arrays.sort() 하면 풀수 있다. 
 * 1~9 사이이기 때문에 char 배열을 선언 하였다.
 * String 문자열을 추출하는 방법에 대해 알고 있으면 풀기 쉽다.  
 * 
public class 소트인사이드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		int size = n.length();
		
		char[] arr = new char[size];
		
		for(int i=0; i<n.length(); i++) {
			arr[i] = n.charAt(i);
		}
		Arrays.sort(arr);
		
		for(int i= arr.length-1; i>=0; i--)
			System.out.print(arr[i]);
	}
}
*/
