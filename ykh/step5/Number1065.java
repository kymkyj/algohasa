package step5;

import java.util.Scanner;

// 한수의 갯수 구하기
public class Number1065 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 1부터 1000까지
        int input = sc.nextInt();

        sc.close();

        // 한수의 갯수를 구하는 메소드 호출
        counter(input);
    }

    public static void counter(int input) {
        int count = 0;

        if (input < 100) {
            System.out.println(input);
        } else if (input < 1000) {      // 세자리 수의 자연수
            count = 99;
            for (int i = 100; i <= input; i++) {
                if(((i / 100) - ((i % 100) / 10)) == (((i % 100) / 10) - ((i % 100) % 10))) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
