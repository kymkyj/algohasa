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

/* (정답 비율 : 53.132%)
 * 여러분도 알다시피 여러분의 프린터 기기는 여러분이 인쇄하고자 하는 문서를 인쇄 명령을 받은 ‘순서대로’, 즉 먼저 요청된 것을 먼저 인쇄한다. 
 * 
 * 여러 개의 문서가 쌓인다면 Queue 자료구조에 쌓여서 FIFO - First In First Out - 에 따라 인쇄가 되게 된다. 
 * 
 * 하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.

	1. 현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
	2. 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
	
	예를 들어 Queue에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.

	여러분이 할 일은, 현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다. 
	
	예를 들어 위의 예에서 C문서는 1번째로, A문서는 3번째로 인쇄되게 된다.
 */

/**
 * 첫 줄에 test case의 수가 주어진다. 
 * 각 test case에 대해서 문서의 수 N(100이하)와 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue의 어떤 위치에 있는지를 알려주는 M(0이상 N미만)이 주어진다. 
 * 다음줄에 N개 문서의 중요도가 주어지는데, 중요도는 적절한 범위의 int형으로 주어진다. 
 * 중요도가 같은 문서가 여러 개 있을 수도 있다. 위의 예는 N=4, M=0(A문서가 궁금하다면), 중요도는 2 1 4 3이 된다.

   각 test case에 대해 문서가 몇 번째로 인쇄되는지 출력한다.
   
   나의 문제 이해 :
   
   3	// test case의 수 (몇개의 문서가 인쇄될 것인지?)										   출력 
   1 0	// 첫번쨰 (test case)로			 											    	1
   5	// 5를 인쇄 																			2
   4 2  // N(4)개의 문서,	어떤 위치 M(2번쨰 위치)	 (test case2)               >>>>> 		   	    5
   1 2 3 4 // 중요도가 1,2,3,4  임 
   6 0  // 6개의 문서에서 0번쨰 위치 출력  (test case3)
   1 1 9 1 1 1 //  여기서 중요한것은 나머지가 중요도가 같으므로 9가 가장먼저 빠져나갸아 되기 때문에 
   몇번쨰로 인쇄되었는지 궁금한 문서에(' ') 표시를 했습니다.
   처음에는 '1' 1  9  1  1  1  >>>> 1 9 1 1 1 '1' >>>> 9 1 1 1 '1' 1
   queue에서 poll()로 9는 빠져나가기 때문에 
   결국 결론은 6 0 의 0번쨰 위치한 1의 현재 위치는 빠져나간 9를 포함해서 5번쨰에 위치하기 때문에 5가 출력됩니다.

   
   푸는 방법 : 단순히 큐를 이용하는 것에 응용하여, 중요한 순서대로 출력해야 하는 문제입니다.
   
   1. LinkedList에 우선순위 값 (중요도)을 전부 저장한다. 
   2. 중요한 것부터 출력하기 위해 배열을 만들어 오름차순으로 정렬한다. 
   3. while문에 if 조건문을 추가하여 돌면서 중요도가 높은 것이 나오면 다음 중요도가 높은 것으로 이동하는 방식으로 출력 한다. 
   4. 마지막으로 아무 해당사항이 없으면 다시 큐 맨뒤로 추가해준다. 
   
   ** 우선순위 큐를 이용해서 풀면 정말 쉽게 풀수 있다고 합니다 ㅠㅠ ** 
   우선순위 항목들을 가진 항목들을 저장하는 큐로서 우선순위가 높은 항목들이 먼저 나가는 큐 입니다. 
 */


public class 프린터큐1966 {
	 
    static StringTokenizer st;
    static Queue<Integer> importance; // 중요도를 가지는 큐를 선언
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        st = new StringTokenizer(br.readLine()); // StringTokenizer로 구분 
    
        int testCase = Integer.parseInt(st.nextToken()); // 테스트 케이스 선언 
        
        for(int t=0; t<testCase; t++) { // 테스트 케이스 만큼 반복문을 돌린다. 
            st = new StringTokenizer(br.readLine()); // st로 StringTokenizer를 받아 값들을 읽어온다. 
            int docCount = Integer.parseInt(st.nextToken()); // 문서의 수 
            int wantToKnowNumOrder = Integer.parseInt(st.nextToken()); // 몇번째로 위치하고 있는지? 
            importance = new LinkedList<Integer>(); // 중요도가 들어간 배열 // LinkedList에 우선순위 값으로 저장
            int[] sortedArray = new int[docCount]; // 중요도를 오름차순으로 정렬하기 위한 배열
            
            
            
            st = new StringTokenizer(br.readLine());
            for(int i=0; i< docCount; i++) { // 반복문을 돌려 문서를 읽어온다음 
                int importanceNum = Integer.parseInt(st.nextToken()); // 중요넘버를 선언해서 
                importance.add(importanceNum); // 중요넘버를 중요도가 들어간 배열에 담아서 
                sortedArray[i] = importanceNum; // 오름차순으로 정렬된 배열에 담는다 
            }
            Arrays.sort(sortedArray); // 중요한 것부터 출력하기 위해 따로 배열을 만들어 오름차순 정렬
            
            int importanceOrder = sortedArray.length-1; // 중요도가 가장 큰 것부터 출력하기 위한 순서
            int order = 0; // 출력 횟수
            int calCount = 0; // 입력 순서에 맞춰서 순서를 기억하기 위한 변수
            
            while(true) { // 무한 반복문 
                int pollNum = importance.poll(); // 중요도가 들어간 배열을 poll한 pollNum 을 선언 
                
                if(calCount == wantToKnowNumOrder) { // 큐에서 out 될 때 알고싶은 00번째 수를 알 수 있다. 
                    pollNum += 101; // 주어지는 수가 100이하이므로 다른 위치에 똑같은 중요도가 나오더라도 다른 점수로 만들어줌
                }
                calCount++;
                
                if(sortedArray[importanceOrder] == pollNum-101) { // 알고 싶은 수의 중요도만 101을 넘어가기 때문에 해당 숫자가 나오면 끝.
                    order++; // 출력횟수 ++ 
                    bw.write(String.valueOf(order)); 
                    bw.newLine();
                    break;
                    
                }else if(sortedArray[importanceOrder] == pollNum){ // 중요도가 높은 것이 출력되면 다음 중요도가 높은 것으로 이동
                    order++; // 출력횟수 ++
                    importanceOrder--; // 중요도 순서 -- 
                }else {
                    importance.add(pollNum); // 어느 해당 사항도 없으면 다시 큐 맨 뒤로 추가해준다
                }
            }
        }
        bw.flush();
    }    
}
 
