package Lv8;

import java.util.Arrays;
import java.util.Scanner;

public class N1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		int size = num.length();
		char[] arr = new char[size];
		
		for(int i=0; i<num.length();i++) {
			arr[i]= num.charAt(i);
		}
		
		Arrays.sort(arr);
		
		for( int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
