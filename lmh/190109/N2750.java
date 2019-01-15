package Lv8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class N2750
{
    public static void main(String[] args) 
    {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Scanner sc = new Scanner(System.in);
    	int cnt = sc.nextInt();
    	
    	for(int i=0; i<cnt; i++) {
    		int a = sc.nextInt();
    		list.add(a);
    	}
    	Collections.sort(list);
    	for(int i:list) {
    		System.out.println(i);
    	}
    }
}