package Lv6;

import java.util.Scanner;

public class N10039 {
	public static void main(String[] args) {
		
		int score[] = new int[5];
		int sum=0;
		int aver = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < score.length;i++) {
			score[i]=sc.nextInt();
		}
		for(int j=0; j< score.length;j++) {
			if(score[j]<40) {
				score[j]=40;
			}
			
			sum +=score[j];
		}
		aver = sum/5;
		System.out.println(aver);
	}

}
