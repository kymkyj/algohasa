package Baekjoon;

import java.util.Scanner;

// N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
 * ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 * �Է����� �־��� ���� N���� ���� ����Ѵ�.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); // nextInt() �� nextLine ���� ����ϴ� ���� 
		sc.nextLine();	// nextInt()�� ���๮�ڸ� �Է¹��� �����Ƿ� nextLine�� ���� �����Ѵ�.
		String tmp=sc.nextLine(); // String Ÿ���� �����ϰ� �������� ������ ��� �о�´�. 
		int result =0; // ������� �������ش�. 
		for(int i=0; i<tmp.length(); i++) {  // ������ ���̸�ŭ �ݺ����� ����  ����:  1, 12345 ���� 12345�� 1,2,3,4,5 ���� 12,345���� �˼����� ����
//			result += result +  tmp.charAt(i)-0; //  �ƽ�Ű �ڵ带 �̿��� ��
			result += Integer.parseInt(tmp.substring(i, i+1));  // Integer.ParseInt�� ���������� ��ȯ�� tmp(����)�� substring���� i�� �ڸ��� 
																// ���۰� ���� �������ش� 
		}
		System.out.println(result);
		sc.close();
		
	}
}
