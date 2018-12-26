package ch04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class ex1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		float[] arr = new float[input];
		float max = 0;
		float sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<input; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		max = arr[input-1];
		
		for(int i=0; i<input; i++){
			arr[i] = arr[i]/max * 100;
			sum += arr[i];
		}
		System.out.println(sum/input);
	}

}
