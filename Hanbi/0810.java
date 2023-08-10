# **가장 먼 노드**

- 진혁
    
    ```kotlin
    class Solution {
        fun solution(n: Int, edge: Array<IntArray>): Int {
            var answer = 0
    
            // 최단 거리를 기록할 리스트를 만든다.(노드가 1번 부터 시작하므로 n+1)
            val shortestWay = MutableList(n + 1) { n + 1 }
            // 노드가 1번 부터 시작하므로 0번 인덱스는 무시
            shortestWay[0] = 0
    
            // 간선 배열 정보를 노드 기준으로 정리한 리스트
            val wayList = MutableList(n + 1) {
                mutableListOf<Int>()
            }
    
            // 간선은 시작 노드, 끝 노드 둘 다에 적용되는 것이다.
            for (i in edge) {
                wayList[i[0]].add(i[1])
                wayList[i[1]].add(i[0])
            }
    
            // bfs로 최단 거리 정보 갱신
            val q = ArrayDeque<Int>()
            // 1번부터 시작
            q.add(1)
            // 자기자신까지의 최단 거리는 0이다.
            shortestWay[1] = 0
            while (q.isNotEmpty()) {
                val temp = q.removeFirst()
                // 해당 노드에 연결된 노드들 확인
                for (i in wayList[temp]) {
                    // 최단 거리 정보가 갱신될 때만 큐에 노드를 넣어준다. -> 방문기록 리스트 필요x
                    if (shortestWay[i] > shortestWay[temp] + 1) {
                        q.add(i)
                        shortestWay[i] = shortestWay[temp] + 1
                    }
                }
            }
    
            val maxVal = shortestWay.maxOf { it }
            answer = shortestWay.count { it == maxVal }
    
            return answer
        }
    }
    ```
    
    - 다익스트라로 풀었다.

- 정현
    - bfs로 풀었다!
    
    ```java
    import java.util.*;
    
    class Solution {
        public int solution(int n, int[][] edge) {
            int answer = 0;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            int[] distance = new int[n+1]; // 거리
            
            for(int i = 0; i < distance.length; i++){
                graph.add(new ArrayList<>());
            }
            
            for(int i = 0; i < edge.length; i++){ // 노드 관계 추가
                graph.get(edge[i][0]).add(edge[i][1]);
                graph.get(edge[i][1]).add(edge[i][0]);
            }
            
            boolean[] visited = new boolean[n+1];
            visited[1] = true;
            
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            
            while(q.size() != 0){ // 도착하는 경로 파악
                int now = q.poll();
                ArrayList<Integer> node = graph.get(now);
                for(int i = 0; i < node.size(); i++){
                    if(visited[node.get(i)] == false){
                        q.add(node.get(i));
                        visited[node.get(i)] = true;
                        distance[node.get(i)] = distance[now]+1;
                    }
                }
            }
            
            Arrays.sort(distance); // 정렬
            int max = distance[distance.length - 1];
            for(int i = distance.length - 1; distance[i] == max; i--)
                answer++;
            
            
            return answer;
        }
    }
    ```
    
- 한비
    - 큐에 노드로 넣는 부분은 블로그 참고..
    - https://sohee-dev.tistory.com/117
    - 파이썬에는 다익스트라 구현이 간단했는데 자바로 하니까 일일히 구현하는거, 처음에 노드 추가하는게 어렵다..

```java
import java.util.*;

class Solution {
    public static int[] distance;
    public static ArrayList<Integer>[] graph;
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        graph = new ArrayList[n+1];
        for(int i=0; i<= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for(int i=0; i< edge.length; i++) {
            int a = edge[i][0];
            int b = edge[i][1];
            graph[a].add(b); // 양방향 연결
            graph[b].add(a);
        }
        dijkstra(1);
        
        int max = 0;
        for(int i = 1; i < n+1; i++){
            max = Math.max(max, distance[i]);
        }
        
        for(int i : distance){
            if(i == max) answer++;
        }
        
        return answer;
    }
    
    public int[] dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        distance[start] = 0;
        
        while(!pq.isEmpty()){
            Node now = pq.poll();
            int dist = now.dir;
            int node = now.no;
            
            if(distance[node] < dist) continue;
            for(int i : graph[node]){
                if(dist + 1 < distance[i]){
                    distance[i] = dist + 1;
                    pq.offer(new Node(i, dist + 1));
                }
            }
        }
        return distance;
    }
    
    private static class Node implements Comparable<Node> {
        int no; // 노드 번호 
        int dir; // 거리
        
        Node(int no, int dir) {
            this.no = no;
            this.dir = dir;
        }
        
        public int compareTo(Node o) { 
            return this.dir - o.dir;
        }
    }
}
```
