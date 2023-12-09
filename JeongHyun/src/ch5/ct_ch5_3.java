package ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ct_ch5_3 { // dfs
    /*static int[][] arr;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for(int i = 0; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                if(dfs(i, j)) result++;
            }
        }

        System.out.println(result);
    }

    static boolean dfs(int x, int y){
        // 범위를 벗어나는 경우
        if(x <= -1 || x >= n || y <= -1 || y >= m){
            return false;
        }

        if(arr[x][y] == 0){
            // 아직 방문하지 않은 노드이면
            arr[x][y] = 1; // 방문 처리

            // 상, 하, 좌, 우 위치들 재귀적으로 호출하기
            dfs(x+1, y);
            dfs(x-1, y);
            dfs(x, y+1);
            dfs(x, y-1);

            return true;
        }

        return false;
    }*/

    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        /*
        0: 뚫려 있는 부분
        1: 칸막이
        얼음 틀의 모양으로 총 아이스크림 개수 구하기
        dfs -> true일 때 생성됨
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(dfs(i, j))
                    result++;
            }
        }
        System.out.println(result);
    }

    static Boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= m) return false;

        if (arr[x][y] == 0) {
            arr[x][y] = 1; // 방문 처리

            dfs(x + 1, y);
            dfs(x - 1, y);
            dfs(x, y+1);
            dfs(x, y-1);

            return true;
        }

        return false;
    }
}
