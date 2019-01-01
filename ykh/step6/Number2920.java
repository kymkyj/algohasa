package step6;

import java.util.Arrays;
import java.util.Scanner;

public class Number2920 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};

        int[] input = new int[8];

        for (int i = 0; i < 8; i++) {
            input[i] = sc.nextInt();
        }

        sc.close();

        // 배열간의 비교는 Arrays.equals() 메소드 사용
        if (Arrays.equals(ascending, input)) {
            System.out.println("ascending");
        } else if (Arrays.equals(descending, input)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
