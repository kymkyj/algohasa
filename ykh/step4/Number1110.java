package step4;

import java.util.Scanner;

public class Number1110 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 한자리 혹은 두자리 자연수 입력
        int n = sc.nextInt();

        sc.close();

        int count = 0;

        int ten, one, sum, result = 0;

        while(true) {
            if (count == 0) {
                ten = n / 10;
                one = n % 10;
                sum = ten + one;

                result = (one * 10) + (sum % 10);
            } else {
                ten = result / 10;
                one = result % 10;
                sum = ten + one;

                result = (one * 10) + (sum % 10);
            }

            count++;

            if (result == n) {
                break;
            }
        }

        System.out.println(count);
    }

}
