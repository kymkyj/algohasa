package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Number2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());

        //int[] arr = new int[m];

        int count;

        List<Integer> arrayList = new ArrayList<>();

        // m 이상 n 이하의 소수
        for (int i = m; i <= n; i++) {
            count = 0;

            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 3) {
                    break;
                }
            }
            if (count == 2) {
                arrayList.add(i);
            }

        }

        int sum = 0;

        if (arrayList.isEmpty()) {
            System.out.println(-1);
        } else {
            for (Integer prime : arrayList) {
                sum += prime;
            }
            System.out.println(sum);
            System.out.println(arrayList.get(0));
        }
    }
}
