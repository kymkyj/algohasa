package Baekjoon;

import java.util.Scanner;

/*
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 

예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

 */

/**
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
 * 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
 * 각 테스트 케이스마다 점수를 출력한다. 
 * 
 * 풀이 방법 : 
 * 
 * String 배열을 각 케이스를 만들어 문자열로 입력받습니다.

	for 문을 사용하여 점수를 구하고 더해주었습니다.

	count 의 초기값이 0이고 또 'X' 일 때 0으로 설정하므로,

	'O' 가 될 때마다 count를 전위증가(++count) 한 후 total에 더해주었습니다.
 */

public class OX퀴즈 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N =sc.nextInt();
		String [] cases = new String[N]; // 선언 
		for (int i = 0; i < N; i++) {
            cases[i] = sc.next(); // O인지, X인지 ,연속된 것인지 구분해야 하므로 문자 하나하나를 봐야하기 때문에 next()로 받는다. 
        }
        sc.close();
        
        int count, total;
        for (String OXresult : cases) { // 배열에서 사용할수 있는 반복문의 표현 cases 배열의 수만큼 반복문을 돌린다. 
            count = 0;
            total = 0;
            for (int i = 0; i < OXresult.length(); ++i) {
                if (OXresult.charAt(i) == 'O') { // 정답일 경우 
                    total += ++count; // 카운트를 올린다.
                } else {
                    count = 0; // 그렇지 않을경우 0
                }
            }
            System.out.println(total); // 출력 
        }
	}
}