package Baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); // 세준이가 시험을 본 과목의 개수
		int total = 0; // 시험의 총점수 
		int max = 0; // 시험을 본 점수중의 최대값 
		int score; // 현재 시험점수 
		for(int i=0; i<n; ++i) { // 세준이가 시험을 본 과목들을 반복문을 돌린다. (1) for 문 
			score=sc.nextInt(); // 다음 점수가 있으면 읽어온다.(2)
			total += score; // 총점에 시험점수를 더한다 (1) 을 반복한다. 
			if(score > max) { // 시험점수가 최대값보다 커지게 되면 
				max = score; // 최대값에 시험점수를 대입한다.  
			}	
		}
		sc.close();
		
		double average = 0; // 평균은 소수점으로 나누어 떨어질수 있으므로 double로 선언한다. 
		average = 100.0 * total / max / n; // 여기서 >> 평균 = M * 100.0 이므로 
										   // 100.0 * 총점수 / 최고점수 / 과목의 개수 
		System.out.printf("%.2f", average); // %.2f >> 점 우측에 해당하는 숫자(2)만큼 소수점 이하의 자리수를 반올림하여 길이를 만든다. 
	}
}
