package bojExam;

import java.util.Scanner;

public class ex5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int result = 0;
		for(int i=0; i<input.length(); i++) {
			char a = input.charAt(i);
			if(a =='A' || a =='B' || a =='C') {
				result+=3;
			}else if(a =='D' || a =='E' || a =='F') {
				result+=4;
			}else if(a =='G' || a =='H' || a =='I') {
				result+=5;
			}else if(a =='J' || a =='K' || a =='L') {
				result+=6;
			}else if(a =='M' || a =='N' || a =='O') {
				result+=7;
			}else if(a =='P' || a =='Q' || a =='R' || a =='S') {
				result+=8;
			}else if(a =='V' || a =='T' || a =='U') {
				result+=9;
			}else if(a =='W' || a =='X' || a =='Y' || a=='Z') {
				result+=10;
			}
			
		}
		System.out.println(result);
	}

}
