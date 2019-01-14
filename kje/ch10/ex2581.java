package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int min = 0;
		int sum = 0;
		boolean isSosu = false;
		
		for(int i=first; i<=second; i++) {
			if(i == 2) {
				isSosu = true;
			}
			for(int j=2; j<i; j++) {
				if(i%j != 0) {
					isSosu = true;
				}else {
					isSosu = false;
					break;
				}
			}
			if(isSosu) {
				sum += i;
				if(min==0) min = i;
			}
		}
		if(sum == 0) {
			sb.append("-1");
			System.out.println(sb);
		}else {
			sb.append(sum+"\n"+min);
			System.out.println(sb);
		}
	}

}
