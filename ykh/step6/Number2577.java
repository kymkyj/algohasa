package step6;

import java.util.Scanner;

public class Number2577 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt(),
            inputB = sc.nextInt(),
            inputC = sc.nextInt();

        sc.close();

        // 곱셈의 결과를 String형으로 형변환 후 String 변수 total에 할당
        String total = String.valueOf(inputA * inputB * inputC);

        String[] charArr = total.split("");

        // 크기가 10인 배열 생성 (0~9)
        int[] countArr = new int[10];

        for (int i = 0; i < countArr.length; i++) {
            int count = 0;
            for (int j = 0; j < charArr.length; j++) {
                if (i == Integer.parseInt(charArr[j])) {
                    count++;
                    countArr[i] = count;
                }
            }
        }

        for (int count : countArr) {
            System.out.println(count);
        }
    }
}
