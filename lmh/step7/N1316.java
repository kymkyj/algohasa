package Lv7;

import java.util.Scanner;

public class N1316 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int count = Integer.parseInt(scan.nextLine().trim());
	        boolean resultArray[] = new boolean[count];
	        
	        for(int c=0; c < count; c++) {
	            String input = scan.nextLine().trim();
	            boolean charCheck[] = new boolean[26];

	            char ch = input.charAt(0);
	            charCheck[(int)ch - 97] = true;
	            resultArray[c] = true;
	            
	            for(int i=1; i < input.length(); i++) {
	                char beforeCh = input.charAt(i-1);
	                char presentCh = input.charAt(i);
	                
	                if(beforeCh == presentCh) {
	                    continue;
	                } else {
	                    int index = (int)presentCh;
	                    
	                    if(charCheck[index - 97] == true) {
	                        resultArray[c] = false;
	                        break;
	                    } else {
	                        charCheck[index - 97] = true;
	                        continue;
	                    }
	                }
	            }
	        }
	        
	        int result = 0;
	        for(int i=0; i < resultArray.length; i++) {
	            if(resultArray[i] == true) result++; 
	        }
	        
	        System.out.println(result);
	    }

}
