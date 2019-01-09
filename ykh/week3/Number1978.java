package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int count;
        int pnCount = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            count = 0;

            int a = Integer.parseInt(st.nextToken());

            for (int j = a; j > 0; j--) {
                if ((a % j) == 0) {
                    count++;
                    if (count > 2) {
                        break;
                    }
                }
            }
            if (count == 2) {
                pnCount++;
            }
        }

        System.out.println(pnCount);
    }
}
