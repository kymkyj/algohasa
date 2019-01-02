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