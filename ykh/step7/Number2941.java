package step7;

import java.util.Scanner;

public class Number2941 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();

        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String result = input;

        for (int i = 0; i < alpha.length; i++) {
            if (input.contains(alpha[i])) {
                // 크로아티아 알파벳이 포함된 문자열들을 한개의 문자로 대체하기
                result = result.replace(alpha[i], "1");
            }
        }

        System.out.println(result.length());
    }

}
