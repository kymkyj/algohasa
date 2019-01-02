package Baekjoon;

import java.util.Scanner;

/*
 �������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.

1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.

������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

/**
 * ù° �ٿ� 8�� ���ڰ� �־�����. �� ���ڴ� ���� ������ ������ ���̸�, 1���� 8���� ���ڰ� �� ���� �����Ѵ�.
 * ù° �ٿ� ascending, descending, mixed �� �ϳ��� ����Ѵ�.
 * 
 * �־��� �迭�� ������������ �ƴ����� Ȯ���ϴ� �����̴�. 
 * 
 * #1 (���� int�� �迭�� �Է°��� �����Ͽ� ���� ���ϴ� ���)
 * #2 (�ٸ� ��� �ڵ� : split()�� �̿��� String ���� ����� �Է°��� ���ϴ� ����̴�)
 * 
 * �ذ� ��� :
 * 1���� 8���� ������ �ѹ��� �����ϱ� ������
 * ascending�� �����ϴ� ������ 1,2,3,4,5,6,7,8 �ۿ� ������
 * �ݴ�� descending�� �����ϴ� ���� ���� 8�� �����ؼ� �������� ���̱� ������ �����ϴ� ������
 * 8,7,6,5,4,3,2,1 �ۿ� ����
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr[] = new int [8]; // 8���� ���̹Ƿ� ���̰� 8�� �迭 ���� 
		int asc =0 ,desc=0, mix=0; // �����ϰ� asc, desc, mix�� ���� ���� 
		
		for(int i=0; i<arr.length; i++) { // �迭�� ���̸�ŭ �ݺ����� ����  
			arr[i]=sc.nextInt(); // �迭���� ���� ������ ������ ���� �о�´�. 
			
			if(i+1 == arr[i]) { // i+1 == arr[i] >> a[0]=1 , a[1]=2 , a[2]=3 .....
				asc++; // ī��Ʈ 
			}else if(8-i == arr[i]){ // 8-i == arr[i] >> a[0]=8, a[1]=7, a[2]=6 .......
				desc++; // ī��Ʈ 
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