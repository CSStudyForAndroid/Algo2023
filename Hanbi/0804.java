import java.util.*;

class Solution {
    public static int n, m;
    public static int answer = -1;
    public static int dx[] = {0, 0, -1, 1}; //상,하,좌,우
    public static int dy[] = {1, -1, 0, 0};
    public static boolean visited[][];
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
    
        return bfs(0, 0, maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        Queue<int[]> que = new LinkedList<>();
        //큐에 (x,y) 좌표랑 누적거리 넣기
        que.add(new int[]{x, y, 1});
        visited[0][0] = true;

        while (!que.isEmpty()) {
            //이전 스텝(= 트리의 level) 모든 큐 반복
            int temp[] = que.poll();
            x = temp[0];
            y = temp[1];
            int count = temp[2];
            
            //현재 값이 도착지일 경우
            if (x == n-1 && y == m-1) {
                answer = count;
                break;
            }
        
            for (int i = 0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(maps[nx][ny] == 0) continue;
                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    que.add(new int[]{nx, ny, count+1});
                }
            }
        }

        return answer;
    }
}
