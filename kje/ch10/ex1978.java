package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int tc = Integer.parseInt(br.readLine());
		int cnt = tc;
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<tc; i++) {
			int input = Integer.parseInt(st.nextToken());
			//1은 무조건 소수아님 
			if(input == 1) {
				cnt--;
			}else if(input > 2){
				//소수이면 -해주고 빠져나옴 
				//int root = (int) Math.sqrt(input);
				for(int j=2; j<input; j++) {
					if(input % j == 0 ) {
						cnt--;
						break;
					}
				}
			}
		}
		sb.append(cnt);
		System.out.println(sb);
		
	}

}
