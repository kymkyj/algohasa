import java.util.Scanner;

public class chap7_10809 {
	/*
	 * 문제
		알파벳 소문자로만 이루어진 단어 S가 주어진다. 
		각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		
		출력
		각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
		만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		
		결과예시
		baekjoon -> 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		
		문제이해
		1. 알파벳 소문자로만 이루어진 단어를 입력했을때 위치를 숫자로 표현..
		2. 포함되어있는 경우는 처음위치는 0 두번째는 1 순으로 표현하고 포함되어있지 않다면 -1을 출력한다.
		
		접근방법
		1. 정규식을 사용해서 입력한 문자열을 소문자만 들어오게 제한시키고? 
		2. 문자열의 길이만큼 for문을 돌려서 charAt으로 위치를 찾는다?
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String regex = "^[a-z]$"; // 소문자만 들어오게 매칭
		
//		if(input.length() > 100) {
//			System.out.println("문자의 길이가 초과되었습니다.");
//			return;
//		}else if(!input.matches(regex)) {
//			System.out.println("영어 소문자로만 입력하세요!");
//			return;
//		}
		
		int [] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) { // i는 입력한 문자열의 길이만큼.. i=문자위치
			int ascii = input.charAt(i);
			
			if(arr[ascii-97] == -1) { 
				arr[ascii-97] = i;
			}
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
