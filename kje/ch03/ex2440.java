package ch03;

import java.util.Scanner;

public class ex2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++){
			for(int j=input-i; j>=1; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
