package Baekjoon;

import java.util.Scanner;
// ��Ģ���� (���ϱ�, ����, ���ϱ�, ������(�� ���ϱ�), ������(������ ���ϱ�))
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
            System.out.println(a+"��"+b+"���� ��������"+a/b+"�Դϴ�");
	     	System.out.println(a+"��"+b+"���� ���� ��������"+a%b+"�Դϴ�");
	     }else{
            System.out.println(b+"��"+a+"���� ��������"+b/a+"�Դϴ�");
            System.out.println(b+"��"+a+"���� ���� ��������"+b%a+"�Դϴ�");
	     }*/
	   }
	}