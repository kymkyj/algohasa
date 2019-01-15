package Baekjoon;

/* (정답비율 : 50.717%)

 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

	명령은 총 여섯 가지이다.

	push X: 정수 X를 큐에 넣는 연산이다.
	pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	size: 큐에 들어있는 정수의 개수를 출력한다.
	empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
	front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

/**
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
 * 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * 
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 * 
 * 스택과 같은 개념의 문제이다 
 * 
 * 자료 구조 알고리즘은 알아 두면 좋을것 같아 자세한 설명과 그림은 주소를 첨부한다
 * https://www.leafcats.com/125
 * 간단하게 자료구조 알고리즘은 자주 쓰이는 Stack, Queue, Deque, heap이 있으며 
 * Stack은 (FILO: 선입후출 ), Queue은 (FIFO: 선입선출)
 * Deque (Stack + Queue가 혼합된 개념 ), Heap(자료 구조에서 최대갑, 최소값 빠르게 찾기 위해 고안, 완전 이진트리형식) 
 * 완전 이진 트리란? >> 각각의 노드가 최소 두개 의 자식 노드를 가지는 트리 자료 구조를 뜻한다. 
 */


// java.lang.Queue를 사용한 것이기 때문에 자세한 주석은 생략한다. 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	   public static void main(String[] args) {
	    
		   int b=0;
	    Queue<Integer> que = new LinkedList<>();
	    
	    Scanner sc = new Scanner(System.in);
	    int cnt = sc.nextInt();
	    for(int i=0; i<cnt; i++) {
	    	
	    	String a = sc.next();
	    	if(a.equals("push")) {
	    		b = sc.nextInt();
	    		que.add(b);
	    	}else if(a.equals("front")){
	    		System.out.println(que.isEmpty()?-1:que.peek());
	    	}else if(a.equals("back")) {
	    		System.out.println(que.isEmpty()?-1:b);
	    	}else if(a.equals("size")) {
	    		System.out.println(que.size());
	    	}else if(a.equals("pop")) {
	    		System.out.println(que.isEmpty()?-1:que.poll());
	    	}else if(a.equals("empty")) {
	    		System.out.println(que.isEmpty()?1:0);
	    	}
	    }
	}
}
