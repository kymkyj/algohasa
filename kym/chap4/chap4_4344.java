import java.util.Scanner;

public class chap4_4344 {
	/*
	 * 	문제
		대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
		
		입력
		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		
		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 
		점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		
		출력
		각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		
		5
		5 50 50 70 80 100										40.000%
		7 100 95 90 80 70 60 50									57.143%
		3 70 90 80							->					33.333%
		3 70 90 81												66.667%
		9 100 99 98 97 96 95 94 93 91							55.556%
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double [] score = new double[num+1];
		score[0] = num;
		
		for(int i=1; i <= num; i++) {
			if(score[i] >= 0 && score[i] <= 100) {
				score[i] = sc.nextInt();
			}
		}
		double sum = 0;
		double avg = 0;
		double result = 0;
		int count=0;
		
		for(int j=1; j < score.length; j++) {
			sum += score[j];
		}
		// 평균구하기
		avg = sum / num;
		
		for(int k=1; k < score.length; k++) {
			if(avg < score[k]) {
				count++;
			}
		}
		System.out.println(num);
		result = (double)count / (num * 100);
		System.out.println(result);
		
		sc.close();
	}
}
