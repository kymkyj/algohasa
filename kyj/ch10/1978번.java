package Baekjoon;

import java.util.Scanner;

/*
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 */

/**
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 주어진 수들 중 소수의 개수를 출력한다.
 */
/**
 * 소수란? 약수가 자신과 1밖에 없는 수를 의미한다. 
 * 예) 2,3,5,7,11
 * 소수가 아닌수) 4,6,15,20 ...
 */
/**
 * 이 문제의 심화버전이 에라토스테네스의체 라고 한다. 
 * 에라토스테네스의 체 알고리즘 이란 소수를 찾는 방법을 고안한 에라토스테네스의 체를 프로그래밍 언어로 구현한 것이다. 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int S[] = new int [num]; // num을 배열에 집어 넣어 가변 배열 선언 
		
		int answer = num; // 아예 답을 넣어놓고 소수가 아닌것을 제외하는 방식으로 구한다. 
		
		for(int i=0; i<num; i++) {	
			S[i] = sc.nextInt(); 	//  반복문을 돌려 소수 배열 i를 입력받는다 
		}
		for(int i=0; i<num; i++) {
			if(S[i]==1) { // 1일경우 소수가 아닌것에 포함한다. 
				answer -= 1;
			}
		for(int j=2; j<S[i]; j++) {	// 자신보다 작은것으로 나누었을때 
			if(S[i] % j == 0) { // 0으로 나누어지는것이 있다면 소수가 아니므로 why? 소수는 자기자신과 1만을 약수로 가지기 때문에 0으로 나누어질수 없다.
				answer -= 1; // 답에서 제외한다. 
				break; 	// 하나만 나와도 소수가 아니니까 멈춘다. 
			}
		}
	}
	System.out.println(answer); // 출력한다 
	}
}
