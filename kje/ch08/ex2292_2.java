package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2292_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int sum = 1;
		int cnt = 1;
		
		//2~7 -> 1개 (6개) -> 1*6
		//8~19 -> 2개 (12개) -> 2*6
		//20~37 -> 3개(18개) ->3*6
		//38~61 -> 4개(24개)
		// 우리가 입력한 값과 같아지는 순간까지를 카운트하면된다.
		while(sum < input) {
			sum += cnt*6;
			cnt++;
		}
		System.out.println(cnt);
	}

}
