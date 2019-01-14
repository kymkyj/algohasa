package Lv7;

import java.util.Scanner;

public class N10809 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String [] chk = new String [26];

		for(int i = 0 ; i <input.length() ; i ++) {

			int index =input.charAt(i)-'a';
			if(chk[index]==null) {				
				chk[index] = Integer.toString(i);
			}
		}
		for(String idx : chk) {
			String result = idx==null ? "-1" :idx ;

			System.out.print(result+ " ");

		}
	} 

}
