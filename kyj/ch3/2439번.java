package Baekjoon;

import java.util.Scanner;

// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
// ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.				*
//													>>>		   **
//														 	  ***
/**
 * ù° �ٿ� N(1 �� N �� 100)�� �־�����.
 * ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
         
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
             
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
