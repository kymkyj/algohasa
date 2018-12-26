package step3;

import java.util.Scanner;

public class Number2439 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 1 ≤ N ≤ 100
        int n = sc.nextInt();

        sc.close();

        if (n < 1 || n > 100) {
            System.out.println("범위를 벗어난 입력입니다!");
            return;
        }

        for(int i = 1; i <= n; i++) {
            // 공백
            for(int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            // 별
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
