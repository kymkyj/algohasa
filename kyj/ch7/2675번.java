package Baekjoon;

import java.util.Scanner;

/*
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
 */

/**
 *	ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
 *	�� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
 *	�� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.
 *
 	��Ʈ : ���ڿ��� Ư�� ������ŭ �ݺ��ؼ� ����ϴ� �����̴�. 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int input = sc.nextInt(); // ��ü ����Ұ��� �Է¹ް� ���� 
		
		int [] repeatarr = new int[input]; // �� ������ŭ ���ڴ��� �迭�� �����Ѵ�. 
		String[] str = new String[input]; // �� ������ŭ ���ڴ��� �迭�� �����Ѵ�.
		
		for(int i=0; i<input; i++) {
			repeatarr[i] =sc.nextInt(); // �� ������ŭ ���� �Է¹ޱ�
			str[i] = sc.next(); // �� ������ŭ ���� �Է¹ޱ� 
		}
		for(int i=0; i<input; i++) {
			char[] segment = str[i].toCharArray(); // �ɰ��� �迭�� �ֱ� 
			for(int a=0; a<segment.length; a++) { // �ɰ� ���� �ϳ��ϳ� ������ 
				for(int b=0; b<repeatarr[i]; b++) { // �Է¹��� ���ڸ�ŭ �ݺ��Ѵ�. 
					System.out.print(segment[a]); // ����Ѵ�. 
				}
			}
			System.out.println();	// �� �������� �����ٿ� �����ֱ� 
		}
		
	}
}
