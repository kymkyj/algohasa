package Baekjoon;

import java.util.Scanner;

/*
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.  
   예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만
   aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

	단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */

/**
 * 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
 * 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 * 첫째 줄에 그룹 단어의 개수를 출력한다.
 * 
 * #1(문자열을 잘라 배열에 저장하여 반복문과 조건문을 돌려 찾는 방법)
 * #2(다른사람 코드 : bufferedReader와 StringTokenizer를 이용하여 문자를 자르고 boolean[] 배열을 통해 true, false로 반환하여 푸는 방법이다.)
 * 
 * #2에서 StringTokenizer()은 주로 split()과 비교가 되는데 둘의 차이점은 
 * StringTokenizer은 특정 기본자를 기준으로 token단위로 끊어서 읽게 해준다
 * split는 구분자를 기준으로 해서 문자열을 분리하여 배열로 리턴한다 
 * 어느것이 더 좋다고는 말할수는 없지만 상황에 맞게 구분해서 사용해야 한다. 
 * 예를 들어 홍길동,28,남자,서울 강남구 라는 예가 있다면 
 * StringTokenizer은 중간에 값이 없는 남자,,서울 강남구 같은 중간에 null 값이 있을 경우 null을 무시해버린다. 즉 출력될때는 남자,서울 강남구로 출력이 된다.
 * trim()이라는 공백을 지우는 메서드를 통해 해결이 가능하지만 번거로울 뿐더러 split()메서드는 null 값을 무시하지 않기 때문에 문자열이 적은 경우 split()를
 * 사용하는 것이 편리하다.
 * StringTokenizer가 사용이 되는 경우는 CSV파일을 읽어서 처리하는 경우인데 CSV파일이 매우 크기 때문에 해당 작업을 split()를 사용해서 처리하면 처리속도가
 * 매우 떨어져 비효율적인 문제가 발생한다. 
 * 즉 결론은 문자열이 짧은 경우 split() 메서드를 , 처리해야 하는 파일이 큰 경우 StringTokenizer를 이용해 사용하는 것이 효율적인 방법이다. 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt(); // 몇개 단어 입력할지 입력받기 
		String [] words = new String[num]; // 문자열 배열을 선언한다. 
		char[] seg; // 문자열 자른 것을 저장할 배열 
		
		int check=0; // 그룹인지 아닌지 확인하는 것 
		int answer=0; // 답
		
		for(int i=0; i<num; i++) { // 입력받은 수만큼 반복문을 돌린다. 
			words[i] = sc.next(); // 단어 입력받기 
		seg = words[i].toCharArray(); // 쪼개서 배열에 저장한다.
		
		for(int a=0; a<seg.length; a++) {	// 배열의 첫번째를 
			for(int b= a+1; b<seg.length; b++) {	// 그 다음 모든것들이랑 비교한다. 
				if(seg[a]==seg[b] & seg[a]!= seg[b-1]) { // 같은 경우에 그 사이에 있는것이 다를경우 
					check = 1; // 그룹이 아니다를 표시한다. 	
				}
			}
		}
		if(check==0) { // 표시 없는 것들 
			answer += 1; // 갯수 더하기 
		}
		check = 0; // 표시 지우기 
		}
		System.out.println(answer); // 출력 
	}
}

// **********************************************************************************************************************************

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class 그룹단어체커 {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = n;
         
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
     
            boolean check[] = new boolean[26]; //boolean 기본값 true
             
            for(int j=1; j<word.length(); j++) {
                if(word.charAt(j-1) != word.charAt(j)) {
                    if(check[word.charAt(j)-97]==true) {
                    count--;
                    break;              
                    }
                    check[word.charAt(j-1)-97] = true;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}

*/
