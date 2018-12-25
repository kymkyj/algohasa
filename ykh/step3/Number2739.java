package step3;

import java.util.Scanner;

public class Number2739 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        sc.close();

        if (n < 1 || n > 9) {
            System.out.println("범위를 벗어난 입력입니다!");
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
