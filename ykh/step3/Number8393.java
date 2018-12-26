package step3;

import java.util.Scanner;

public class Number8393 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        sc.close();

        if (n < 0 || n > 10000) {
            System.out.println("범위를 벗어난 입력입니다!");
        }

        for(int i=1; i<=n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
