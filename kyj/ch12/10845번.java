package Baekjoon;

/* (������� : 50.717%)

 * ������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	����� �� ���� �����̴�.

	push X: ���� X�� ť�� �ִ� �����̴�.
	pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ť�� ����ִ� ������ ������ ����Ѵ�.
	empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 */

/**
 * ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
 * �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 * 
 * ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * ���ð� ���� ������ �����̴� 
 * 
 * �ڷ� ���� �˰����� �˾� �θ� ������ ���� �ڼ��� ����� �׸��� �ּҸ� ÷���Ѵ�
 * https://www.leafcats.com/125
 * �����ϰ� �ڷᱸ�� �˰����� ���� ���̴� Stack, Queue, Deque, heap�� ������ 
 * Stack�� (FILO: �������� ), Queue�� (FIFO: ���Լ���)
 * Deque (Stack + Queue�� ȥ�յ� ���� ), Heap(�ڷ� �������� �ִ방, �ּҰ� ������ ã�� ���� ���, ���� ����Ʈ������) 
 * ���� ���� Ʈ����? >> ������ ��尡 �ּ� �ΰ� �� �ڽ� ��带 ������ Ʈ�� �ڷ� ������ ���Ѵ�. 
 */


// java.lang.Queue�� ����� ���̱� ������ �ڼ��� �ּ��� �����Ѵ�. 

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
