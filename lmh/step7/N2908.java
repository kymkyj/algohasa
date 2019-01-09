package Lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2908 {
	
public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputStr = br.readLine().split(" ");
		int[] changeNum = new int[inputStr.length];
		String tempNum="";
		int maxNum=0;
		
		for(int i=0;i<inputStr.length;i++){
			for(int j=inputStr[i].length()-1;j>=0;j--){
				tempNum+=inputStr[i].charAt(j);
			}
			changeNum[i]=Integer.parseInt(tempNum);
			tempNum="";
			if(changeNum[i]>maxNum){
				maxNum=changeNum[i];
			}
		}
		System.out.println(maxNum);
	}

}
