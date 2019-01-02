package Baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
// �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
    ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 
	������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.

	����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.
 */

import java.util.*;


public class Main {
 
    public static void main(String[] args){
    	int cnt=0;
    	int[] asc = new int[26]; // ���ĺ��� �� 26�� �̹Ƿ� ũ�Ⱑ 26�� �迭�� �����Ѵ�. 
    	for(int i=0; i<26; i++) {
    		asc[i] =-1;
    	}
    	Scanner sc = new Scanner(System.in);
    	String a =sc.nextLine(); // ���� ���� �о�´�. 
    	for(int i=0; i<a.length(); i++) {
    	char ch = a.charAt(i); //�Է¹��� ���� ������
    	int ch2 = (int)ch; //���ڸ� INT ������ �ٲٱ� ��,ASCII CODE ������ ����
    	int ch3 = ch2-97; // ���� a�� �ƽ�Ű�ڵ尪�� 97 �̹Ƿ� 97�� �� 0���� ����
    	if(asc[ch3]==-1) { //�迭�� �� ���ڰ� -1�� �ƴϸ� ī���� 1�� ������ �� �迭�� ����
    		asc[ch3]=cnt++; 
    	}else { //�迭�� -1�� �ƴ� ���ڰ� �������, �� ���ĺ��� 2���̻� �������� cnt���� ����
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
	         
	        int[] alphabet = new int[26]; // ���ĺ��� �� 26�� �̹Ƿ� ũ�Ⱑ 26�� �迭 ���� 
	        Arrays.fill(alphabet, -1); // �ʱ� �迭�� ��� ��Ҹ� -1�� �����ϱ� ���� Arrays.fill()�޼��带 ����Ͽ���. 
	         
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