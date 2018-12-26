package step3;

import java.util.Scanner;

public class Number11721 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        sc.close();

        String regex = "^[a-zA-Z]*$";

        if(!input.matches(regex)) {
            System.out.println("알파벳만 입력가능 합니다!");
            return;
        }

        if(input.length() > 100) {
            System.out.println("길이는 100을 넘을 수 없습니다!");
            return;
        }

        if (!input.isEmpty()) {
            String[] arr = input.split("");

            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i]);
                if(i % 10 == 9) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

}
