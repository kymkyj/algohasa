package Baekjoon;

import java.util.Scanner;

// ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����

/**
 * ù° �ٿ� N(1 �� N �� 100)�� �־�����.
 * ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
 * ������ ������ ���� (����) 
 */

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n-i+1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
