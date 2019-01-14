package Baekjoon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


/*
 * N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

/**
 *	ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. 
 *	�� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 *	ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 */

/**
 * #1) ArrayList�� ���ʸ����� ���� �Է°��� �������ְ� �迭 �Ǵ� �÷����� sort�� ���� ���� 
 * #2 �ٸ���� �ڵ�) �������� :	(1) 1��° �迭���� �����ؼ� �տ� �ִ� ĭ�� ��  
 * 						 	(2) 0��° �迭�� �ڱ⺸�� ũ�� 1��°�� �Ѱܹ��� �ڱⰡ �� �ڸ��� ����
 * 							(3) ��� �̷��� �Ѿ�鼭 �տ��ִ� ���ڿ� ���Ѵ�.
 * 							(4) �ڱⰡ �� �ڸ� ã�Ƽ� ���� �� �ڴ� �з��� ����
 * 
 * #3 �ٸ���� �ڵ�) �������� : ��ĭ ���� ĭ�� ���Ͽ� �ٲ���
 * 							(1) �ѹ����� �� ���� ������ ���ڴ� ������ >> ó������ ���� �迭���� �� ���ƾ� �ϱ� ������ �迭�� ���� -1
 * 							(2) 2���� °�� �迭�� ���� -2 ��ŭ ����.
 * #4) �����ķ� �ϴ� ����� �ִٰ� �մϴ�.. 
 */

public class Main {
	public static void main(String[] args) {
		    	ArrayList<Integer> list = new ArrayList<Integer>(); // ���ʸ����� ���� <Integer> Ÿ������ ����Ѵ�. 
		    	
		    	Scanner sc = new Scanner(System.in);
		    	int n = sc.nextInt();	// n���� ���� �Է¹޴´�. 
		    	
		    	for(int i=0; i<n; i++) {	// n���� ����ŭ �ݺ����� ������. 
		    		int a = sc.nextInt();	// Ư�� ���� a�� �޴´�. 
		    		list.add(a);	// a�� ����Ʈ�� �߰��Ѵ�. 
		    	}
		    	Collections.sort(list);	// List�� Collection sort�� �̿��� �����Ѵ�. 
		    	for(int i:list) {	// ����Ʈ��ŭ �ݺ����� �������� 
		    		System.out.println(i);	// ����Ѵ�. 
		}
	}
}		
		
// *********************************************************************************************************************************

/*
public class BJ2750_insert2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int [sc.nextInt()];
		int temp = 0;
		
		for(int i=0; i<number.length; i++) {	// �Է¹ޱ� 
			number[i] = sc.nextInt();
		}
		
		for(int i=1; i<number.length; i++) {	// 1��° ���� ���ϸ鼭 ä��������. 
			int key = number[i];	// ��� ���� ���ϴ� key ���� ���� 
			int j= i-1; // �ڱ⺸�� ��ĭ ���� ������ �� �����Ѵ�. 
			while(j>=0 &&  number[j]>key) {	// 0ĭ �����鼭 key������ Ŀ�� �ٲ���� ĭ ã�� 
				number[j+1] = number[j];	// ��ĭ�� �̷Ｍ ���� 
				j--; // j���� -1ĭ �̵� 
			}
			
			number[j+1] = key;	// j�� -1�� �Ǿ������ϱ� +1�ؼ� number[j]�� key �� �ֱ� 
		}
			for(int i=0; i<number.length; i++) {	// ����ϱ� 
				System.out.println(number[i]);
			}
	}
}
*/

// **********************************************************************************************************************************

/*
public class BJ2750_bubble {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int [sc.nextInt()];
		int temp = 0;
		
		for(int i=0; i<number.length; i++) {	// �Է¹ޱ� 
			number[i] = sc.nextInt();
		}
		for(int times=number.length; times>0; times--) {	// ȸ�� �� 
			for(int i=1; i<number.length; i++) { // ���ϴ� �� 
				if(number[i]<number[i-1]) {	// �տ� �ִ� ���� �� ũ�� ���� �ٲٱ� 
					temp = number[i];
					number[i] = number[i-1];
					number[i-1] = temp;
				}
			}
		}
		for(int i=0; i<number.length; i++) { // ����ϱ� 
			System.out.println(number[i]);
		}
	}
}
*/