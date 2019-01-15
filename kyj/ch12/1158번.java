package Baekjoon;

/* (정답 비율 : 51.974%)
 * 조세퍼스 문제는 다음과 같다.

   1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(≤ N)이 주어진다. 
   
   이제 순서대로 M번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
   
   이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다. 
   
   예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

   N과 M이 주어지면 (N,M)-조세퍼스 순열을 구하는 프로그램을 작성하시오.
 */

/**
 * 첫째 줄에 N과 M이 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ M ≤ N ≤ 1,000)

   예제와 같이 조세퍼스 순열을 출력한다.
   
  문제 접근 방법 : #1) LinkedList()를 이용하였다.
  				1-1) 큐에 순서값을 넣어 
  				1-2) 제거하려는 값이 나올때 까지 계속 뒤로 보낸다.
  				1-3) 큐에서 제거한 값을 출력한다
   			    #2) 다른사람 코드 (deque)쓴것 
  자세한 규칙의 설명은 아래에 있다. 			
  처음 나의 생각 : 우선순위 큐 (PriorityQueue) 로 구하는것 같다.. 큐는 FIFO (First In First Out)이지만 지금은 나머지의 규칙을 찾는데 쉽지가 않았다. 
   			 위의 예제를 예로 들어 보자 (7, 3) >> < 3, 6, 2, 7, 5, 1, 4> 는 제거되는 순서를 나열한 것이다. 
   			 (7, 3) > (7, 6) > (7, 2) > (7, 7) > (7, 5) > (7, 1) > (7, 4) 순이다  
   			 즉 (N, M)에서 M은 반드시 첫번째로 제거 되어야 하며 나머지 뒤의 숫자들은 우선순위를 매겨서 제거를 하면 되는 것이라고 생각한다.
   			 아니면 노가다 방식으로 중간에 숫자 하나가 죽으면 뒤에 push() 넣어주는 방식으로 하면 되지 않을까? 
  여러가지 풀이 규칙 : 간단하게 생각 해보면 쉬운 것이였다.. 
  			#2)의 규칙 	
   			1,2,3,4,5,6,n-2,n-1,n 이 있다고 생각을 해보면.  예를들어 3번째 사람이 계속해서 죽는다고 가정을 하면
   			4번째 사람이 다음 처음 순서가 됩니다. ( 4,5,6,... n-2,n-1,n )
   			한번더 죽인다고 가정을 해보면 6을 죽인다고 가정을 해보면 (7, 8, 9 .... n-2,n-1,1,2,4,5)이 된다 
   			즉 그냥 죽이고 앞에 있는 것들을 뒤로 다시 넣어주는 방식으로도 풀수 있다고 합니다.. 
   			하지만 가장 효율적인 방식은 나머지 연산을 활용하여 푸는 방식이 가장 효율적인 방식이라고 합니다..
   
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // 선언 
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]); 
        int M = Integer.parseInt(input[1])-1; // 위의 규칙대로 풀이를 하기 위해 두개의 int형 타입 배열 N과 M을 각각 선언 
        LinkedList<String> queue = new LinkedList<>(); // queue를 사용하기 위해 LinkedList를 이용한다. 
        StringBuilder builder = new StringBuilder(); // stringBuilder 선언 
        builder.append("<"); // 비교 연산자를 append를 통해 추가한다.
        
        for(int i=0 ; i<N ; i++)
            queue.add(""+(i+1)); // 큐에 순서 값 넣기
        
        while(!queue.isEmpty()){
            int tempM = (queue.size()>M) ? M : M%queue.size(); // 큐의 사이즈가 점점 작아지므로 M값을 사이즈에 맞게 변환
            
            while(tempM-- > 0){ // 제거하려는 순서가 나올 때까지 뒤로 보냄
                String tempVal = queue.poll(); // 큐에서 객체를 꺼내서  tempVal에 담는다.
                queue.add(tempVal); // queue에 추가한다 
            }
            
            builder.append(queue.poll()); // 큐에서 객체를 꺼내서 반환한다. 
            
            if(!queue.isEmpty()) // 큐가 비어있지 않으면 
                builder.append(", "); // " , " 를 추가하고 
            else
                builder.append(">");  // 그렇지 않으면 대소비교를 한다. 
        }
        
        System.out.println(builder); // 출력한다. 
    }
}



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 * import java.util.ArrayDeque;
 * import java.util.Deque;
 * import java.util.StringTokenizer;
 * 
 * 
 * 
 * public class Main {
 * public static void main(String[] args) throws IOException {
 * BufferReader br  = new  BufferReader(new InputStreamReader(System.in));
 * Deque<Integer>deque = new ArrqyDeque<Integer>();
 * 
 * String Builder sb = new StringBuilder("<");
 * StringTokenizer st = new StringTokenizer(br.readline(),"");
 * 
 * int n = Integer.ParseInt(st.nextToken());
 * int m = Integer.ParseInt(st.nextToken());
 * 
 * for(int i=1; i<=n i++) {
 *  deque.add(i)
 *  }
 * 
 * while(!deque.isEmpty()) {
 * 		for (int i=0; i<m-1; i++) {
 * 	deque.addLast(deque.remove.First());
 * 	 }
 * sb.append(deque.removeFirst() + ",");
 * 	}
 * System.out.println(sb.toString().subString(0,sb.length()-2) + ">");
 * 	}
 * }
 * 
 * */
