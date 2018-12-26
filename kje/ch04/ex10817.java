package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class ex10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[1]);
	}

}
