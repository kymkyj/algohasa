package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11718 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = null;
		while((input = br.readLine()) != null) {
			sb.append(input+"\n");
		}
		br.close();
		System.out.println(sb);
	}

}
