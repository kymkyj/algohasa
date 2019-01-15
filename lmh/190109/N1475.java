package Lv8;

import java.util.Scanner;
public class N1475 {


	public static void main(String[] args) {
		int arr[] = new int[10];
		int cnt = 0;

		Scanner scan = new Scanner(System.in);

		String N = scan.nextLine(); 
		int number[] = new int[N.length()]; 

		for(int i = 0; i < N.length(); i++){
			number[i] = N.charAt(i) - '0'; 
		}

		for(int i = 0; i < N.length(); i++){
			if(arr[number[i]] == 0){
				if (number[i] == 6 && arr[9] != 0) { 
					arr[9] -= 1;
					continue;
				}
				else if (number[i] == 9 && arr[6] != 0) { 
					arr[6] -= 1;
					continue;
				}
				else {

					for (int j = 0; j < 10; j++) {
						arr[j] += 1;
					}
					cnt++; 
					arr[number[i]] -= 1; 
				}
			}
			else {
				arr[number[i]] -= 1;
			}
		}
		System.out.println(cnt);
		scan.close();
	}
}

