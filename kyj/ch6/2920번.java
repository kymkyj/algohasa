package Baekjoon;

import java.util.Scanner;

/*
 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.

1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
 */

/**
 * 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
 * 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
 * 
 * 주어진 배열이 오름차순인지 아닌지를 확인하는 문제이다. 
 * 
 * #1 (직접 int형 배열에 입력값을 저장하여 값을 구하는 방법)
 * #2 (다른 사람 코드 : split()을 이용해 String 형에 저장된 입력값을 구하는 방법이다)
 */

public class 음계 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr[] = new int [8];
		int asc =0 ,desc=0, mix=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
			if(i+1 == arr[i]) {
				asc++;
			}else if(8-i == arr[i]){
				desc++;
			}
		}
		if(asc==8) {
			System.out.println("ascending");
		}else if(desc==8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}

//*************************************************************************************************************************

/*
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
    	int t=0;
    	int[] c = new int[8];
    	Scanner sc = new Scanner(System.in);
    	String a = sc.nextLine();
    	for(int i=0; i<8; i++) {
    		String b[] = a.split(" ");
    		c[i] = Integer.parseInt(b[i]);
    		
    	}  
    	for(int i=0; i<8; i++) {
    		if(i<7) {
    		if((c[i]+1)==c[i+1]) {
    			t=0;
    		}else if((c[i]-1)==c[i+1]) {
    			t=1;
    		}else {
    			t=2;
    			i=8;
    	}
    		}
    	}
    	if(t==0) {
    		System.out.print("ascending");
    	}else if(t==1) {
    		System.out.print("descending");
    	}else {
    		System.out.print("mixed");
    	}
}
}
*/