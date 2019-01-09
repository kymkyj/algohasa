package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Number1193 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        sc.close();

        // 각 단계의 시작 갯수를 저장하는 배열
        ArrayList<Integer> arrayList = new ArrayList<>();

        int sum = 1;                // arrayList 담길 수
        int d = 0;                  // 각 단계의 시작 개수간 차이
        int index = 0;              // arrayList에 수를 담기 위한 인덱스
        boolean flag = true;        // while문을 종료시키기 위한 플래그

        // 각 단계의 시작 갯수를 arrayList에 저장
        while(flag) {
            if (sum > 10000000) {
                flag = false;
            } else {
                sum += d;

                arrayList.add(index, sum);

                d += 1;
                index++;
            }
        }

        if (x != 1) {
            for (int i = 1; i < arrayList.size(); i++) {                    // i가 0이면 1단계, 1이면 2단계....
                if (arrayList.get(i-1) <= x && arrayList.get(i) > x) {      // x는 (i-1)단계
                    if ((i-1) % 2 == 0) {                                   // 홀수단계 (0부터 시작이므로)
                        // System.out.println(i + "단계");
                        int diff = x - arrayList.get(i-1);
                        System.out.println((i - diff) + "/" + (1 + diff));
                        return;
                    } else {                                                // 짝수단계
                        // System.out.println(i + "단계");
                        int diff = x - arrayList.get(i-1);
                        System.out.println((1 + diff) + "/" + (i - diff));
                        return;
                    }
                }
            }
        }
        System.out.println("1/1");
    }
}
