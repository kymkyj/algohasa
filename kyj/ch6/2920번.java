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
 * 
 * 해결 방법 :
 * 1부터 8까지 무조건 한번씩 등장하기 때문에
 * ascending를 만족하는 조건은 1,2,3,4,5,6,7,8 밖에 없으며
 * 반대로 descending를 만족하는 조건 역시 8로 시작해서 내려오는 것이기 때문에 만족하는 조건은
 * 8,7,6,5,4,3,2,1 밖에 없다
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr[] = new int [8]; // 8개의 음이므로 길이가 8인 배열 선언 
		int asc =0 ,desc=0, mix=0; // 간편하게 asc, desc, mix로 각각 선언 
		
		for(int i=0; i<arr.length; i++) { // 배열의 길이만큼 반복문을 돈다  
			arr[i]=sc.nextInt(); // 배열안의 다음 정수가 있으면 값을 읽어온다. 
			
			if(i+1 == arr[i]) { // i+1 == arr[i] >> a[0]=1 , a[1]=2 , a[2]=3 .....
				asc++; // 카운트 
			}else if(8-i == arr[i]){ // 8-i == arr[i] >> a[0]=8, a[1]=7, a[2]=6 .......
				desc++; // 카운트 
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