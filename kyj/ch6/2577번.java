package Baekjoon;

/*세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 

A × B × C = 150 × 266 × 427 = 17037300 이 되고, 

계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

*/

/**
 * 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다
 * 첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
 * 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 */

/**
#1 % 연산자 이용

숫자를 10으로 나눈 나머지는 1의 자리의 수가 됩니다.

이렇게 나머지를 구하여 0~9 인덱스를 가지는 배열에 카운트를 더하고,

실제 숫자를 10으로 나눕니다.

그리고 while을 사용하여 나눈 숫자가 0보다 큰 동안 반복하여 진행하였습니다.


#2 String 클래스 이용

아래 3개 함수를 활용하여, 문자열로 1글자씩 처리하였습니다.

- valueOf(number) : 해당 number를 String으로 변환하여 반환합니다.

- length() : 문자열의 길이를 반환합니다.

- charAt(index) : 해당 문자열의 index에 위치한 문자를 char 형으로 반환합니다.

 */


// #1
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();		// A, B, C를 각각 선언 
        sc.close();
         
        int[] counts = new int[10]; // 크기가 10인 counts 배열 선언 
        int number = A * B * C;	 // 각각의 A, B, C를 곱한다.
        while (number > 0) {
            counts[number % 10]++;
            number /= 10;		// 숫자를 10으로 나누고 나머지를 계속 count에 더한다 why?? >> 어떤수라도 10으로 나누면 나머지가 1자리 수가 되는데 
            					// 이를 계속 10으로 나누어 숫자(number)가 0이 되도록 나눈다 
           // System.out.println(number);     
            						// >> ex) 555, 666, 777 >>> 28720251 >>> 2872025 >>> 287202 >> 2872 >> 287 >> 28 >> 2>> 0
            						//  나눈 것을 나머지만 거꾸로 읽어 보면 처음 수가 된다 28720251 
        }
 
        for (int i = 0; i < counts.length; ++i) {
           System.out.println(counts[i]);
        }
    }
}

//-------------------------------------------------------------------------------------------------------



/*
#2

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
         
        int[] counts = new int[10];
        String input = String.valueOf(A * B * C);
        for (int i = 0; i < input.length(); ++i) {
            counts[input.charAt(i) - '0']++;
        }
         
        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
    }
}
*/