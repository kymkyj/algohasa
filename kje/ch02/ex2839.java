package ch02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ex2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int five = input/5;
		input = input%5;
		int three = 0;
		
		while(five >= 0) {
			if(input%3 == 0) {
				three = input/3;
				input = input%3;
				break;
			}else {
				//여기서 five를 다 계속 줄여줌 0이상일때까
				five--;
				input += 5;
			}
		}
		//input이 0이 아니면 -1
		System.out.println((input == 0) ? five+three : "-1");
	}

}
