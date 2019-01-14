package Lv6;

import java.util.Scanner;

public class N2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[8];
		String state;
		int acnt=0;
		int dcnt =0;
		int mcnt =0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==j+1) {
				acnt++;
			}
			else if(arr[j]==arr.length-j) {
				dcnt++;
			}
			else {
				mcnt++;
			}
		}
		if(acnt == 8) {
			state = "ascending";
		}
		else if(dcnt ==8) {
			state = "descending";
		}
		else {
			state = "mixed";
		}
		System.out.println(state);
		
	}

}
