package Lv11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		Queue q = new LinkedList();
		int x;
		int last = 0; //마지막값을 위한 변수
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();

			String instruction[] = str.split(" ");

			switch (instruction[0]) {
			case "pop":
				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.poll()); // 제거 하며 읽기
				}

				break;

			case "push":
				x = Integer.parseInt(instruction[1]);
				last = x;
				q.offer(x);
				break;

			case "size":
				System.out.println(q.size());
				break;

			case "empty":
				if (q.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;

			case "front":
				if (q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(q.peek());
				}
				break;

			case "back":
				if (q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(last);
				}
				break;

			}

		}

	}

}
