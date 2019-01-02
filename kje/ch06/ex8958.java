package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 간단히 생각하기
 * 더해주는 값을 temp라고 두고, O를 만나면 tmp값 증가시켜주고 result에 더하면된다.
 * x라면? -> temp를 0으로 만들어줌 
 */

public class ex8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc-- != 0) {
			int result = 0;
			int tmp = 0;
			String input = br.readLine();
			int size = input.length();
			
			for(int i=0; i<size; i++) {
				if(input.charAt(i)=='O') {
					result += ++tmp;
				}else {
					tmp = 0;
				}
			}
			System.out.println(result);
		}
		
	}

}
