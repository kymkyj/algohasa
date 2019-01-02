package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String input = br.readLine();
		for(int i=0; i<arr.length; i++) {
			input = input.replace(arr[i], "*");
		}
		System.out.println(input.length());
	}

}
