package Baekjoon;

//import java.util.Scanner;

/*
 * ������� �ҸӴϴ� �Ʒ� �׸��� ���� ������ ���̾� ��ȭ�⸦ ����Ѵ�.

��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. ���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.

���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.

������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.

�ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

/**
 * ù° �ٿ� ���ĺ� �빮�ڷ� �̷���� �ܾ �־�����. �ܾ�� 2����~15���ڷ� �̷���� �ִ�.
 * ù° �ٿ� ���̾��� �ɱ� ���ؼ� �ʿ��� �ð��� ����Ѵ�.
 * 
 * ���ٹ�� :
 * 
 * �ƽ�Ű �ڵ带 �̿��ؼ� Ǫ�� ��� (#1) �� ���� ���Ͽ� if, else if���� ����Ͽ� Ǫ�� ���(#2)  �ΰ��� ����� �ִ�.
 * #1������ Scanner�� ����ϴ� ����� BufferReader�� ����ϴ� ��� �ΰ����� ������ ���ڴ� ��뷮�� �����͸� ó���ϴµ�
 * �� ȿ������ BufferedReader�� ����Ͽ���. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Main {
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ���� 
        String text = br.readLine();  // text ���� �о�´�. 
        char[] word = text.toCharArray(); // toCharArray() �޼���� ���ڸ� ���𸶵� �߶� �迭�� ��´�. 
        // toCharArray() �� charAt()�� ������ : toCharArray()�� char �迭�� ��ȯ�ϴ� �޼����̰� �迭�� ��ȯ�ϱ� ������ ó���ӵ��� ������ �ִٰ� �Ѵ�.
        // chatAt()�� ������ ��ġ�� �ִ� char���� ��ȯ�ϴ� �޼����̴�.
        
        int totalTime = 0; // �ɸ��� �� �ð��� �ǹ� 
         
        int[] alpha = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        // ���ĺ� 26���� ���ڷ� ��ġ�Ͽ� �迭�� ��Ҵ�. 
         
        for(int i=0; i<word.length; i++) { // ���ڹ迭�� ���̸�ŭ �ݺ����� ������ 
            for(int j=65; j<=90; j++) {
                if((int)word[i] == j)	// ���� �迭�� �ƽ�Ű �ڵ�� �ޱ� ���� int������ ��ȯ�Ѵ�. 
                    totalTime += alpha[j-65]; // ���� �ƽ�Ű�ڵ带 �� �ð��� ����ؼ� �����ش�. 
            }
        }
        System.out.println(totalTime);	// ��� 
         
    }
}

/*
public class ���̾� {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        String num = sc.nextLine();
        int sum=0;
         
        for(int j=0; j<num.length(); j++) {
        char value = num.charAt(j);
         
        if('A'<= value && value <='C') {
            sum = sum + 3;
        }else if('D'<= value && value <='F') {
            sum = sum + 4;
        }else if('G'<= value && value <='I') {
            sum = sum + 5;
        }else if('J'<= value && value <='L') {
            sum = sum + 6;
        }else if('M'<= value && value <='O') {
            sum = sum + 7;
        }else if('P'<= value && value <='S') {
            sum = sum + 8;
        }else if('T'<= value && value <='V') {
            sum = sum + 9;
        }else if('W'<= value && value <='Z'){
            sum = sum + 10;
        }
        }
            System.out.println(sum);
    }
 
}
*/