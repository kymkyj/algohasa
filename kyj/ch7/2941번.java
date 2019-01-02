package Baekjoon;

import java.util.Scanner;

/*
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

	크로아티아 알파벳	변경
	č	c=
	ć	c-
	dž	dz=
	ñ	d-
	lj	lj
	nj	nj
	š	s=
	ž	z=
	예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

	dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 */

/**
 *	첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

	문제 설명에 나와있는 크로아티아 알파벳만 주어진다.
	
	입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
**/
/**
	접근방법 :
	
	크로아티아 문자로 문자열 배열을 초기화한다.
	
	여기서 주의 해야 하는 것이 있다면 "dz="이라는 단어 안에 z= 이라는 단어가 포함되어 있으므로, "dz="는 "z=" 보다 앞의 인덱스에서 초기화 되어야 한다.
	
	for문을 크로아티아 문자 배열 개수 만큼(8개) 돌려 input[i] 배열 안에 크로아티아 문자가 있으면 "a"로 변환시켜 준다.
	
	a의 개수를 출력한다. 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};  // 크로아티아 문자로 문자열 배열을 초기화 한다. 
		
		String input = sc.next();
		
		
		for(int i=0; i<8; i++) { // 배열의 크기(8)만큼 반복문을 돌린다. 
			//if(input.contains(croatia[i])) { // 크로아티아 문자열을 가지고 있으면 
				input = input.replace(croatia[i], "a"); // 문자열 croatia[]의 요소들을 전부 알파벳 "a" 로 바꾸기
				sc.close();		
			}
		System.out.println(input.length());
		}
	}
//}
// 풀이는 맞는것 같으나..2가 아닌 2, 2 이런식으로 연속으로 출력이 된다.
// 해결 : if(input.contains(croatia[i])) { // 주석처리 하니 해결되었다.. 이유는 모르겠다.. 
// 반복문을 돌릴때 input.length()로 돌리려고 했으나 +, =까지 문자로 인식해서 크로아티아 문자 배열의 크기인 8만큼 반복문을 돌렸다. why?