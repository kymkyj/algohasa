package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String input1 = st.nextToken();
		String input2 = st.nextToken();
		String temp1 = "";
		String temp2 = "";
		for(int i=2; i>=0; i--) {
			temp1 += input1.charAt(i);
			temp2 += input2.charAt(i);
		}
		System.out.println((Integer.parseInt(temp1)>Integer.parseInt(temp2)) ? temp1:temp2);
		
	}

}
