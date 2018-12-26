package step3;

import java.util.Scanner;

public class Number2741 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        sc.close();

        if (n < 1 || n > 100000) {
            System.out.println("범위를 벗어난 입력입니다!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
