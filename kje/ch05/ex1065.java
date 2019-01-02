package bojExam;

import java.util.Scanner;

public class ex1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int cnt = 0;
		if(input <100) {
			cnt = input;
		}else{
			cnt += 99;
			for(int i=100; i<=input; i++) {
				if((i%100)/10 - i/100  == i%10 - (i%100)/10 ) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
