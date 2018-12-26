import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class chap3_15552 {
	/*
	 * 문제
		본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
		
		Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
		BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
		자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
		이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
		
		입력
		첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		출력
		각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		
		5					
		1 1							2
		12 34						46
		5 500			->			505
		40 60						100
		1000 1000					2000
		
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// readLine() 함수를 이용하면 String 값을 가져온다. 그러므로 만일 int로 변경시 형변환 필요
		int n = Integer.parseInt(br.readLine());
		
		 for(int i = 0; i < n; i++) {
	            String x = br.readLine();
	            int index = x.indexOf(" ");
	            int n1 = Integer.parseInt(x.substring(0, index));
	            int n2 = Integer.parseInt(x.substring(index+1,x.length()));
	            bw.write((n1+n2) + "\n");
	        }
	        bw.close();
	        br.close();
	    }
}
