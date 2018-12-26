package ch03;

import java.util.Scanner;

public class ex8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();
		int b = 0;
		int sum = 0;
		for (int i = 0; i < a; i++) {
			b++;
			sum += b;
		}
		System.out.print(sum);
	}

}
