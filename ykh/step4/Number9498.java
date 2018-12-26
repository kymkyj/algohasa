package step4;

import java.util.Scanner;

public class Number9498 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        sc.close();

        if (score < 0 || score > 100) {
            System.out.println("잘못 입력하셨습니다!");
            return;
        }

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
