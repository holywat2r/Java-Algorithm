package dfs;
import java.util.*;
public class Main {

	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	// 중첩 배열 ( 2차원 배열 선언 )
	
	// DFS 함수 정의
	public static void dfs(int x)
	{
		visited[x] = true;
		System.out.println(x +" ");
		
		for(int i=0; i < graph.get(x).size(); i++)
		{
			int y = graph.get(x).get(i);
			if (!visited[y]) dfs(y);
		}
	}
	public static void main(String[] args) {

		
	}

}
