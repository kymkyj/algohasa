package step2;

import java.util.Scanner;

public class Number10430 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        // 2 ≤ A, B, C ≤ 10000
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > 2 && a >10000 || b > 2 && b > 10000 || c > 2 && c > 10000) {
            System.out.println("범위를 벗어난 입력입니다!");
            return;
        }

        sc.close();

        System.out.println((a+b)%c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c*b%c)%c);
    }

}
