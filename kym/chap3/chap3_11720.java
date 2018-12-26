import java.util.Scanner;

public class chap3_11720 {
	/*
	 * 	문제
		N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		
		출력
		입력으로 주어진 숫자 N개의 합을 출력한다.
		
		54321 / 15
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 String input = sc.next();
		 
		 sc.close();
		 
		 if(num != input.length()) {
			 System.out.println("num 길이랑 동일해야 합니다.");
			 return;
		 }
		 int sum = 0;
		 
		 for(int i=0; i<num; i++) {
			 sum += input.charAt(i) - '0';
		 }
		 System.out.println(sum);
	}
}

