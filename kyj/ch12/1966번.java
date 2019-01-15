package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* (���� ���� : 53.132%)
 * �����е� �˴ٽ��� �������� ������ ���� �������� �μ��ϰ��� �ϴ� ������ �μ� ����� ���� ��������Ρ�, �� ���� ��û�� ���� ���� �μ��Ѵ�. 
 * 
 * ���� ���� ������ ���δٸ� Queue �ڷᱸ���� �׿��� FIFO - First In First Out - �� ���� �μⰡ �ǰ� �ȴ�. 
 * 
 * ������ ����̴� ���ο� �����ͱ� ���� ����Ʈ��� �����Ͽ��µ�, �� �����ͱ�� ������ ���� ���ǿ� ���� �μ⸦ �ϰ� �ȴ�.

	1. ���� Queue�� ���� �տ� �ִ� ������ ���߿䵵���� Ȯ���Ѵ�.
	2. ������ ������ �� ���� �������� �߿䵵�� ���� ������ �ϳ��� �ִٸ�, �� ������ �μ����� �ʰ� Queue�� ���� �ڿ� ���ġ �Ѵ�. �׷��� �ʴٸ� �ٷ� �μ⸦ �Ѵ�.
	
	���� ��� Queue�� 4���� ����(A B C D)�� �ְ�, �߿䵵�� 2 1 4 3 ��� C�� �μ��ϰ�, �������� D�� �μ��ϰ� A, B�� �μ��ϰ� �ȴ�.

	�������� �� ����, ���� Queue�� �ִ� ������ ���� �߿䵵�� �־����� ��, � �� ������ �� ��°�� �μ�Ǵ��� �˾Ƴ��� ���̴�. 
	
	���� ��� ���� ������ C������ 1��°��, A������ 3��°�� �μ�ǰ� �ȴ�.
 */

/**
 * ù �ٿ� test case�� ���� �־�����. 
 * �� test case�� ���ؼ� ������ �� N(100����)�� �� ��°�� �μ�Ǿ����� �ñ��� ������ ���� Queue�� � ��ġ�� �ִ����� �˷��ִ� M(0�̻� N�̸�)�� �־�����. 
 * �����ٿ� N�� ������ �߿䵵�� �־����µ�, �߿䵵�� ������ ������ int������ �־�����. 
 * �߿䵵�� ���� ������ ���� �� ���� ���� �ִ�. ���� ���� N=4, M=0(A������ �ñ��ϴٸ�), �߿䵵�� 2 1 4 3�� �ȴ�.

   �� test case�� ���� ������ �� ��°�� �μ�Ǵ��� ����Ѵ�.
   
   ���� ���� ���� :
   
   3	// test case�� �� (��� ������ �μ�� ������?)										   ��� 
   1 0	// ù���� (test case)��			 											    	1
   5	// 5�� �μ� 																			2
   4 2  // N(4)���� ����,	� ��ġ M(2���� ��ġ)	 (test case2)               >>>>> 		   	    5
   1 2 3 4 // �߿䵵�� 1,2,3,4  �� 
   6 0  // 6���� �������� 0���� ��ġ ���  (test case3)
   1 1 9 1 1 1 //  ���⼭ �߿��Ѱ��� �������� �߿䵵�� �����Ƿ� 9�� ������� ���������� �Ǳ� ������ 
   ������� �μ�Ǿ����� �ñ��� ������(' ') ǥ�ø� �߽��ϴ�.
   ó������ '1' 1  9  1  1  1  >>>> 1 9 1 1 1 '1' >>>> 9 1 1 1 '1' 1
   queue���� poll()�� 9�� ���������� ������ 
   �ᱹ ����� 6 0 �� 0���� ��ġ�� 1�� ���� ��ġ�� �������� 9�� �����ؼ� 5������ ��ġ�ϱ� ������ 5�� ��µ˴ϴ�.

   
   Ǫ�� ��� : �ܼ��� ť�� �̿��ϴ� �Ϳ� �����Ͽ�, �߿��� ������� ����ؾ� �ϴ� �����Դϴ�.
   
   1. LinkedList�� �켱���� �� (�߿䵵)�� ���� �����Ѵ�. 
   2. �߿��� �ͺ��� ����ϱ� ���� �迭�� ����� ������������ �����Ѵ�. 
   3. while���� if ���ǹ��� �߰��Ͽ� ���鼭 �߿䵵�� ���� ���� ������ ���� �߿䵵�� ���� ������ �̵��ϴ� ������� ��� �Ѵ�. 
   4. ���������� �ƹ� �ش������ ������ �ٽ� ť �ǵڷ� �߰����ش�. 
   
   ** �켱���� ť�� �̿��ؼ� Ǯ�� ���� ���� Ǯ�� �ִٰ� �մϴ� �Ф� ** 
   �켱���� �׸���� ���� �׸���� �����ϴ� ť�μ� �켱������ ���� �׸���� ���� ������ ť �Դϴ�. 
 */


public class Main {
	 
    static StringTokenizer st;
    static Queue<Integer> importance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        st = new StringTokenizer(br.readLine());
    
        int testCase = Integer.parseInt(st.nextToken());
        
        for(int t=0; t<testCase; t++) {
            st = new StringTokenizer(br.readLine());
            int docCount = Integer.parseInt(st.nextToken());
            int wantToKnowNumOrder = Integer.parseInt(st.nextToken());
            importance = new LinkedList<Integer>(); // �߿䵵�� �� �迭 // LinkedList�� �켱���� ������ ����
            int[] sortedArray = new int[docCount]; // �߿䵵�� ������������ �����ϱ� ���� �迭
            
            
            
            st = new StringTokenizer(br.readLine());
            for(int i=0; i< docCount; i++) {
                int importanceNum = Integer.parseInt(st.nextToken());
                importance.add(importanceNum);
                sortedArray[i] = importanceNum;
            }
            Arrays.sort(sortedArray); // �߿��� �ͺ��� ����ϱ� ���� ���� �迭�� ����� �������� ����
            
            int importanceOrder = sortedArray.length-1; // �߿䵵�� ���� ū �ͺ��� ����ϱ� ���� ����
            int order = 0; // ��� Ƚ��
            int calCount = 0; // �Է� ������ ���缭 ������ ����ϱ� ���� ����
            
            while(true) {
                int pollNum = importance.poll();
                
                if(calCount == wantToKnowNumOrder) { // ť���� out �� �� �˰���� 00��° ���� �� �� �ִ�. 
                    pollNum += 101; // �־����� ���� 100�����̹Ƿ� �ٸ� ��ġ�� �Ȱ��� �߿䵵�� �������� �ٸ� ������ �������
                }
                calCount++;
                
                if(sortedArray[importanceOrder] == pollNum-101) { // �˰� ���� ���� �߿䵵�� 101�� �Ѿ�� ������ �ش� ���ڰ� ������ ��.
                    order++;
                    bw.write(String.valueOf(order));
                    bw.newLine();
                    break;
                    
                }else if(sortedArray[importanceOrder] == pollNum){ // �߿䵵�� ���� ���� ��µǸ� ���� �߿䵵�� ���� ������ �̵�
                    order++;
                    importanceOrder--;
                }else {
                    importance.add(pollNum); // ��� �ش� ���׵� ������ �ٽ� ť �� �ڷ� �߰����ش�
                }
            }
        }
        bw.flush();
    }    
}
 
