package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("");
		int result = 0;
		for(int i=0; i<TC; i++) {
			result += Integer.parseInt(str[i]);
		}
		System.out.println(result);
	}

}
