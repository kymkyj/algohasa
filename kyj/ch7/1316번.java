package Baekjoon;

import java.util.Scanner;

/*
 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�.  
   ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������
   aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.

	�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

/**
 * ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. 
 * ��° �ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
 * ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.
 * 
 * #1(���ڿ��� �߶� �迭�� �����Ͽ� �ݺ����� ���ǹ��� ���� ã�� ���)
 * #2(�ٸ���� �ڵ� : bufferedReader�� StringTokenizer�� �̿��Ͽ� ���ڸ� �ڸ��� boolean[] �迭�� ���� true, false�� ��ȯ�Ͽ� Ǫ�� ����̴�.)
 * 
 * #2���� StringTokenizer()�� �ַ� split()�� �񱳰� �Ǵµ� ���� �������� 
 * StringTokenizer�� Ư�� �⺻�ڸ� �������� token������ ��� �а� ���ش�
 * split�� �����ڸ� �������� �ؼ� ���ڿ��� �и��Ͽ� �迭�� �����Ѵ� 
 * ������� �� ���ٰ�� ���Ҽ��� ������ ��Ȳ�� �°� �����ؼ� ����ؾ� �Ѵ�. 
 * ���� ��� ȫ�浿,28,����,���� ������ ��� ���� �ִٸ� 
 * StringTokenizer�� �߰��� ���� ���� ����,,���� ������ ���� �߰��� null ���� ���� ��� null�� �����ع�����. �� ��µɶ��� ����,���� �������� ����� �ȴ�.
 * trim()�̶�� ������ ����� �޼��带 ���� �ذ��� ���������� ���ŷο� �Ӵ��� split()�޼���� null ���� �������� �ʱ� ������ ���ڿ��� ���� ��� split()��
 * ����ϴ� ���� ���ϴ�.
 * StringTokenizer�� ����� �Ǵ� ���� CSV������ �о ó���ϴ� ����ε� CSV������ �ſ� ũ�� ������ �ش� �۾��� split()�� ����ؼ� ó���ϸ� ó���ӵ���
 * �ſ� ������ ��ȿ������ ������ �߻��Ѵ�. 
 * �� ����� ���ڿ��� ª�� ��� split() �޼��带 , ó���ؾ� �ϴ� ������ ū ��� StringTokenizer�� �̿��� ����ϴ� ���� ȿ������ ����̴�. 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt(); // � �ܾ� �Է����� �Է¹ޱ� 
		String [] words = new String[num]; // ���ڿ� �迭�� �����Ѵ�. 
		char[] seg; // ���ڿ� �ڸ� ���� ������ �迭 
		
		int check=0; // �׷����� �ƴ��� Ȯ���ϴ� �� 
		int answer=0; // ��
		
		for(int i=0; i<num; i++) { // �Է¹��� ����ŭ �ݺ����� ������. 
			words[i] = sc.next(); // �ܾ� �Է¹ޱ� 
		seg = words[i].toCharArray(); // �ɰ��� �迭�� �����Ѵ�.
		
		for(int a=0; a<seg.length; a++) {	// �迭�� ù��°�� 
			for(int b= a+1; b<seg.length; b++) {	// �� ���� ���͵��̶� ���Ѵ�. 
				if(seg[a]==seg[b] & seg[a]!= seg[b-1]) { // ���� ��쿡 �� ���̿� �ִ°��� �ٸ���� 
					check = 1; // �׷��� �ƴϴٸ� ǥ���Ѵ�. 	
				}
			}
		}
		if(check==0) { // ǥ�� ���� �͵� 
			answer += 1; // ���� ���ϱ� 
		}
		check = 0; // ǥ�� ����� 
		}
		System.out.println(answer); // ��� 
	}
}

// **********************************************************************************************************************************

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class �׷�ܾ�üĿ {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = n;
         
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
     
            boolean check[] = new boolean[26]; //boolean �⺻�� true
             
            for(int j=1; j<word.length(); j++) {
                if(word.charAt(j-1) != word.charAt(j)) {
                    if(check[word.charAt(j)-97]==true) {
                    count--;
                    break;              
                    }
                    check[word.charAt(j-1)-97] = true;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}

*/
