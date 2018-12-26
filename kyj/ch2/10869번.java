package Baekjoon;

import java.util.Scanner;
// 사칙연산 (더하기, 빼기, 곱하기, 나누기(몫 구하기), 나누기(나머지 구하기))
public class Main {

	    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	     sc.close();
	        System.out.println(a+b);
	        System.out.println(a-b);
	        System.out.println(a*b);
	        System.out.println(a/b);
	        System.out.println(a%b); 
	     /*if(a>b && !(b==0)) {
            System.out.println(a+"을"+b+"으로 나눈몫은"+a/b+"입니다");
	     	System.out.println(a+"을"+b+"으로 나눈 나머지는"+a%b+"입니다");
	     }else{
            System.out.println(b+"을"+a+"으로 나눈몫은"+b/a+"입니다");
            System.out.println(b+"을"+a+"으로 나눈 나머지는"+b%a+"입니다");
	     }*/
	   }
	}