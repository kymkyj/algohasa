package step7;

import java.util.Scanner;

public class Number2675 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        int[] inputNumber = new int[test];
        String[] inputString = new String[test];

        for (int i = 0; i < test; i++) {
            inputNumber[i] = sc.nextInt();
            inputString[i] = sc.next();
        }

        sc.close();

        // 3중 for문, 디버깅으로 품
        for (int i = 0; i < inputNumber.length; i++) {
            for (int k = 0; k < inputString[i].length(); k++) {
                for(int j = 0; j < inputNumber[i]; j++) {
                    System.out.print(inputString[i].split("")[k]);
                }
            }
            System.out.println();
        }
    }
}
