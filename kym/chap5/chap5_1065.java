import java.util.Scanner;

public class chap5_1065 {
	/*
	 * 	문제
		어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
		등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
		N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		
		입력
		첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		
		출력
		첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		
		110 -> 99
		
		자리수가 등차수열을 이루면 한수라고 함.
		등차수열은 연속된 두 개의 수의 차이가 일정한 수열
		N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 갯수를 출력하는 프로그램
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		sc.close();
		
		if(N >=1 && N <= 1000) {
			if(N > 99) { // 세자리수 이상일 경우 판단 로직
				count += 99;
				for(int i=100; i<=N; i++) {
					if((i%100)/10 - i/100 == (i%100)%10 - (i%100)/10) {
						count++;
					}
				}
				System.out.println(count);
			}else {
				count = N; // 세자리수 이하는 모두 한수
				System.out.println(count);
			}
		}else {
			System.out.println("N의 값이 초과하였습니다.");
			return;
		}
	}
}
