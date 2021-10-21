package bfs_and_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_and_DFS {

	
	// 백준 1260번 문제 
	static int N;
	static int M;
	static int V;
	static int[][] graph;
	static boolean[] visitied;
	
	static Queue<Integer> q;
	
	public static void main(String agrs[]) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		graph = new int[N+1][N+1];

		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = 1;
			graph[b][a] = 1;
			
		}
		visitied = new boolean[N+1];
		dfs(V);
		System.out.println();
		visitied = new boolean[N+1];
		bfs(V);
	}
	// 깊이 탐색
	public static void dfs(int start) {
		
		visitied[start] = true;
		System.out.print(start+" ");
		for(int i = 1; i<N+1; i++) {
			if(graph[start][i] == 1 && visitied[i] == false) {
				dfs(i);
			}
		}
		
	}
	
	// 넓이 탐색
	public static void bfs(int start) {
		q = new LinkedList<>();
		q.offer(start);
		visitied[start] = true;
		
		while(!q.isEmpty()) {
			int vertex = q.poll();
			System.out.print(vertex+" ");
			for(int i = 1; i<N+1; i++) {
				if(graph[vertex][i] == 1 && visitied[i] == false) {
					q.offer(i);
					visitied[i] = true;
				}
			}
			
		}
		
	}
	
}
