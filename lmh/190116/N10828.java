package Lv11;

import java.util.Scanner;

public class N10828 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[] = new int[N];
		String input;
		int top = -1;
		
		
		for(int i=0;i<N;i++) {
			input = sc.next();

			if(input.equals("push")) {
				int num = sc.nextInt();
				top++;
				arr[top]=num;
			}
			else if(input.equals("top")) {
				if(top != -1) {
					System.out.println(arr[top]);
				}else {
					System.out.println(-1);
				}

			}
			else if(input.equals("size")) {
				System.out.println(top+1);
			}
			else if(input.equals("empty")) {
				if(top == -1) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}

			}
			else if(input.equals("pop")) {
				if(top==-1) {
					System.out.println(-1);
				}
				else {
					System.out.println(arr[top]);
					top--;
				}
			}

		}



	}

}
