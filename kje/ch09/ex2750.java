package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		int size = input.length();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = input.charAt(i) - 48;
		}
		Arrays.sort(arr);
		
		for(int i=size-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb);
	}

}
