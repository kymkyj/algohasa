package Baekjoon;

import java.util.Scanner;

/*
�����̰� ����ġ�� ������ �� ���� ������ �������� ����, ����, ���, ��, �����̴�.

���� �� ������ �⸻��簡 �־���, �����̴� ���� �л����� �⸻��� �������� ä���ϰ� �ִ�. �⸻��� ������ 40�� �̻��� �л����� �� ���� �״�� �ڽ��� ������ �ȴ�. ������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. �����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.

�л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

/**
�Է��� �� 5�ٷ� �̷���� �ְ�, �������� ����, ������ ����, ������� ����, ������ ����, ������ ������ ������� �־�����.

������ ��� 0�� �̻�, 100�� ������ 5�� ����̴�. ����, ��� ������ �׻� �����̴�. 

ù° �ٿ� �л� 5���� ��� ������ ����Ѵ�.
 */

public class Main {
	public static void main(String[] args) {
		int result = 0;
		Scanner sc=new Scanner(System.in);
		int[] a= new int [5];
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
			
		if(a[i]<40) {
			a[i]=40;
		}
		result = result + a[i];
		}
		int b= result/5;
		System.out.println(b);
	}
}

///*******************************************************************************************************************************
/*
 * import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        
        for(int i=0 ; i<5 ; i++){
            int num = Integer.parseInt(reader.readLine());
            if(num < 40)
                sum += 40;
            else
                sum += num;
        }
        
        System.out.println(sum/5);
    }
}

 * */
