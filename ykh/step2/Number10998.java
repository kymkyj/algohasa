package step2;

import java.util.Scanner;

public class Number10998 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 0 < A, B < 10
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a <= 0 || b >= 10) {
            System.out.println("범위를 벗어난 입력입니다!");
            return;
        }

        sc.close();

        System.out.println(a * b);
    }
}
