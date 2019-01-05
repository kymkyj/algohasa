package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1475_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int size = input.length();
		int[] arr = new int[26];
		//해당하는 숫자만큼 카운트
		for(int i=0; i<size; i++) {
			arr[input.charAt(i)-48]++;
		}
		int avg = arr[6]+arr[9];
		if(avg%2 == 0) {
			arr[6] = avg/2;
			arr[9] = avg/2;
		}else {
			arr[6] = avg/2 + 1;
			arr[9] = avg/2 + 1;
		}
		
		//가장 큰 값이 필요한 셋트의 개수
		int max = 0;
		for(int num : arr) {
			max = Math.max(max, num);
		}
		System.out.println(max);
	}
}
