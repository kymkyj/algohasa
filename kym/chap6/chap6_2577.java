import java.util.Scanner;

public class chap6_2577 {
	/*
	 * 	문제
		세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		예를 들어 A = 150, B = 266, C = 427 이라면 
		A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		
		입력
		첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
		
		출력
		첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
		마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		
		150	  ->	3
		266			1
		427			0
					2
					0
					0
					0
					2
					0
					0
		
		접근방법 
		1. 세자리의 자연수를 입력받는다.
		2. result 변수를 만들어 세자리수의 곱의 결과값을 넣어준다.
		3. 곱한 결과값에 문자의 길이만큼 for문을 돌려서.. 각 자리마다 charAt을 사용해서 0부터 9까지 찾으면 되지않을까?
		4. count를 주어 찾으면 ++ 해주고 count값을 배열에 넣어준다.
		5. 배열을 출력한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = A*B*C;
		sc.close();
		
		int [] num = new int[10];
		
		while(result > 0) {
			num[result%10]++;
			result/=10;
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
