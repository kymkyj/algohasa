package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Number1546 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(score);

        double maxScore = score[score.length-1];

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + (score[i] / maxScore * 100);
        }

        double avg = sum / n;

        System.out.println("avg : " + avg);
    }
}
