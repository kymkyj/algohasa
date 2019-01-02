package step7;

import java.util.Scanner;

public class Number5622 {

    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

         String input = sc.nextLine();
         sc.close();

         int sum = 0;

         // 알파벳 26개를 숫자로 대치
         int[] second = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};

         for (int i = 0; i < input.length(); i++) {
             int ascii = input.charAt(i);  // 문자를 아스키 코드 값으로 받기

             sum += second[ascii - 65];
         }

         System.out.println(sum);
    }
}
