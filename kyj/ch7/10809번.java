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
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	         
	        int[] alphabet = new int[26];
	        Arrays.fill(alphabet, -1);
	         
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