package step3;

import java.io.*;

public class Number15552 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            // 입력
            String x = br.readLine();
            int index = x.indexOf(" ");
            // 공백의 index를 기준으로 나누기
            int n1 = Integer.parseInt(x.substring(0, index));
            int n2 = Integer.parseInt(x.substring(index+1,x.length()));
            bw.write((n1+n2) + "\n");
        }
        bw.close();
    }
}
