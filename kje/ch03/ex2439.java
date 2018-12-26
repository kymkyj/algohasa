package ch03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class ex2439 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(st.nextToken());
		for(int i=1; i<=tc; i++) {
			for(int j=tc-i; j>0;j--) {
				bw.append(" ");
			}
			for(int j=i; j>0; j--) {
				bw.append("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
