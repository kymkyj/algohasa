package ch04;

import java.util.Scanner;

public class ex9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();
		if (a >= 90)
			System.out.print("A");
		else if (a >= 80)
			System.out.print("B");
		else if (a >= 70)
			System.out.print("C");
		else if (a >= 60)
			System.out.print("D");
		else
			System.out.print("F");
	}

}
