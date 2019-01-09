package week3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Number4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;

        List<Integer> arrayList = new ArrayList<>();

        int input = 0;

        while(flag) {
            input = Integer.parseInt(br.readLine());

            if (input == 0) {
                flag = false;
                continue;
            }
            // 입력한 값을 어레이리스트에 저장
            arrayList.add(input);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            int prime = 0;          // 소수의 갯수를 저장하기 위한 변수

            if (arrayList.get(i) == 1) {
                System.out.println(1);
                continue;
            }

            // n 초과 2n 이하
            for (int j = arrayList.get(i)+1; j <= arrayList.get(i)*2; j++) {
                int count = 0;      // 소수인지 아닌지 판별하기 위한 변수

                // 맨처음에 k는 j부터 j의 제곱근까지 j를 1개씩 빼면서 계산하였으나 그러면 성능상 매우 안좋음(for문을 굉장히 많이 돔 -> 비효율적)
                // 따라서 2부터 j의 제곱근 까지 나눠 나누어 떨어지는 수가 있으면 count를 증가시키는 방식을 사용
                for (int k = 2; k <= (int)Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        count++;
                    }

                    if (count > 0) {
                        break;
                    }
                }

                if (count == 0) {
                    prime++;
                }
            }

            System.out.println(prime);
        }
    }
}
