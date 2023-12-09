package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class n1261 {
    static int N, M;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int[][] map;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        map = new int[N][M];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs();
        System.out.println(ans);
    }

    static void bfs(){
        Deque<Point> q = new ArrayDeque<>(); // dequeue : 큐 자료구조 맨 앞에있는 데이터를 제거
        q.add(new Point(0, 0, 0));
        visited[0][0] = true;

        while(!q.isEmpty()){
            int cx = q.peek().x;
            int cy = q.peek().y;
            int cw = q.pollFirst().wall; // 큐의 앞쪽부터 poll

            if(cx == M-1 && cy == N-1) {
                ans = cw;
                break;
            }

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= M || ny >= N || visited[nx][ny])
                    continue;

                // 최소로 벽을 부술려면 최대한 빈 방을 위주로 가고, 그 이외에 벽을 부숴야 함
                if(map[nx][ny] == 0) { // 빈 -> 우선순위가 더 높으니 큐의 앞에 삽입
                    visited[nx][ny] = true;
                    q.addFirst(new Point(nx, ny, cw));
                } else if(map[nx][ny] == 1) { // 벽 -> 우선순위가 더 낮으니 큐의 뒤에 삽입
                    map[nx][ny] = 0;
                    visited[nx][ny] = true;
                    q.addLast(new Point(nx, ny, cw + 1)); // 벽 부쉈으니 cw+1
                }

            }

        }
    }

}

class Point{
    int x, y, wall;

    Point(int x, int y, int wall){
        this.x = x;
        this.y = y;
        this.wall = wall;
    }
}