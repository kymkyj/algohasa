package step2;

import java.util.Scanner;

public class Number10869 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        // 1 ≤ A, B ≤ 10,000
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < 1 || b > 10000) {
            System.out.println("범위를 벗어난 입력입니다!");
            return;
        }

        sc.close();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
