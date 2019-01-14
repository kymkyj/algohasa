package Baekjoon;

/*
1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 

예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.

골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 

이러한 숫자를 골드바흐 숫자라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 숫자의 골드바흐 파티션이라고 한다. 

예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 

10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 

만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
 */

/**
 * 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. (4 ≤ n ≤ 10,000)
 * 
 * 출력 : 각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
 */

/**#1 골드바흐 숫자 : 2보다 큰 모든 숫자는 두 소수의 합으로 나타난다. 
 * 그 표현을 골드바흐 파티션이라하며 두 소수의 차이가 가장 작은 값을 출력한다. 
 * #2
 * 접근 방법 : 에라토스테네스의 체로 2부터 10000까지의 범위의 수를 소수판결하고
 * 그 배열을 이용하여 골드바흐파티션을 뽑아냅니다. 
 * 문제에서 주어지는 짝수의 소수 2개의 조합은 
 * 짝수를 2로 나눈 절반값을 기준으로 차이값이 동일하다는 것 입니다.
 * 그 차이값을 0으로 시작하여 2개의 조합이 가장 차이가 적은 소수가 될때까지 while문을 돌린후
 * 출력해 냅니다. 
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int many = sc.nextInt();
		
		while(many>0) {
			
			int num=sc.nextInt();
			int small=num/2;
			int big=num-small;
			
			int a = 0;
			while(a==0) {
				int schk = sosu(small);
				int bchk = sosu(big);
				
				if(schk ==0 && bchk ==0) {
					a=1;
					System.out.print(small);
					System.out.println(" "+big);
				}
				else {
					small -= 1;
					big += 1;
				}
			}
			many--;
		}
	}
	public static int sosu(int num) {
		int check = 0;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				check = 1; // 소수가 아니면
				break;
			}
		}
		if (check==1) {return 1;}
		
		else
		return 0;
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
public class 골드바흐의추측9020 {
		
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    	
	        boolean[] res = new boolean[10001];
	        for(int i = 2; i <= Math.sqrt(10000); i++) {
	        	if(!res[i]) {
	        		for(int j=2; i*j<=10000; j++) {
	        			res[i*j] = true;
	        		}
	        	}
	        }
	        int T = sc.nextInt();
	        
	        for(int i=0; i<T; i++) {
	        	int n = sc.nextInt();
	        	n/=2;
	        	int diff=0;
	        	while(true) {
	        		if(!res[n-diff] && !res[n+diff]) {
	        			System.out.println((n-diff) + " " + (n-diff));
	        			break;
	        		}
	        		diff++;
	        	}
	        }
	    }
}
*/      