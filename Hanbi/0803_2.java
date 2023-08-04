import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] visited = new int[n];
        
        for(int i = 0; i < n; i++){
            if(visited[i] == 0){
                answer++;
                visited[i] = 1;
                dfs(i,visited,computers);
            }
        }
        return answer;
    }
    
    public static void dfs(int start, int[] visited, int[][]graph){
        for(int i = 0; i < graph.length; i++){
            //연결된 컴퓨터이면서 아직 방문 안했다면
            if(graph[start][i] == 1 && visited[i] == 0){
                visited[i] = 1;
                dfs(i, visited, graph);
            }
        } 
    }
    
    
}
