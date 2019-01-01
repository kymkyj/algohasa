package step7;

import java.util.Scanner;

public class Number2908 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt(),
            input2 = sc.nextInt();

        input1 = change(input1);
        input2 = change(input2);

        // 삼항 연산자
        System.out.println((input1 > input2) ? input1 : input2);
    }

    public static int change(int input) {

        input = (input / 100) + (((input % 100) / 10)*10) + (((input % 100) % 10)*100);

        return input;
    }
}
