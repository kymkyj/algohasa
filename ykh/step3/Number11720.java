package step3;

import java.util.Scanner;

public class Number11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();
        sc.close();

        String regex = "^[0-9]*$";

        if(input.length() != n) {
            System.out.println("n만큼 숫자를 입력하세요!");
            return;
        }

        if(!input.matches(regex)) {
            System.out.println("공백없이 숫자만 입력하세요!");
            return;
        }

        int sum = 0;

        for (int i = 0; i < n; ++i) {
            //result += input.charAt(i) - '0';
            sum += Integer.parseInt(input.substring(i, i+1));
        }
        System.out.println(sum);
    }

}
