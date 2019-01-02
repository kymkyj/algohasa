package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input1 = Integer.parseInt(br.readLine());
		int input2 = Integer.parseInt(br.readLine());
		int input3 = Integer.parseInt(br.readLine());
		
		String result = Integer.toString(input1*input2*input3);
		int size = result.length();
		
		int[] arr = new int[10];
		for(int i=0; i<size; i++) {
			arr[result.charAt(i)-'0']++;
		}
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
