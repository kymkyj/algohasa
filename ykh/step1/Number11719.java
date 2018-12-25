package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class Number11719 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<>();

        // 알파벳, 숫자, 공백 정규식
        String regex = "^[A-Za-z0-9\\s]*$";

        while (sc.hasNextLine()) {          // 스캐너에 입력이 들어올 때까지 대기
            String input = sc.nextLine();
            // 다음 라인에 입력한 값이 없으면 while문 종료
            if (input == null || input.isEmpty()) {
                break;
            }

            if (input.length() > 100) {
                System.out.println("한 줄에 100글자를 넘을 수 없음!!");
                break;
            }

            if (inputs.size() > 100) {
                System.out.println("입력은 최대 100줄까지 가능함!!");
                break;
            }

            if (!input.matches(regex)) {
                System.out.println("알파벳, 숫자, 공백만 입력 가능합니다");
                break;
            }

            inputs.add(input);
        }
        sc.close();

        for (String input : inputs) {
            System.out.println(input);
        }
    }
}
