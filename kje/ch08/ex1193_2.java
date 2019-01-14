package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

n(n+1)/2 n이 3이면 6
n(n+1)/2 > input 일때의 n이 분모값임 14 -> 5번째 
분모+분자는 6이 나와야함 
근데 나온숫자가 홀수이면? -> 분모는 1부터 증가
짝수면 ? -> 분모는 나온값부터 -1

 */
public class ex1193_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int n=1;
		int sum = 0;
		while((n*n+n)/2 < input) {
			n++;
		}
		int start = (n*n-n)/2+1;
		int cnt = input-start;
		System.out.println(n%2==0 ? (1+cnt) +"/"+(n-cnt) : (n-cnt) +"/"+(1+cnt));
	}

}
