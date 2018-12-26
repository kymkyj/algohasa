import java.util.Scanner;

public class chap3_11721 {
	/*
	 * 	문제
		알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
		
		한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
		
		출력
		입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
		
		BaekjoonOnlineJudge	 ->	BaekjoonOn
								lineJudge
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		
		String check = "^[a-zA-Z]*$";
		
		if(N.matches(check) && N.length()<100 && N.length()>0) {
			for(int i=0; i<N.length(); i++) {
				if(i%10==0 && i!=0) {
					// i!=0 조건을 꼭 써줘야하는 이유???
					System.out.println();
				}else {
					System.out.print(N.charAt(i));
				}
			}
		}else {
			System.out.println("알파벳으로만 입력해주세요!");
			return;
		}
	}
}
