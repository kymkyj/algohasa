package ch03;

import java.util.Scanner;

public class ch1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int month = sc.nextInt();
		int date = sc.nextInt();
		int result = date;
		for(int i=0; i<month-1;i++) {
			result += arr[i];
		}
		System.out.println(day[result % 7]);
	}

}
