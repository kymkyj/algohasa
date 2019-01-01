package step6;

import java.util.Scanner;

public class Number10039 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // int[] scores = new int[5];
        int sum = 0;

        // 굳이 배열에 담을 필요 없음
        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();

            if (score < 40) {
                score = 40;
            }

            // scores[i] = score;
            sum += score;

            if (i == 4) {
                System.out.println(sum / 5);
            }
        }
        sc.close();
    }
}
