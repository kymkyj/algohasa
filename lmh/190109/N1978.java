import java.util.*;

public class N1978{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int input;
        int res = 0;
        int num, num2;
        
        for(int i=0; i<N;i++){
            num2 = 0;
            input = sc.nextInt();
            
            for(num = 1; num<= input; num++){
                if(input % num == 0) num2++;
            }
            if(num2 ==2) res++;
        }
        System.out.println(res);
    }
}