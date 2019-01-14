package Lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2675 {
	public static void main(String args[])throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		String read = rd.readLine();
		int num = Integer.parseInt(read);
		String tmp[] = new String[num];
		for(int i =0; i < num; i ++) {
			String value = "";
			String temp = rd.readLine();
			int count = temp.charAt(0)-48;
			String input = temp.substring(2);
			for(int k=0; k < input.length(); k ++) {
				for(int j = 0; j <count; j ++) {
					value = value + input.charAt(k);
				}
			}
			tmp[i] = value;
		}

		for(int i =0; i <tmp.length; i ++) {
			System.out.println(tmp[i]);
		}
	}
	
}
