package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* (정답 비율 : 39.003%)
 * 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 
 * 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 
 * 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 
 * 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 

	여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 
 */

/**
 * 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
 * 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
 *  
 * 출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
 * 
 *  문제를 푸는 기준 : 1. 여는 괄호( '( ')가 나오면 stack에 push 닫는 괄호( ')' )가 나오면 stack에 pop 
 *  			   2. 여기서 유효하지 않은 문자열을 판단하는 기준은 두가지 
 *  				 (1) pop 연산을 하려는데 stack이 비어있다는 것은 여는 괄호가 입력 되어야 되는 것인데 닫는 괄호가 입력 됬다는 것이므로 유효하지 않음 
 *  				 (2) 모든 연산을 다 끝냈는데도 스택에 아직도 괄호가 남아있다면 여는 괄호가 닫는 괄호 보다 많이 들어왔다는것.. 이것 또한 유효하지 않음 
 *  				두가지만 고려하면 된다. 
 *  
 *  테스트 케이스 입력을 예로 들어보자 
 * 
 *	6 (입력 데이터수 T) 
	(())())   >> NO   // 각각 한줄에 하나씩 주어짐 
	(((()())()  >> NO
	(()())((()))  >> YES
	((()()(()))(((())))() >> NO
	()()()()(()()())() >> YES
	(()((())()( >> NO 
 */
public class Main {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	// 선언 
		
		int T = Integer.parseInt(br.readLine());	// TestCase를 받는다. 
		StringBuilder sb = new StringBuilder();		// StringBuilder 선언 
		
		while(T-- >0) { // TestCase가 전부 비워질떄 까지 
			Stack<Character> stack = new Stack<Character>(); // 제너릭스가 <Character>타입인 stack 선언 
			
			String str = br.readLine(); 
			boolean S = true; // boolean 타입 S 선언 
			for(int i=0; i<str.length(); i++) { // 문자열 길이만큼 돌아서 
				char c = str.charAt(i); // charAt 을 통해 위치 확인 
				
				if(c == '(') { // 여는 괄호이면 
					stack.push(')');	// push한다 
				}else {
					if(stack.isEmpty()) { // 스택이 비어있을때 
						S = false; // ')' 나오면 false 반환 
						break; // 멈추고 
					}
					stack.pop();  // pop 
				}
			}
			
			if( S && stack.isEmpty()) { // 스택이 비어있거나 , 조건이 true면  YES를 붙인다   >> ))가 없으므로 
				sb.append("YES \n");
			}else {
				sb.append("NO \n");   // 그렇지 않으면 NO를 붙인다. 
			}
		}
		System.out.println(sb.toString()); // 출력 
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/* 형님 코드 
package chap11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chap11_9012 {
	 	문제
		괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
		그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 
		한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 
		
		여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 
		
		입력
		입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 
		입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 
		하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 
		
		출력
		출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int tc = sc.nextInt(); // 입력할 테스트 케이스의 수
		for(int i=0; i<tc; i++) {
			list.add(sc.next());
		}
		for(int i=0; i<list.size(); i++) {
			int count = 0; // 배열 요소가 바뀔때마다 count는 0으로 초기화
			for(int j=0; j<list.get(i).length(); j++) {
					if(list.get(i).charAt(j) == '(') {
						count++;
					}else {
						count--;
					}
					if(count < 0) {
						break;
					}
			}
			System.out.println(count == 0 ? "YES" : "NO");
		}
	}
}
*/