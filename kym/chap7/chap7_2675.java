import java.util.Scanner;

public class chap7_2675 {
	/*
	 * 	문제
		문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
		즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
		
		QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
		
		입력
		첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 
		문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
		
		출력
		각 테스트 케이스에 대해 P를 출력한다.
		
		결과예시
		2
		3 ABC		-> 		AAABBBCCC
		5 /HTP				/////HHHHHTTTTTPPPPP
		
		문제이해
		1. 반복할 숫자를 입력받고 그 숫자만큼 각각의 문자 하나당 숫자만큼 반복해서 출력한다.
		
		접근방법
		1. 반복할 숫자를 입력받고, 반복할 문자를 입력받으므로 두개의 scanner 사용
		2. for문을 사용해서 숫자만큼 반복을 하고 출력결과물을 연결시킨다?
		
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] str = new String[n];

        int repeat;
        String temp;
 
        for(int i=0; i<n; i++) {
            repeat = sc.nextInt();
            str[i] = sc.next();
            temp = ""; // 저장소 역할
            for(int j=0; j<str[i].length(); j++) {
                for(int k=0; k<repeat; k++) {
                    temp += str[i].charAt(j);
                }
            }
            str[i] = temp;
        }
 
        for(int i=0; i<n; i++) {
            System.out.println(str[i]);
        }
	}
}
