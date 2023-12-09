package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n21736 { // dfs
    static int[][] visited;
    static int answer = 0;
    //static int[] x_move = {1, 0, -1, 0};
    //static int[] y_move = {0, 1, 0, -1};
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new int[n][m];
        int x = 0, y = 0;

        for(int i = 0; i < n; i++){ // 입력받기
            String[] str = (br.readLine()).split("");
            for(int j = 0; j < m; j++){
                switch (str[j]){
                    case "I": // 도연이 위치
                        x = i;
                        y = j;
                        break;
                    case "X": // 벽
                        visited[i][j] = -1;
                        break;
                    case "P": // 사람
                        visited[i][j] = 1;
                        break;
                    default:
                        break;
                }
            }
        }

        dfs(x, y);
        if(answer == 0){
            System.out.println("TT");
        }else
            System.out.println(answer);

    }

    static void dfs(int x, int y){
       if(x < 0 || y < 0 || x >= n || y >= m || visited[x][y] == -1){
           // 벗어나거나 벽인 경우
           return;
       }

        if(visited[x][y] == 1){
            // 사람 만나면
            answer++;
        }

        visited[x][y] = -1; // 방문처리

        dfs(x+1, y);
        dfs(x-1, y);
        dfs(x, y+1);
        dfs(x, y-1);
    }

}
