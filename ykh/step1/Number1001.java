package step1;

import java.util.Scanner;

public class Number1001 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();

        System.out.println(a - b);
    }
}
