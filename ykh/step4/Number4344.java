package step4;

import java.util.Scanner;

public class Number4344 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        // 각 테스트의 결과값을 저장하기 위한 배열
        double[] tests = new double[test];
        // 학생의 수는 1~1000
        int[] scores = new int[1000];

        for(int i = 0; i < test; i++) {
            int n = sc.nextInt();

            int total = 0;
            double avg = 0;
            int count = 0;

            // 점수 입력, 평균 구하기
            for(int j = 0; j < n; j++) {
                scores[j] = sc.nextInt();
                total += scores[j];

                if (j == n-1) {
                    avg = (double) total / n;
                }
            }

            // 평균을 넘는 비율 구하기
            for (int k = 0; k < n; k++) {
                if (avg < scores[k]) {
                    count++;
                }
            }
            // 결과값 저장
            tests[i] = (double) count / n * 100;
        }

        sc.close();

        // 입력한 후 결과값 출력
        for (int i = 0; i < tests.length; i++) {
            System.out.println(String.format("%.3f", tests[i]) + "%");
        }
    }
}
