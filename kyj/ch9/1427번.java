package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// �迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.

/**
 *	ù° �ٿ� �����ϰ����ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.
 */

/**
 *	�ذ��� :
 *
 * 	1. ���ڿ��� ���ڸ� �Է¹޴´�.
 * 	2. ���ڿ��� ���̸�ŭ �迭�� �����Ѵ�.
 * 	3. ���ڿ��� �Է¹��� �迭�� ������ ��ȯ, �� ���ڸ� �迭�� ��´�.
 * 	4. �迭�� ������ �� ���� ������ ����Ѵ�. 
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n= sc. next(); // ���ڿ��� ���ڸ� �Է¹��� 
		
		int [] array = new int[n.length()]; // ���ڿ��� ���̸�ŭ �迭�� ���� 
		int number = Integer.parseInt(n);	//  �Է¹��� �迭�� ������ ��ȯ
		
		
		 for(int i=0; i< n.length(); i++) { // ���̸�ŭ �ݺ����� ���� 
		 array[i] = number % 10;	
		 number /= 10;			// �� ���ڸ� �迭�� ��´�.
	}
		 Arrays.sort(array); // arrays.sort()�� �迭�� �����ϰ� 
		 for(int i= n.length()-1; i>=0; i--)	// ���������� 
		 System.out.print(array[i]); // ��� 

	}
}


// ************************************************************************************************************************
/*
 * ���� ���ڿ��� ���ڸ� �Է¹��� �� �迭�� �����͸� ������ ��, Arrays.sort() �ϸ� Ǯ�� �ִ�. 
 * 1~9 �����̱� ������ char �迭�� ���� �Ͽ���.
 * String ���ڿ��� �����ϴ� ����� ���� �˰� ������ Ǯ�� ����.  
 * 
public class ��Ʈ�λ��̵� {
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
