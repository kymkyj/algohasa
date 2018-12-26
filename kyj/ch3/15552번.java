package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. (대용량으로 처리할때)
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

/**
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. 
 * A와 B는 1 이상, 1,000 이하이다.
 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 */

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // 선언 
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		
		// Tip:
		// Scanner와 BufferedReader, BufferedWriter이 다른점은 Scanner은 엔터와 스페이스 모두 경계로 인식하기에 사용하기에는 편리하지만
		// 반대로 BufferedReader, BufferedWriter은 엔터만을 경계로 인식하기에 가공을 해야할 필요성이 있어 불편하지만 다만
		// BufferedReader과 BufferedWriter은 대용량의 데이터를 처리하기에 Scanner보다 편리하므로 사용한다.
		
		int n = Integer.parseInt(br.readLine().trim()); // Integer.parseInt로 정수로 변환을 거친후 readLine().trim()을 통해 공백없이 읽어온다.
		
		for(int i=0; i<n; i++) {
			String text = br.readLine(); // 한줄을 읽어온다. 
			String [] word  = text.split(" "); // word[]배열의 글자의 " "(공백)을 기준으로 자른다. (??) 
			int a = Integer.parseInt(word[0]); // word[]배열에서 정수 변환을 거쳐 a 에 대입한다
			int b = Integer.parseInt(word[1]); // word[]배열에서 정수 변환을 거쳐 b 에 대입한다 
			bw.write((a+b) + "\n"); // (a+b)를 출력 
		}
		bw.flush();  // 남아있는 데이터를 모두 출력한다. 
		bw.close();	
	}
}
