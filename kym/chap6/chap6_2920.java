import java.util.Scanner;

public class chap6_2920 {
	/*
	 * 	문제
		다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 
		이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
		
		1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
		
		연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
		
		출력
		첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
		
		1 2 3 4 5 6 7 8 -> ascending
		8 7 6 5 4 3 2 1 -> descending
		8 1 7 2 6 3 5 4 -> mixed
		
		접근방법
		1. 다장조가 어떻게 이루어져있는지는 설명만 보면 될듯..? 
		2. 숫자가 오름차순 정렬이면 ascending	내림차순이면 descending 그외 나머지는 mixed 찍으면 되지 않을까?
		
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] n = new int[8];
		int asc = 0;
		int desc = 0;
		int mix = 0;
		
		for(int i=0; i<8; i++) {
			n[i] = sc.nextInt();
			
			if(i+1 == n[i]) {
				asc++;
			}else if(8-i == n[i]) {
				desc++;
			}else {
				mix++;
			}
		}
		sc.close();
		
		if(asc == 8) {
			System.out.println("ascending");
		}else if(desc == 8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		
		
		}
	}
