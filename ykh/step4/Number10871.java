package step4;

import java.util.Scanner;

public class Number10871 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

}