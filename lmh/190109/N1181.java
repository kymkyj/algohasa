import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int i,j,n = Integer.parseInt(in.readLine()),leng,temp,size;
		
		
		HashSet<String> word = new HashSet<>();
		for(i=0;i<n;i++) word.add(in.readLine());
		
		size= word.size();
		String arr[]= new String[size];
		word.toArray(arr);
		
		
		Arrays.sort(arr,new Comparator<String>() {
			public int compare(String str1, String str2){
				return Integer.compare(str1.length(), str2.length());
			}//길이정렬
		});
		
		for(i=0;i<size;i++){
			leng = arr[i].length();
			for(j=i+1;j<size;j++){
				temp = arr[j].length();
				if(leng != temp) break;
			}
			
			Arrays.sort(arr,i,j);
			i=j-1;
		}
		for(i=0;i<size;i++) System.out.println(arr[i]);
		in.close();
		
		
	}

}
