package Baekjoon;

import java.util.Scanner;

// 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

/**
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 별찍기와 유사한 문제 (응용) 
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
