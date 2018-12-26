package step3;

import java.util.Scanner;

public class Number2742 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        sc.close();

        if (n < 1 || n > 100000) {
            System.out.println("범위를 벗어난 입력입니다!");
            return;
        }

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
