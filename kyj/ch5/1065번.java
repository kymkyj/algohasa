package Baekjoon;

import java.util.Scanner;

// � ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
// N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
 * ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
 * 
 * ���� ��� :
 * 
 * �� �ڸ��� ���� ���ü� �ִ� �Ѽ��� ������ �ľ��ϴ� ���� �߿��ϴ�. 
 * �׸��� ���̰� 1000���� ������ �ִٴ� �Ϳ� �ָ��ϰ�, �Ѽ��� �游 �ľ��Ҽ� �ִٸ� ���� Ǯ�� �ִ�. 
 * 
 * �Ѽ��� " �� �ڸ��� ���� ���������� �̷�� ���� ���Ѵ� " 
 * ���������̶� " �� �׵��� ������ ���̸� ���̴� ������ ���Ѵ� "
 * ex) 123(����1) , 753(����-2), 111(����0) ���� �ִ�. 
 * 
 * ������ 3�ڸ��� �̸��� ��쿡�� �Ѽ��� ��� ���ұ�?
 * ����� 1�ڸ����� 2�ڸ����� ��� �Ѽ��� �ȴ�.
 *  why? 
 *  12(����1) 13(����2) 14(����3) 15(����4) .... 21(����-1) 22(����0) 23(����1) 24(����2) .... 99(����0) 
 *  �� 1�ڸ����� 2�ڸ����� �Ѽ��� �� ������ 99�� �̴�. 
 *  
 *  ���ڸ��� ���ʹ� �ڸ��� ���� �ɰ��� a, b, c �� ������ �Ŀ� ���ڸ����� ���� ������ Ȯ���� ���� �ȴ�. 

 */

public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int cnt =0;
		
		if(n<100) {
			System.out.println(n);
			return;
		}
		cnt = 99;	// 100 ���������� ��� �Ѽ� �̹Ƿ� 99�� 
		
		for(int i=100; i<=n; i++) {
			int a = i / 100;
			int b= (i/10) % 10;
			int c= i % 10;		// 100 �̻���� n ���� 3�ڸ� ���ڴ�  ������ �ڸ����� �ɰ��� a, b, c �� �����ϰ�
			
			if(a-b==b-c) 	// ���ڸ��� ���� ���� ������ Ȯ���ϸ� �ȴ�.  ������ �Ѽ��̴� 
				cnt++;
		}
			System.out.println(cnt);
			sc.close();
		}
	}

/*
public class Main {	 
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     sc.close();
	         
	        if (n < 100) {
	            System.out.println(n);
	        } else {
	            int result = 99;
	             
	            for (int i = 100; i <= n; ++i) {
	                result += checkHanNumber(i);
	            }
	             
	            if (n == 1000) result--;
	             
	            System.out.println(result);
	        }
	    }
	     
	    private static int checkHanNumber(int number) {
	        int num1 = number / 100 % 10;
	        int num2 = number / 10 % 10;
	        int num3 = number % 10;
	         
	        if (num2 * 2 == num1 + num3) {
	            return 1;
	        }
	        return 0;
	    }
	}
*/
