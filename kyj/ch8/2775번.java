package Baekjoon;

import java.util.Scanner;

/*
 * 평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.

이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.

아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 

단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
 */

/**
 * 첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다. (1 <= k <= 14, 1 <= n <= 14)
 * 각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 수를 입력받는다. 최대 14층 까지 
		
		for(int test=0; test<T; test++) {	// 테스트 케이스 수 만큼 반복문을 돌린다. 
			int k = sc.nextInt(); int n = sc.nextInt(); // 양의 정수 k층, n호를 받습니다. 
			
		int [] MyFloor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};	// (층)의 범위가 1<=k<=14이므로 현재는 테스트 케이스로 길이가 14인 배열을 선언  
		
		for(int i=0; i<k; i++) { // 반복문을 통해 층수를 구한다? 
			int sum = 0;	// 합을 선언한다. 
			for(int j=0; j<n; j++) { // 1호실에서 n호실 까지 
				sum+= MyFloor[j]; // 현재층 j호실 까지의 사람 수를 구한다. 
				MyFloor[j] =  sum; // 윗층 j호실에 현재층 j호실 까지의 사람 수 합을  넣는다. 
			}
		}
		System.out.println(MyFloor[n-1]); // 결론 : 윗층 n 호실의 사람의 수는 아래층 n호실 까지의 사람수의 합이기 떄문에 
										  // System.out.println([현재층-1])을 배열로 출력한다. 
		}
	}
}
