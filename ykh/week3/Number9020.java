package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Number9020 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        int input = -1;

        for (int i = 0; i < test; i++) {
            input = Integer.parseInt(br.readLine());

            int[] arr = new int[input];
            int a = input;

            // 인덱스 + 해당 배열의 요소 => input이 되도록 배열에 저장
            for (int j = 0; j < input; j++) {
                arr[j] = a--;
            }

            // 소수 + 소수를 출력하기 위해 저장할 리스트
            ArrayList<String> resultList = new ArrayList<>();

            // 굳이 input 만큼 돌리지 않고 input/2 까지만 돌려도 무방함
            for (int k = 1; k <= input / 2; k++) {
                // 소수 판별
               if(primeCheck(k) && primeCheck(arr[k])) {    // 배열의 인덱스와 요소가 모두 소수이면
                   resultList.add(k + " " + arr[k]);        // 해당 숫자를 문자열로 바꿔 리스트에 저장
               }
            }

            // 리스트에서 나중에 저장된 조합의 첫번째 소수가 가장 크고 두번째 소수가 가장 작을 것이므로
            // 리스트에 저장된 마지막 요소를 출력하면 문제의 조건을 만족시킬 수 있음
            System.out.println(resultList.get(resultList.size()-1));
        }
    }

    // 소수를 판별하는 메소드 (소수일 경우 true, 소수가 아닐경우 false 반환)
    public static boolean primeCheck(int number) {
        if (number == 1) {
            return false;
        }

        int count = 0;

        // 소수를 판별할때 제곱근 까지만 확인해보면 됨
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // 소수가 아닐 경우
        if (count > 1)
            return false;

        // 소수일 경우
        return true;
    }
}
