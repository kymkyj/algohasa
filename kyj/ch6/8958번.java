package Baekjoon;

import java.util.Scanner;

/*
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 

���� ���, 10�� ������ ������ 3�� �ȴ�.

"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.

OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

 */

/**
 * ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, 
 * ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
 * �� �׽�Ʈ ���̽����� ������ ����Ѵ�. 
 * 
 * Ǯ�� ��� : 
 * 
 * String �迭�� �� ���̽��� ����� ���ڿ��� �Է¹޽��ϴ�.

	for ���� ����Ͽ� ������ ���ϰ� �����־����ϴ�.

	count �� �ʱⰪ�� 0�̰� �� 'X' �� �� 0���� �����ϹǷ�,

	'O' �� �� ������ count�� ��������(++count) �� �� total�� �����־����ϴ�.
 */

public class OX���� {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N =sc.nextInt();
		String [] cases = new String[N]; // ���� 
		for (int i = 0; i < N; i++) {
            cases[i] = sc.next(); // O����, X���� ,���ӵ� ������ �����ؾ� �ϹǷ� ���� �ϳ��ϳ��� �����ϱ� ������ next()�� �޴´�. 
        }
        sc.close();
        
        int count, total;
        for (String OXresult : cases) { // �迭���� ����Ҽ� �ִ� �ݺ����� ǥ�� cases �迭�� ����ŭ �ݺ����� ������. 
            count = 0;
            total = 0;
            for (int i = 0; i < OXresult.length(); ++i) {
                if (OXresult.charAt(i) == 'O') { // ������ ��� 
                    total += ++count; // ī��Ʈ�� �ø���.
                } else {
                    count = 0; // �׷��� ������� 0
                }
            }
            System.out.println(total); // ��� 
        }
	}
}