package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
// 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

/**
    첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 
	각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

	만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 */

import java.util.*;


public class Main {
 
    public static void main(String[] args){
    	int cnt=0;
    	int[] asc = new int[26]; // 알파벳은 총 26개 이므로 크기가 26인 배열을 선언한다. 
    	for(int i=0; i<26; i++) {
    		asc[i] =-1;
    	}
    	Scanner sc = new Scanner(System.in);
    	String a =sc.nextLine(); // 다음 줄을 읽어온다. 
    	for(int i=0; i<a.length(); i++) {
    	char ch = a.charAt(i); //입력받은 문자 나누기
    	int ch2 = (int)ch; //문자를 INT 형으로 바꾸기 즉,ASCII CODE 값으로 변경
    	int ch3 = ch2-97; // 문자 a의 아스키코드값은 97 이므로 97을 빼 0으로 변경
    	if(asc[ch3]==-1) { //배열에 든 숫자가 -1이 아니면 카운터 1씩 증가한 후 배열에 삽입
    		asc[ch3]=cnt++; 
    	}else { //배열에 -1이 아닌 숫자가 들었을때, 즉 알파벳이 2번이상 쓰였을때 cnt값만 증가
    		cnt=cnt+1;	
    	}
    	}
    	for(int i=0; i<26; i++) {
    		System.out.print(asc[i]);
    		System.out.print(" ");
    	}
    }
}

/*
public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	         
	        int[] alphabet = new int[26]; // 알파벳은 총 26개 이므로 크기가 26인 배열 선언 
	        Arrays.fill(alphabet, -1); // 초기 배열의 모든 요소를 -1로 삽입하기 위해 Arrays.fill()메서드를 사용하였다. 
	         
	        String str = sc.nextLine();
	        int sz = str.length();
	        for(int i=0; i<sz; i++){
	            if(alphabet[str.charAt(i) - 'a'] == -1)
	                alphabet[str.charAt(i) - 'a'] = i;
	        }
	         
	        for(int i=0;i<26; i++)
	            System.out.print(alphabet[i] + " ");
	    }
	}
*/