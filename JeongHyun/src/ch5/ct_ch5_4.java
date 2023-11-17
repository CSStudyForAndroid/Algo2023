package ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ct_ch5_4 { // bfs
    /*static int[][] arr;
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
    }*/

    static int n, m;
    static int[][] arr;
    static int[] arr_x = {1, 0, -1, 0};
    static int[] arr_y = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        /*
        동빈이는 (1,1) 미로는 (N, M)
        한 번에 한 칸씩 이동 가능
        0: 괴물 있는 곳, 1; 괴물 없는 곳
        동빈이가 탈출 위해 움직여야 하는 최소 칸의 개수
        칸은 시작 칸과 마지막 칸 모두 포함해 계산

        bfs 사용
        이동한 위치 방문처리하고 큐에 넣었다가 꺼내서 그에 인접한 위치들 추가하기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        // 입력 완료

        // 호출
        System.out.println(bfs(0, 0));; // 시작 위치

    }

    static int bfs(int x, int y) {
        // 시작 지점에서 가까운 노드부터 차례대로 그래프의 모든 노드를 탐색
        Queue<Maze_Node> node = new LinkedList<>();
        node.add(new Maze_Node(x, y)); // 방문 처리

        while (!node.isEmpty()) {
            Maze_Node new_node = node.poll(); // 가장 최근거 꺼냄
            x = new_node.x;
            y = new_node.y;

            // 4가지의 방향으로 확인하기
            for (int i = 0; i < 4; i++) {
                int nx = x + arr_x[i];
                int ny = y + arr_y[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue; // 공간을 벗어나면 무시

                if (arr[nx][ny] == 0) continue; // 괴물 있으면 무시

                if (arr[nx][ny] == 1) {
                    // 괴물 없으면
                    node.add(new Maze_Node(nx, ny)); // 큐에 추가
                    arr[nx][ny] = arr[x][y] + 1; // 최단 거리 기록(얼만큼 갔는지 1씩 추가하면서 기록)
                }
            }
        }

        return arr[n-1][m-1];
    }

}

class Maze_Node {
    int x, y;

    public Maze_Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/*class Maze_Pair{
    int x, y;

    public Maze_Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }


}*/
