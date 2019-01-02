package step7;

import java.util.Scanner;

public class Number10809 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();

        int[] array = new int[26];

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);

            if (array[ascii - 97] == -1)
                array[ascii - 97] = i;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
