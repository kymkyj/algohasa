package ch04;

import java.util.Scanner;

public class ex1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int origin = sc.nextInt();
	        int changed = origin;
	        int cnt = 0;
	        do{
	            changed = changed%10*10 + (changed/10 + changed%10)%10;
	            cnt++;
	        }while(origin != changed);
	        System.out.print(cnt);
	}

}
