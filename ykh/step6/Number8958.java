package step6;

import java.util.Scanner;

public class Number8958 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String[] stringArr = new String[number];

        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = sc.next();
        }

        sc.close();

        for (int i = 0; i < stringArr.length; i++) {
            int count = 0;
            int sum = 0;

            // 입력한 각 문자열을 쪼개서 배열에 저장
            String[] charArr = stringArr[i].split("");

            // 쪼개진 문자의 갯수 -> charArr의 길이만큼 for문 돌림 (= stringArr[i].length(), string 형의 길이는 length())
            for(int j = 0; j < charArr.length; j++) {
                if(charArr[j].equals("O")) {
                    count++;
                    sum = sum + count;
                } else if(charArr[j].equals("X")) {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
