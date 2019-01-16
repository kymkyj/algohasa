package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

/* (정답 비율 :  40.509%)
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

	명령은 총 다섯 가지이다.
	
	push X: 정수 X를 스택에 넣는 연산이다.
	pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	size: 스택에 들어있는 정수의 개수를 출력한다.
	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

/**
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
 * 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

   출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

   접근방법 :
   #1) import java.util.Stack을 사용하는 방법 (자바에 미리 구현된 스택을 사용) (책참고)
   #2) (다른사람 코드이다) 배열을 이용해서 구하는 방법 (비효율적인것 같다 - 코드의 길이가 너무 길다 )
   그 밖에도 ArrayList, 연결리스트(Linkedlist) 로도 가능하다고 한다. 
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
 public class 스택10828 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt(); // 명령의 수
		int [] arr = new int[n]; // 작업을 위한 배열
		int top = -1; // 배열 위치
		String input; // 명령
		
		for(int i=0; i<n; i++) {
			input = sc.next();
			
		if(input.equals("push")) // 정수 x를 스택에 넣는 연산이다. 
		{
			top++;
			arr[top] = sc.nextInt(); 
		}
		else if (input.equals("pop")) // 스택에서 가장 위에있는 정수를 빼고 , 그 수를 출력한다. (없는 경우에는 -1)
		{
			if(top == -1 ) {
				System.out.println(-1);
			}else {
				System.out.println(arr[top]);
				top--;
			}
		}
		else if(input.equals("size")); // 스택에 들어있는 정수의 개수를 출력한다. 
		{
			System.out.println(top+1);
		}
		else if(input.equals("empty"))	// 스택이 비어있으면 
		{
			if(top == -1 ) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		else if(input.equals("top")) // 스택의 가장 위에 있는 정수를 출력한다 
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
