package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Number2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수 입력
        int n = Integer.parseInt(br.readLine());

        List<Integer> arrayList = new ArrayList<>();

        boolean flag = true;
        int index = 0;
        int firstNumber = 2;
        int diff = 6;

        arrayList.add(index, 1);
        index++;
        arrayList.add(index, firstNumber);

        while(flag) {
            index++;
            firstNumber += diff;

            arrayList.add(index, firstNumber);

            diff += 6;

            if (firstNumber >= 1000000000) {
                flag = false;
            }
        }

        for (int i = 0; i < arrayList.size()-1; i++) {
            if (n >= arrayList.get(i) && n < arrayList.get(i+1)) {
                System.out.println(i+1);
                return;
            }
        }
    }
}
