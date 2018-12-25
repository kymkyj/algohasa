package step2;

import java.util.Scanner;

public class Number2558 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        // 0 < A, B < 10
        a = sc.nextInt();
        b = sc.nextInt();

        if (a <= 0 || b >= 10) {
            System.out.println("범위를 벗어난 입력입니다!");
        }

        sc.close();

        System.out.println(a+b);

    }

}
