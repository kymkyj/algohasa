package step3;

import java.util.Scanner;

public class Number2440 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        if (n < 1 || n > 100) {
            System.out.println("범위를 벗어난 입력입니다!");
        }

        for (int i = n; i >= 1; i--) {
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
