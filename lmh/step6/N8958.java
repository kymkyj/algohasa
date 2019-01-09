package Lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N8958 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		
			for(int i=0; i< t; i++) {
			
			String input = br.readLine();
			
			int cnt=0;
			int sum =0;
			
			for(int j=0; j<input.length();j++) {
				
				
				if(input.charAt(j)=='O') {
					cnt++;
				}else {
					cnt =0;
				}
				 sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
		
	}
	

