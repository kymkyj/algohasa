package step3;

import java.util.Scanner;

public class Number1924 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();   // 월 입력
        int y = sc.nextInt();   // 일 입력

        sc.close();

        if (x <1 || x > 12 || y < 1 || y > 31) {
            System.out.println("범위를 벗어난 입력입니다!");
            return;
        }

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int diffMonth = 0;
        int diffDay = y - 1;

        for(int i = 0; i < (x-1); i++) {
            diffMonth = diffMonth + months[i];
        }

        int totalDay = diffMonth + diffDay;     // 총 날짜 차이

        System.out.println(days[totalDay % 7]);
    }

}
