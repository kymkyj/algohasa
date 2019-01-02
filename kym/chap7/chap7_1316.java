import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chap7_1316 {
	/*
	 * 	문제
		그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
		예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
		aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
		
		단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
		둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
		
		출력
		첫째 줄에 그룹 단어의 개수를 출력한다.
		
		결과예시
		3
		happy		-> 3
		new
		year
		
		4
		aba
		abab		-> 1
		abcabc
		a
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int cnt = tc;
		int[] arr = new int[26];
		
		while(tc-- != 0) {
			String input = br.readLine();
			arr[input.charAt(0)-97]++;
			for(int i=1; i<input.length(); i++) {
				if((arr[input.charAt(i)-97]!=0) && (input.charAt(i) != input.charAt(i-1))) {
					cnt--;
					break;
				}else {
					arr[input.charAt(i)-97]++;
				}
			}
		}
		System.out.println(cnt);
	}
}
