package Lv6;

import java.util.Scanner;

public class N2577 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = 0;
		
		result = A * B * C;
		String rslt = String.valueOf(result);
		
		int cnt[] = new int[10];

		for(int i=0;i<rslt.length();i++) {
			for(int j=0; j<=9;j++) {
				if(rslt.charAt(i)-'0'==j) {
					cnt[j]++;
					continue;
				}
			}
		}
		
		
		for(int k=0;k<10;k++) {
		System.out.println(cnt[k]);
		}
	}
}
