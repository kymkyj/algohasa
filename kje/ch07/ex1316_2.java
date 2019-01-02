package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1316_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int cnt = tc;
		int[] arr = new int[26];
		while(tc-- != 0) {
			String input = br.readLine();
			arr[input.charAt(0)-97]++;
			for(int i=1; i<input.length(); i++) {
				//값이 0이 아니고(한번 나왔고) 현재 문자가 직전 문자와 다르다면 
				//예전에 한번 나온 문자임 
				if((arr[input.charAt(i)-97]!=0) && (input.charAt(i) != input.charAt(i-1))) {
					cnt--;
					break;
				}else {
					//새로운 것이라면? 값을 1로만들어주어야한다!
					arr[input.charAt(i)-97]++;
				}
			}
		}
		System.out.println(cnt);
	}

}
