package week3;

import java.util.Scanner;

public class Number2775 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // test case 입력
        int test = sc.nextInt();

        // 2차원 배열
        int[][] apart = new int[15][14];

        // i는 층, j는 호
        for (int i = 0; i <= 14; i++) {      // 층
            for (int j = 0; j < 14; j++) {   // 호
                if (i == 0) {   // 0층 채우기
                    apart[i][j] = j+1;
                } else {
                    for (int m = j; m >= 0; m--) {
                        apart[i][j] += apart[i-1][m];
                    }
                }
            }
        }

        int[] k = new int[test],
              n = new int[test];

        for (int i = 0; i < test; i++) {
            // k층, n호
            k[i] = sc.nextInt();
            n[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < test; i++) {
            System.out.println(apart[k[i]][n[i]-1]);
        }
    }
}
