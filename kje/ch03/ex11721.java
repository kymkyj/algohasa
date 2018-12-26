package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11721 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String TC = br.readLine();
		br.close();
		for(int i=0;i<TC.length(); i++) {
			System.out.print(TC.charAt(i));
			if(i %10 ==9) {
				System.out.println();
			}
		}
	}

}
