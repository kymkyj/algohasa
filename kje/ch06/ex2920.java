package bojExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr = new int[8];
		String result = "";
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<8; i++) {
			if(arr[i] == arr[i-1] + 1) {
				result = "ascending";
			}else if(arr[i] == arr[i-1] - 1) {
				result = "descending";
			}else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}
	
	

}
