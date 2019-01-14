package Baekjoon;

/*
 * 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 
 */

/**
 * 입력 :  입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
   입력의 마지막에는 0이 주어진다.
   
   출력 : 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
 */

/**	핵심내용 
 * http://brenden.tistory.com/51 >> 참고 
 *  (1) 에라토스테네스의 체 개념을 묻는 문제이다. >> 에라토스테네스의 체란 소수판별 알고리즘으로서 소수를 대량으로 빠르고 정확하게 구하는 방법
	(2) 1000000까지의 모든 소수를 판단할 수 있는 isPrime 배열에 담아줍니다.
	(3) 해당 Index에 소수인지 파악하여 총 갯수를 세줍니다.
	해결방법 
	(1) 소수인지 아닌지 여부를 파악하기 위한 isPrime 배열의 초기화를 진행해 줍니다.
	(2) is prime 을 통해 소수 여부를 갱신해 줍니다.
	(3) while문을 통해 n부터 2n까지의 숫자 내에 소수 갯수를 카운트해줍니다.
 */
import java.util.Scanner;

public class Main {
    public static final int MAX = 1000000; // 최대 값을 1000000으로 둔다. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	
        boolean[] isPrime = new boolean[MAX+1]; // boolean 타입의 배열을 선언하여 
        for(int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }
    	
        for(int i = 2; i <= MAX; i++) {
            for(int j = i * 2; j <= MAX; j += i) {
                if(!isPrime[j]) continue;
                isPrime[j] = false;
            }
        }
    	
        while(true) {
            int n = sc.nextInt();
            if(n == 0)
                break;
            int cnt = 0;
            for(int i = n+1; i <= 2*n; i++) {
                if(isPrime[i])
                    ++cnt;
            }
            System.out.println(cnt);
        }
    }
}
