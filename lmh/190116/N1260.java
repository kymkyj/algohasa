package Lv11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N1260 {

	static int N,M,V;
	static boolean visited[];
	static int map[][];
	static int start;
	
	public static void DFS(int point) {
		visited[point]=true;
		System.out.print(point+" ");
		
		for(int k=1;k<=N;k++) {
			if(map[point][k]==1 && visited[k]==false) {
				DFS(k);
			}
		}
		
	}
	
	public static void BFS(int point) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(point);
		visited[point]=true;
		System.out.print(point+" ");
		int tmp;
		
		while(!q.isEmpty()) {
			tmp = q.poll();
			for(int w = 1;w<=N;w++) {
				if(visited[w]==false && map[tmp][w]==1) {
					q.offer(w);
					visited[w]=true;
					System.out.print(w+" ");
				}
			}
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		start = sc.nextInt();
		map = new int[N+1][N+1];
		visited = new boolean[10001];
		
		for(int i=1;i<=M;i++) {
			int v1 = sc.nextInt();
			int v2= sc.nextInt();
			
			map[v1][v2]=map[v2][v1]=1;
		}
		
		DFS(start);
		System.out.println();
		for(int j=1;j<=N;j++) {
			visited[j]= false;
		}
		BFS(start);
		
		
	}
}
