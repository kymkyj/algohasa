package Baekjoon;

import java.util.*;

// ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

/**
 * ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. 
 * ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
 * 
 * ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
 *
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt(); // x�� �޷� ����
		int y=sc.nextInt(); // y�� �Ϸ� ���� 
		//int cnt= 0; 
		sc.close();
		
		int [] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		// cnt= month[i];
		
		// cnt+=y;
		
		/* switch(cnt % 7) ����ġ �����ε� �����Ұ� ���� 
		case 1:
		System.out.println("MON");
		break;
		case 2:
		System.out.println("TUE");
		break;
		case 3:
		System.out.println("WED");
		break;
		case 4:
		System.out.println("THU");
		break;
		case 5:
		System.out.println("FRI");
		break;
		case 6:
		System.out.println("SAT");
		break;
		case 7:
		System.out.println("SUN");
		break;
		*/
		
		int totaldays = y;
		for(int i=0; i<x-1; ++i) {
			totaldays+=month[i];
		}
		System.out.println(day[totaldays % 7]);
	}
}
