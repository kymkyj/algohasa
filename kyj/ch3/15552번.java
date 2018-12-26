package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. (��뷮���� ó���Ҷ�)
// BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.

/**
 * ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. 
 * A�� B�� 1 �̻�, 1,000 �����̴�.
 * �� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.
 */

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // ���� 
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); // ����
		
		// Tip:
		// Scanner�� BufferedReader, BufferedWriter�� �ٸ����� Scanner�� ���Ϳ� �����̽� ��� ���� �ν��ϱ⿡ ����ϱ⿡�� ��������
		// �ݴ�� BufferedReader, BufferedWriter�� ���͸��� ���� �ν��ϱ⿡ ������ �ؾ��� �ʿ伺�� �־� ���������� �ٸ�
		// BufferedReader�� BufferedWriter�� ��뷮�� �����͸� ó���ϱ⿡ Scanner���� ���ϹǷ� ����Ѵ�.
		
		int n = Integer.parseInt(br.readLine().trim()); // Integer.parseInt�� ������ ��ȯ�� ��ģ�� readLine().trim()�� ���� ������� �о�´�.
		
		for(int i=0; i<n; i++) {
			String text = br.readLine(); // ������ �о�´�. 
			String [] word  = text.split(" "); // word[]�迭�� ������ " "(����)�� �������� �ڸ���. (??) 
			int a = Integer.parseInt(word[0]); // word[]�迭���� ���� ��ȯ�� ���� a �� �����Ѵ�
			int b = Integer.parseInt(word[1]); // word[]�迭���� ���� ��ȯ�� ���� b �� �����Ѵ� 
			bw.write((a+b) + "\n"); // (a+b)�� ��� 
		}
		bw.flush();  // �����ִ� �����͸� ��� ����Ѵ�. 
		bw.close();	
	}
}
