package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int arr[] = new int[26];
		Arrays.fill(arr, -1);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int size = input.length();
		for(int i=0; i<size; i++) {
			if(arr[input.charAt(i)-97] == -1) {
				arr[input.charAt(i)-97] = i;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
