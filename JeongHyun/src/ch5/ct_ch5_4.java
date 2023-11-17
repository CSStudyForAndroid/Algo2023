package ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ct_ch5_4 { // bfs
    static int[][] arr;
    static int n, m;
    static int[] arr_x = {1, 0, -1, 0};
    static int[] arr_y = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for(int i = 0; i < n; i++){
            arr[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println( bfs(0, 0));
    }

    static int bfs(int x, int y){
        Queue<Maze_Pair> q = new LinkedList<>();
        q.offer(new Maze_Pair(x, y));

        while(!q.isEmpty()){
            Maze_Pair node = q.poll();
            x = node.x;
            y = node.y;

            for(int i = 0; i < 4; i++){
                int nx = x + arr_x[i];
                int ny = y + arr_y[i];

                // 미로 찾기 공간을 벗어난 경우 무시
                if(nx < 0 || nx >= n || ny <= 0 || ny >= m) continue;

                // 벽인 경우도 무시
                if(arr[nx][ny] == 0) continue;

                // 괴물이 없는 길이면
                if(arr[nx][ny] == 1){
                    q.offer(new Maze_Pair(nx, ny)); // 추가
                    arr[nx][ny] = arr[x][y] + 1; // 방문처리하면서 횟수 증가
                }
            }
        }

        return arr[n-1][m-1];
    }

}

class Maze_Pair{
    int x, y;

    public Maze_Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
