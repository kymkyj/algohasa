package Baekjoon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


/*
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */

/**
 *	첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 *	이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 *	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */

/**
 * #1) ArrayList에 제너릭스를 통해 입력값을 지정해주고 배열 또는 컬렉션을 sort를 통해 정렬 
 * #2 다른사람 코드) 삽입정렬 :	(1) 1번째 배열부터 시작해서 앞에 있는 칸을 비교  
 * 						 	(2) 0번째 배열이 자기보다 크면 1번째로 넘겨버리 자기가 그 자리를 차지
 * 							(3) 계속 이렇게 넘어가면서 앞에있는 숫자와 비교한다.
 * 							(4) 자기가 들어갈 자리 찾아서 들어가고 그 뒤는 밀려서 저장
 * 
 * #3 다른사람 코드) 버블정렬 : 한칸 옆의 칸을 비교하여 바꿔줌
 * 							(1) 한바퀴를 다 돌면 마지막 숫자는 구해짐 >> 처음부터 끝의 배열까지 다 돌아야 하기 때문에 배열의 길이 -1
 * 							(2) 2바퀴 째는 배열의 길이 -2 만큼 돈다.
 * #4) 퀵정렬로 하는 방법도 있다고 합니다.. 
 */

public class Main {
	public static void main(String[] args) {
		    	ArrayList<Integer> list = new ArrayList<Integer>(); // 제너릭스를 통해 <Integer> 타입으로 명시한다. 
		    	
		    	Scanner sc = new Scanner(System.in);
		    	int n = sc.nextInt();	// n개의 수를 입력받는다. 
		    	
		    	for(int i=0; i<n; i++) {	// n개의 수만큼 반복문을 돌린다. 
		    		int a = sc.nextInt();	// 특정 숫자 a를 받는다. 
		    		list.add(a);	// a를 리스트에 추가한다. 
		    	}
		    	Collections.sort(list);	// List를 Collection sort를 이용해 정렬한다. 
		    	for(int i:list) {	// 리스트만큼 반복문을 돌린다음 
		    		System.out.println(i);	// 출력한다. 
		}
	}
}		
		
// *********************************************************************************************************************************

/*
public class BJ2750_insert2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int [sc.nextInt()];
		int temp = 0;
		
		for(int i=0; i<number.length; i++) {	// 입력받기 
			number[i] = sc.nextInt();
		}
		
		for(int i=1; i<number.length; i++) {	// 1번째 부터 비교하면서 채워나간다. 
			int key = number[i];	// 계속 값이 변하니 key 값에 저장 
			int j= i-1; // 자기보다 한칸 작은 수부터 비교 시작한다. 
			while(j>=0 &&  number[j]>key) {	// 0칸 까지면서 key값보다 커서 바꿔야할 칸 찾기 
				number[j+1] = number[j];	// 한칸씩 미뤄서 저장 
				j--; // j에서 -1칸 이동 
			}
			
			number[j+1] = key;	// j가 -1이 되어있으니까 +1해서 number[j]에 key 값 넣기 
		}
			for(int i=0; i<number.length; i++) {	// 출력하기 
				System.out.println(number[i]);
			}
	}
}
*/

// **********************************************************************************************************************************

/*
public class BJ2750_bubble {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int [sc.nextInt()];
		int temp = 0;
		
		for(int i=0; i<number.length; i++) {	// 입력받기 
			number[i] = sc.nextInt();
		}
		for(int times=number.length; times>0; times--) {	// 회전 수 
			for(int i=1; i<number.length; i++) { // 비교하는 수 
				if(number[i]<number[i-1]) {	// 앞에 있는 수가 더 크면 서로 바꾸기 
					temp = number[i];
					number[i] = number[i-1];
					number[i-1] = temp;
				}
			}
		}
		for(int i=0; i<number.length; i++) { // 출력하기 
			System.out.println(number[i]);
		}
	}
}
*/