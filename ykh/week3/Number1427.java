package week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Number1427 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력
        int input = sc.nextInt();

        sc.close();

        // 입력받은 정수를 String으로 변환
        String inputStr = String.valueOf(input);

        // 변환된 String을 split으로 쪼갬
        String[] strArr = inputStr.split("");

        // Collections를 사용하기 위해 배열을 리스트로 변환
        List<String> list = Arrays.asList(strArr);

        // 리스트에 저장된 데이터를 오름차순 정렬 후 리버스 -> 결과는 내림차순
        Collections.sort(list);
        Collections.reverse(list);

        for (String a : list) {
            System.out.print(a);
        }
    }
}
