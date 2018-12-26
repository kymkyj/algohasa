package Baekjoon;

import java.util.*;

// 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.

/**
 * 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 * 
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 *
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt(); // x를 달로 선언
		int y=sc.nextInt(); // y를 일로 선언 
		//int cnt= 0; 
		sc.close();
		
		int [] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		// cnt= month[i];
		
		// cnt+=y;
		
		/* switch(cnt % 7) 스위치 문으로도 가능할것 같음 
		case 1:
		System.out.println("MON");
		break;
		case 2:
		System.out.println("TUE");
		break;
		case 3:
		System.out.println("WED");
		break;
		case 4:
		System.out.println("THU");
		break;
		case 5:
		System.out.println("FRI");
		break;
		case 6:
		System.out.println("SAT");
		break;
		case 7:
		System.out.println("SUN");
		break;
		*/
		
		int totaldays = y;
		for(int i=0; i<x-1; ++i) {
			totaldays+=month[i];
		}
		System.out.println(day[totaldays % 7]);
	}
}
