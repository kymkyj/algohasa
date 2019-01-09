package Lv8;

import java.util.*;

public class N1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int line = 1;

		int sum = 1;



		// 몇번 째 대각선에 위치하는지 찾기

		while (true) {

			if (sum >= n) {

				break;

			}

			line++;

			sum += line;

		}



		int child = 0;

		int parent = 0;



		// 해당 대각선 홀,짝 판별

		if (line % 2 == 0) {

			int start = sum;

			int sub = start-n;

			child = line - sub;

			parent = 1 + sub;

		}



		if (line % 2 == 1) {

			int end = sum;

			int sub = end-n;

			child = 1 + sub;

			parent = line - sub;

		}



		System.out.println(child+"/"+parent);



	}

}

