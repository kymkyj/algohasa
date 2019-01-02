package Baekjoon;

import java.util.Scanner;

// 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

/**
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 * 
 * 접근 방법 :
 * 
 * 각 자리수 마다 나올수 있는 한수의 개수를 파악하는 것이 중요하다. 
 * 그리고 길이가 1000으로 정해져 있다는 것에 주목하고, 한수의 뜻만 파악할수 있다면 쉽게 풀수 있다. 
 * 
 * 한수란 " 각 자리의 수가 등차수열을 이루는 수를 말한다 " 
 * 등차수열이란 " 각 항들이 일정한 차이를 보이는 수열을 말한다 "
 * ex) 123(공차1) , 753(공차-2), 111(공차0) 등이 있다. 
 * 
 * 하지만 3자리수 미만인 경우에는 한수를 어떻게 구할까?
 * 결론은 1자리수와 2자리수는 모두 한수가 된다.
 *  why? 
 *  12(공차1) 13(공차2) 14(공차3) 15(공차4) .... 21(공차-1) 22(공차0) 23(공차1) 24(공차2) .... 99(공차0) 
 *  즉 1자리수와 2자리수의 한수의 총 개수는 99개 이다. 

 */
public class Main {	 
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     sc.close();
	         
	        if (n < 100) {
	            System.out.println(n);
	        } else {
	            int result = 99;
	             
	            for (int i = 100; i <= n; ++i) {
	                result += checkHanNumber(i);
	            }
	             
	            if (n == 1000) result--;
	             
	            System.out.println(result);
	        }
	    }
	     
	    private static int checkHanNumber(int number) {
	        int num1 = number / 100 % 10;
	        int num2 = number / 10 % 10;
	        int num3 = number % 10;
	         
	        if (num2 * 2 == num1 + num3) {
	            return 1;
	        }
	        return 0;
	    }
	}

