package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

/* (���� ���� :  40.509%)
 * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	����� �� �ټ� �����̴�.
	
	push X: ���� X�� ���ÿ� �ִ� �����̴�.
	pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
	empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 */

/**
 * ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. 
 * ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. 
 * ������ �������� ���� ����� �־����� ���� ����.

   ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.

   ���ٹ�� :
   #1) import java.util.Stack�� ����ϴ� ��� (�ڹٿ� �̸� ������ ������ ���) (å����)
   #2) (�ٸ���� �ڵ��̴�) �迭�� �̿��ؼ� ���ϴ� ��� (��ȿ�����ΰ� ���� - �ڵ��� ���̰� �ʹ� ��� )
   �� �ۿ��� ArrayList, ���Ḯ��Ʈ(Linkedlist) �ε� �����ϴٰ� �Ѵ�. 
 */


public class Main {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			String input = sc.next();
			if(input.contains("push")) {
				int input2 = sc.nextInt();
				stack.push(input2);
			}else if(input.equals("pop")) {
				System.out.println(stack.isEmpty()?-1:stack.pop());
			}else if(input.equals("size")) {
				System.out.println(stack.size());
			}else if(input.equals("empty")) {
				System.out.println(stack.isEmpty()?1:0);
			}else if(input.equals("top")) {
				System.out.println(stack.isEmpty()?-1:stack.peek());
			}
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 public class ����10828 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt(); // ����� ��
		int [] arr = new int[n]; // �۾��� ���� �迭
		int top = -1; // �迭 ��ġ
		String input; // ���
		
		for(int i=0; i<n; i++) {
			input = sc.next();
			
		if(input.equals("push")) // ���� x�� ���ÿ� �ִ� �����̴�. 
		{
			top++;
			arr[top] = sc.nextInt(); 
		}
		else if (input.equals("pop")) // ���ÿ��� ���� �����ִ� ������ ���� , �� ���� ����Ѵ�. (���� ��쿡�� -1)
		{
			if(top == -1 ) {
				System.out.println(-1);
			}else {
				System.out.println(arr[top]);
				top--;
			}
		}
		else if(input.equals("size")); // ���ÿ� ����ִ� ������ ������ ����Ѵ�. 
		{
			System.out.println(top+1);
		}
		else if(input.equals("empty"))	// ������ ��������� 
		{
			if(top == -1 ) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		else if(input.equals("top")) // ������ ���� ���� �ִ� ������ ����Ѵ� 
		{
			if(top == -1 ) {
				System.out.println(-1);
			}else {
				System.out.println(arr[top]);
				}
			}
		}
	}
}

 */
