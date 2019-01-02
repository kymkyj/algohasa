package bojExam;

import java.util.Scanner;

public class ex2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int tc = sc.nextInt();
		while(tc-- != 0) {
			int num = sc.nextInt();
			String input = sc.nextLine().trim();
			for(int i=0; i<input.length(); i++) {
				for(int j=0; j<num; j++) {
				sb.append(input.charAt(i));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}

}
