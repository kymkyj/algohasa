package Baekjoon;

//import java.util.Scanner;

/*
 * 상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.

전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.
 */

/**
 * 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.
 * 첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다.
 * 
 * 접근방법 :
 * 
 * 아스키 코드를 이용해서 푸는 방법 (#1) 과 직접 비교하여 if, else if문을 사용하여 푸는 방법(#2)  두가지 방법이 있다.
 * #1에서도 Scanner를 사용하는 방법과 BufferReader를 사용하는 방법 두가지가 있지만 필자는 대용량의 데이터를 처리하는데
 * 더 효율적인 BufferedReader을 사용하였다. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Main {
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언 
        String text = br.readLine();  // text 줄을 읽어온다. 
        char[] word = text.toCharArray(); // toCharArray() 메서드로 문자를 마디마디 잘라 배열에 담는다. 
        // toCharArray() 와 charAt()의 차이점 : toCharArray()는 char 배열로 반환하는 메서드이고 배열로 반환하기 때문에 처리속도가 느릴수 있다고 한다.
        // chatAt()은 인자의 위치에 있는 char값을 반환하는 메서드이다.
        
        int totalTime = 0; // 걸리는 총 시간을 의미 
         
        int[] alpha = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        // 알파벳 26개를 숫자로 대치하여 배열에 담았다. 
         
        for(int i=0; i<word.length; i++) { // 문자배열의 길이만큼 반복문을 돌린다 
            for(int j=65; j<=90; j++) {
                if((int)word[i] == j)	// 문자 배열을 아스키 코드로 받기 위해 int형으로 변환한다. 
                    totalTime += alpha[j-65]; // 받은 아스키코드를 총 시간에 계속해서 더해준다. 
            }
        }
        System.out.println(totalTime);	// 출력 
         
    }
}

/*
public class 다이얼 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        String num = sc.nextLine();
        int sum=0;
         
        for(int j=0; j<num.length(); j++) {
        char value = num.charAt(j);
         
        if('A'<= value && value <='C') {
            sum = sum + 3;
        }else if('D'<= value && value <='F') {
            sum = sum + 4;
        }else if('G'<= value && value <='I') {
            sum = sum + 5;
        }else if('J'<= value && value <='L') {
            sum = sum + 6;
        }else if('M'<= value && value <='O') {
            sum = sum + 7;
        }else if('P'<= value && value <='S') {
            sum = sum + 8;
        }else if('T'<= value && value <='V') {
            sum = sum + 9;
        }else if('W'<= value && value <='Z'){
            sum = sum + 10;
        }
        }
            System.out.println(sum);
    }
 
}
*/