package Baekjoon;

import java.util.Scanner;

// ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
// �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
 * ù° �ٿ� �ܾ �־�����. �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�. ���̰� 0�� �ܾ�� �־����� �ʴ´�.
 * �Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�. �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� �̸��� ���ڸ� ����� ���� �ִ�.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String tmp=sc.next(); // string Ÿ������ tmp ���� 
		sc.close();
		
	for(int i=0; i <tmp.length(); ++i) { // ���ڼ��� ���̸�ŭ �ݺ����� ������.
		System.out.print(tmp.charAt(i)); // CharAt(index) �ش� ��ġ�� ���ڸ� chat������ ��ȯ�Ѵ�. 
		if(i % 10 == 9 ) { // 10�� ����� �ɶ����� �����Ѵ�. (==9)�� �ǹ̸� ��Ȯ�� ���� ���ϰ���..
			System.out.println(); // ����  
			}
		}
	}
}
