package Baekjoon;

/* (���� ���� : 51.194%)
 * �����۽� ������ ������ ����.

   1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�, ���� ���� M(�� N)�� �־�����. 
   
   ���� ������� M��° ����� �����Ѵ�. �� ����� ���ŵǸ� ���� ������ �̷���� ���� ���� �� ������ ����� ������. 
   
   �� ������ N���� ����� ��� ���ŵ� ������ ��ӵȴ�. ������ ������� ���ŵǴ� ������ (N, M)-�����۽� �����̶�� �Ѵ�. 
   
   ���� ��� (7, 3)-�����۽� ������ <3, 6, 2, 7, 5, 1, 4>�̴�.

   N�� M�� �־����� (N,M)-�����۽� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

/**
 * ù° �ٿ� N�� M�� �� ĭ�� ���̿� �ΰ� ������� �־�����. (1 �� M �� N �� 5,000)

   ������ ���� �����۽� ������ ����Ѵ�.
   
  ���� ���� ��� : #1) LinkedList()�� �̿��Ͽ���.
  				1-1) ť�� �������� �־� 
  				1-2) �����Ϸ��� ���� ���ö� ���� ��� �ڷ� ������.
  				1-3) ť���� ������ ���� ����Ѵ�
   			    #2) �ٸ���� �ڵ� (deque)���� 
   			    
  �ڼ��� ��Ģ�� ������ �Ʒ��� �ִ�. �ּ� ÷��
   			http://hyeonnii.tistory.com/156
   			
  ���� ���� : ã�ƺ� �ٷδ� �����۽� ������ �����̳� �����п��� �似Ǫ�� ������ �����ϴ�.
  
  			���ÿ��� (7,3)�� >> {3,6,2,7,5,1,4}�̸� Queue�� ����ϴ� �����̱� ������ 4��°�� ��ġ�� ����� ���� ����������
  			���ܵǰ� �ȴ� (7,3)�� >> {3,6,2,7,5,1,4}�� �Ǵ� ������ ������ �����ϰ� �����غ��ڸ� 
  			ó������ 7���� ����� �����Ƿ� ������� 1,2,3,4,5,6,7 ������� ��ġ�� �Ǿ����� ���̴�.
  			ó������ 1,2,3,4,5,6,7 (7,3) 3��°�� �ִ� 3�� pop �ؾ� ������ Queue�̱� ������ 1,2�� push�Ǿ� �ڷ� ���ߵȴ�.
  				  2,3,4,5,6,7,1	>> 3,4,5,6,7,1,2 >>(3�� pop)�Ǽ� ������ 
  				  4,5,6,7,1,2 ���� 3��°�� �ִ� 6�� pop �ؾ��ϹǷ� 4,5��  �ڷ� push 
  				  4,5,6,7,1,2 >> 5,6,7,1,2,4 >> 6,7,1,2,4,5 (6�� pop) �Ǽ� ������) �̷��� ������ �ݺ��Ѵ�.
// ------------------------------------------------- ��ü ���� -------------------------------------------------------------------			  
				1234567(7,3)
				2345671
				3456712
			    456712
				567124
				671245								>>>>>>>>      �������� �͵��� ���� �غ���   
				71245								>>>>>>>>      {3, 6, 2, 7, 5, 1, 4} 
				12457
				4571
				5714
				145
				451
				514
				14
 
  �������� Ǯ�� ��Ģ : �����ϰ� ���� �غ��� ���� ���̿���.. 
  			#2)�� ��Ģ 	
   			1,2,3,4,5,6,n-2,n-1,n �� �ִٰ� ������ �غ���.  ������� 3��° ����� ����ؼ� �״´ٰ� ������ �ϸ�
   			4��° ����� ���� ó�� ������ �˴ϴ�. ( 4,5,6,... n-2,n-1,n )
   			�ѹ��� ���δٰ� ������ �غ��� 6�� ���δٰ� ������ �غ��� (7, 8, 9 .... n-2,n-1,1,2,4,5)�� �ȴ� 
   			�� �׳� ���̰� �տ� �ִ� �͵��� �ڷ� �ٽ� �־��ִ� ������ε� Ǯ�� �ִٰ� �մϴ�.. 
   			������ ���� ȿ������ ����� ������ ������ Ȱ���Ͽ� Ǫ�� ����� ���� ȿ������ ����̶�� �մϴ�..
   
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // ���� 
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]); 
        int M = Integer.parseInt(input[1])-1; // ���� ��Ģ��� Ǯ�̸� �ϱ� ���� �ΰ��� int�� Ÿ�� �迭 N�� M�� ���� ���� 
        LinkedList<String> queue = new LinkedList<>(); // queue�� ����ϱ� ���� LinkedList�� �̿��Ѵ�. 
        StringBuilder builder = new StringBuilder(); // stringBuilder ���� 
        builder.append("<"); // �� �����ڸ� append�� ���� �߰��Ѵ�.
        
        for(int i=0 ; i<N ; i++)
            queue.add(""+(i+1)); // ť�� ���� �� �ֱ�
        
        while(!queue.isEmpty()){
            int tempM = (queue.size()>M) ? M : M%queue.size(); // ť�� ����� ���� �۾����Ƿ� M���� ����� �°� ��ȯ
            
            while(tempM-- > 0){ // �����Ϸ��� ������ ���� ������ �ڷ� ����
                String tempVal = queue.poll(); // ť���� ��ü�� ������  tempVal�� ��´�.
                queue.add(tempVal); // queue�� �߰��Ѵ� 
            }
            
            builder.append(queue.poll()); // ť���� ��ü�� ������ ��ȯ�Ѵ�. 
            
            if(!queue.isEmpty()) // ť�� ������� ������ 
                builder.append(", "); // " , " �� �߰��ϰ� 
            else
                builder.append(">");  // �׷��� ������ ��Һ񱳸� �Ѵ�. 
        }
        
        System.out.println(builder); // ����Ѵ�. 
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
