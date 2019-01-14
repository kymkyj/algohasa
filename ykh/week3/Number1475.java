package week3;

import java.util.Scanner;

public class Number1475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input < 1000000
        int input = sc.nextInt();

        sc.close();

        // 입력받은 정수를 String으로 변환 후 split으로 쪼개 배열에 저장
        String inputStr = String.valueOf(input);
        String[] inputArr = inputStr.split("");

        // count : 6, 9가 아닌 수들의 갯수, snCount : 6, 9의 갯수, total : 전체 세트 갯수
        int count = 0, snCount = 0, total = 0;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].equals("6") || inputArr[i].equals("9")) {   // 6, 9의 갯수 파악
                snCount++;
            } else {
                count++;                                                // 6, 9가 아닌 수들의 갯수 파악
            }
        }

        if (snCount == 0) {                             // 6 또는 9가 없을 경우
            total = count;
        } else if (snCount % 2 == 0) {                  // 6 또는 9가 있으면서 그 갯수가 짝수인 경우 (6, 9의 갯수가 홀수/짝수인 상황을 나눠서 다르게 계산해야함)
            snCount = (snCount / 2);                    // 6, 9에 필요한 셋트의 갯수
            total = count + snCount;                    // 전체 세트 갯수 = (6, 9가 아닌 수들의 갯수) + (6, 9에 필요한 셋트의 갯수)
        } else if (snCount % 2 == 1) {                  // 6 또는 9가 있으면서 그 갯수가 홀수인 경우
            snCount = (snCount / 2) + (snCount % 2);    // 6, 9에 필요한 셋트의 갯수
            total = count + snCount;
        }

        System.out.println(total);
    }
}
