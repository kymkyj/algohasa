package ch04;

import java.util.Scanner;

public class ch10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int tmp = sc.nextInt();
		int[] arr = new int[tc];
		for(int i=0;i<tc;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<tc;i++) {
			if(arr[i]<tmp) {
				 System.out.print(arr[i]+" ");
			}
		}
	}

}
