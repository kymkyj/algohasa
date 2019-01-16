package Lv11;

import java.util.Scanner;
import java.util.Stack;

public class N9012 {

	public static boolean check(char[] sent) {
		Stack st = new Stack();

		for(int j=0;j<sent.length;j++) {

			char ch = sent[j];

			if(ch == '(') {
				st.push(ch);
			}
			else{
				if(!st.empty()) {
					st.pop();
				}
				else{
					return false;
				}
			}
		}
		if(st.empty()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=T;i++) {
			String input = sc.nextLine();
			char word[]= input.toCharArray();
			boolean ans=check(word);
			System.out.println(ans == true? "YES" : "NO");
		}
	}
}

