package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* (���� ���� : 39.003%)
 * ��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�. 
 * �� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���. 
 * �� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���. ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�. 
 * �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�. 
 * ���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 

	�������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. 
 */

/**
 * �Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. �Է��� T���� �׽�Ʈ �����ͷ� �־�����. �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����.
 * �� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����. �ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�.
 *  
 * ����� ǥ�� ����� ����Ѵ�. ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
 * 
 *  ������ Ǫ�� ���� : 1. ���� ��ȣ( '( ')�� ������ stack�� push �ݴ� ��ȣ( ')' )�� ������ stack�� pop 
 *  			   2. ���⼭ ��ȿ���� ���� ���ڿ��� �Ǵ��ϴ� ������ �ΰ��� 
 *  				 (1) pop ������ �Ϸ��µ� stack�� ����ִٴ� ���� ���� ��ȣ�� �Է� �Ǿ�� �Ǵ� ���ε� �ݴ� ��ȣ�� �Է� ��ٴ� ���̹Ƿ� ��ȿ���� ���� 
 *  				 (2) ��� ������ �� ���´µ��� ���ÿ� ������ ��ȣ�� �����ִٸ� ���� ��ȣ�� �ݴ� ��ȣ ���� ���� ���Դٴ°�.. �̰� ���� ��ȿ���� ���� 
 *  				�ΰ����� ����ϸ� �ȴ�. 
 *  
 *  �׽�Ʈ ���̽� �Է��� ���� ���� 
 * 
 *	6 (�Է� �����ͼ� T) 
	(())())   >> NO   // ���� ���ٿ� �ϳ��� �־��� 
	(((()())()  >> NO
	(()())((()))  >> YES
	((()()(()))(((())))() >> NO
	()()()()(()()())() >> YES
	(()((())()( >> NO 
 */
public class Main {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	// ���� 
		
		int T = Integer.parseInt(br.readLine());	// TestCase�� �޴´�. 
		StringBuilder sb = new StringBuilder();		// StringBuilder ���� 
		
		while(T-- >0) { // TestCase�� ���� ������� ���� 
			Stack<Character> stack = new Stack<Character>(); // ���ʸ����� <Character>Ÿ���� stack ���� 
			
			String str = br.readLine(); 
			boolean S = true; // boolean Ÿ�� S ���� 
			for(int i=0; i<str.length(); i++) { // ���ڿ� ���̸�ŭ ���Ƽ� 
				char c = str.charAt(i); // charAt �� ���� ��ġ Ȯ�� 
				
				if(c == '(') { // ���� ��ȣ�̸� 
					stack.push(')');	// push�Ѵ� 
				}else {
					if(stack.isEmpty()) { // ������ ��������� 
						S = false; // ')' ������ false ��ȯ 
						break; // ���߰� 
					}
					stack.pop();  // pop 
				}
			}
			
			if( S && stack.isEmpty()) { // ������ ����ְų� , ������ true��  YES�� ���δ�   >> ))�� �����Ƿ� 
				sb.append("YES \n");
			}else {
				sb.append("NO \n");   // �׷��� ������ NO�� ���δ�. 
			}
		}
		System.out.println(sb.toString()); // ��� 
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/* ���� �ڵ� 
package chap11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chap11_9012 {
	 	����
		��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�. 
		�� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���. 
		�� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���. ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�. �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�. ���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 
		
		�������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. 
		
		�Է�
		�Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. �Է��� T���� �׽�Ʈ �����ͷ� �־�����. 
		�Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. �� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����. 
		�ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�. 
		
		���
		����� ǥ�� ����� ����Ѵ�. ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int tc = sc.nextInt(); // �Է��� �׽�Ʈ ���̽��� ��
		for(int i=0; i<tc; i++) {
			list.add(sc.next());
		}
		for(int i=0; i<list.size(); i++) {
			int count = 0; // �迭 ��Ұ� �ٲ𶧸��� count�� 0���� �ʱ�ȭ
			for(int j=0; j<list.get(i).length(); j++) {
					if(list.get(i).charAt(j) == '(') {
						count++;
					}else {
						count--;
					}
					if(count < 0) {
						break;
					}
			}
			System.out.println(count == 0 ? "YES" : "NO");
		}
	}
}
*/