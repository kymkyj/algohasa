package Baekjoon;

/*�� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ��� A = 150, B = 266, C = 427 �̶�� 

A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 

����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.

*/

/**
 * ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�
 * ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. 
 * ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
 */

/**
#1 % ������ �̿�

���ڸ� 10���� ���� �������� 1�� �ڸ��� ���� �˴ϴ�.

�̷��� �������� ���Ͽ� 0~9 �ε����� ������ �迭�� ī��Ʈ�� ���ϰ�,

���� ���ڸ� 10���� �����ϴ�.

�׸��� while�� ����Ͽ� ���� ���ڰ� 0���� ū ���� �ݺ��Ͽ� �����Ͽ����ϴ�.


#2 String Ŭ���� �̿�

�Ʒ� 3�� �Լ��� Ȱ���Ͽ�, ���ڿ��� 1���ھ� ó���Ͽ����ϴ�.

- valueOf(number) : �ش� number�� String���� ��ȯ�Ͽ� ��ȯ�մϴ�.

- length() : ���ڿ��� ���̸� ��ȯ�մϴ�.

- charAt(index) : �ش� ���ڿ��� index�� ��ġ�� ���ڸ� char ������ ��ȯ�մϴ�.

 */


// #1
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();		// A, B, C�� ���� ���� 
        sc.close();
         
        int[] counts = new int[10]; // ũ�Ⱑ 10�� counts �迭 ���� 
        int number = A * B * C;	 // ������ A, B, C�� ���Ѵ�.
        while (number > 0) {
            counts[number % 10]++;
            number /= 10;		// ���ڸ� 10���� ������ �������� ��� count�� ���Ѵ� why?? >> ����� 10���� ������ �������� 1�ڸ� ���� �Ǵµ� 
            					// �̸� ��� 10���� ������ ����(number)�� 0�� �ǵ��� ������ 
           // System.out.println(number);     
            						// >> ex) 555, 666, 777 >>> 28720251 >>> 2872025 >>> 287202 >> 2872 >> 287 >> 28 >> 2>> 0
            						//  ���� ���� �������� �Ųٷ� �о� ���� ó�� ���� �ȴ� 28720251 
        }
 
        for (int i = 0; i < counts.length; ++i) {
           System.out.println(counts[i]);
        }
    }
}

//-------------------------------------------------------------------------------------------------------



/*
#2

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
         
        int[] counts = new int[10];
        String input = String.valueOf(A * B * C);
        for (int i = 0; i < input.length(); ++i) {
            counts[input.charAt(i) - '0']++;
        }
         
        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
    }
}
*/