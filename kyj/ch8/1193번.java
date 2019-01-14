package Baekjoon;

import java.util.Scanner;

/*
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

	1/1	1/2	1/3	1/4	1/5	…
	2/1	2/2	2/3	2/4	…	…
	3/1	3/2	3/3	…	…	…
	4/1	4/2	…	…	…	…
	5/1	…	…	…	…	…
	…	…	…	…	…	…
	이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
	
	 

	X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */

/**
 *	첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 *	첫째 줄에 분수를 출력한다.
 *
 *	#1) 1번 1/1 2번 1/2 3번 2/1 4번 3/1 5번 2/2 6번 2/3 7번 3/2 8번 3/3 9번 3/4 10번 4/3 ... X번째 노가다 해서 구하기?
 *	#2) 대각선을 주목해보면 1/1 >> 2/1, 1/2 >> 3/1, 2/2, 1/3, >> 4/1, 3/2, 2/3, 1/4, >> 5/1, 4/2, 3/3, 2/4, 1/5 처럼 한개씩 늘어난다. 
 *	즉 각 대각선을 한 그룹으로 치면 1개, 2개, 3개, .... 차례대로 늘어난다. 
 *	한 그룹의 분수의 갯수는 분자와 분모가 되고,  홀수냐 짝수냐에 따라 분모와 분자의 순서도 달라진다. 
 *	즉 ==>
 *	while(그룹 분자 갯수들의 합 < 입력한 x )
 *	그룹 분수 갯수 += 1
 *	그룹 분수 갯수들의 합 += 그룹 분자 갯수
 *	
 *	temp = 현재 그룹의 분수 갯수
 *	A = 1//분자 or 분모가 될 수 
 *
 *	for(현재 그룹 이전까지의 합부터 n까지 )
 *	현재 그룹의 분수 갯수 -= 1
 *	A += 1
 *
 *	if temp가 홀수면
 *
 *	cntOfGroup + "/" + A
 *	
 *	else if temp가 짝수라면
 *	A + "/" + cntOfGroup 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt(); // input 입력
		int cntOfGroup = 0; int sum = 0; // 그룹분자의 개수와, 그룹 분수의 갯수의 합을 각각 선언한다. 
		
		while(sum < n) {	// while 반복문을 돌려 몇번째 그룹에 n이 있는지 찾기 // 그룹 분자들의 갯수의 합이 n보다 작으면 
			cntOfGroup++;	// 그룹 분수 갯수를 ++ 
			sum += cntOfGroup; // 총합에 그룹 분자의 갯수를 더해준다 
		}
		int temp = cntOfGroup; // temp는 현재 그룹의 분수의 갯수 
		int A = 1;
		for(int i= (sum-cntOfGroup)+1; i<n; i++) { // 분수의 갯수의 합 - 현재의 개수의 합 +1 만큼 반복문을 돌린다 
			cntOfGroup--;
			A++;
		}
		System.out.println(temp%2 !=0 ? cntOfGroup + "/" + A : A + "/" + cntOfGroup); // temp가 홀수면 cntOfGroup + "/" + A
																					  // temp가 짝수면 A + "/" + cntOfgroup
	}
}
