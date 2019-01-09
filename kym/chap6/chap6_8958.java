import java.util.Scanner;

public class chap6_8958 {
	/*
	 * 	문제
		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
		
		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		
		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
		
		출력
		각 테스트 케이스마다 점수를 출력한다.
		
		5
		OOXXOXXOOO							10
		OOXXOOXXOO							9
		OXOXOXOXOXOXOX			->			7
		OOOOOOOOOO							55
		OOOOXOOOOXOOOOX						30
		
		접근방법
		1. O와 X로 이루어진 문자열을 입력한다.
		2. 입력받은 문자열에서 charAt을 사용해서 O일 경우 count++ 해주고 X인 경우 count를 0으로 초기화 시킨다.
		3. total 해주는 변수를 선언해서 count를 더해준다.
		
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] OX = new String[n]; // n만큼 배열의 크기를 만든다.
		
		for(int i=0; i<n; i++) { // for문을 통해 n만큼 반복하면서 입력한 문자열을 배열에 넣는다.
			OX[i] = sc.next();
		}
		sc.close();
		
		for(String result : OX) { // 향상된 for문으로 배열에 있는 값들을 하나씩 result에 담아준다.
			int count = 0;
			int total = 0;
			for(int i=0; i<result.length(); i++) {
				if(result.charAt(i)=='O') {
					count++;
					total = total + count;
				}else {
					count = 0;
				}
			}
			System.out.println(total);
		}
	}
}