package Baekjoon;

import java.util.Scanner;

// �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

/**
 * ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)
 *	�� ��°�� ū ������ ����Ѵ�.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();		// >> �� ���� a, b, c�� ���� �����Ѵ�
		int c=sc.nextInt();
		int mid=0; // mid(�߰���)�� �����Ѵ� 
//		int[] array = new int [3] 3���� ������ �ִ� �迭�� �����Ѵ�. 
//		for(int i=0 i<array.length; i++) { �迭�� ���̸�ŭ �ݺ����� ����.
//		array[i] = sc.nextInt(); // �迭���� �������� ������ ���� ������ �����´�.  
//		}
		sc.close();
//		Arrays.sort(array); sort�� ���� �迭�� ũ������ �����Ѵ�.
//		System.out.println(array[1]); // �츮�� �ι�°�� ū ���� ã�� ���̹Ƿ� array[1]�� ã���� �ȴ�. 
		
		if((a>=b && b>=c) || (c>=b) && (b>=a)) { // ���ǽĿ��� a>=b�� b>=c�� �� �����ϰų� �Ǵ� c>=b �� b>=a�� �����ϸ� �߰����� b
			mid = b;	// �߰��� b
		}else if((b>=a && a>=c) || (c>=a) && (a>=b)) { // ���ǽĿ��� b>=a �� a>=c�� �����ϰų� �Ǵ� c>=a �� a>=b�� �����ϸ� �߰����� a
			mid = a; // �߰��� a
		}else { // �� �ܿ� ������ ���ǽ��� �����ϴ� ���� �߰����� c�� ����̴�. 
			mid = c; // �߰��� c
		}
		System.out.println(mid); // �߰����� ����Ѵ�. 
	}
}
