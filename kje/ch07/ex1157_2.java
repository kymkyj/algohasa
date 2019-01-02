package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ex1157_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] arr = new int[26];
		int size = input.length();
		int max = 0;
		char result = '?';
		for(int i=0; i<size; i++) {
			arr[input.charAt(i)-65]++;
			//max보다 값이 더 크다면
			//max는 그 인덱스에 해당하는 값이 되고 result에는 문자 넣어준다.
			// max값과 같다면 -> ?출
			if(max < arr[input.charAt(i)-65]) {
				result = input.charAt(i);
				max = arr[input.charAt(i)-65];
			}else if(max == arr[input.charAt(i)-65]) {
				result = '?';
			}
			
		}
		System.out.println(result);
		
	}

}
