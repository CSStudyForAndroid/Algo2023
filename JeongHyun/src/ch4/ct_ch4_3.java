package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ct_ch4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 현재 위치
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken()); // 방향  0: 북, 1: 동, 2: 남, 3: 서

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken()); // 0: 육지 1: 바다
            }
        }

        int result = 0;
        int[] arr_x = {-1, 0, 1, 0}; // 북 동 남 서 순
        int[] arr_y = {0, 1, 0, -1};
        int turnTime = 0;
        arr[x][y] = 1;

        while(true){
            if(turnTime == 4){
                // 네 방향 모두 이미 가본 칸인 경우
                // 뒤로 한 칸 이동
                x += arr_x[(d+2)%4];
                y += arr_y[(d+2)%4];
                result++;
                if(arr[x][y] == 1) break;
            }

            // 반시계 방향 90도 회전
            d = (d + 3) % 4;
            turnTime++; // 방향 전환 횟수

            // 제한 공간 밖인 경우는 패스
            if(x + arr_x[d]< 1 || x + arr_x[d] > n || y + arr_y[d] < 1 || y + arr_y[d] > m){
                turnTime++;
                continue;
            }

            // 육지이고 방문하지 않았으면 직진(방문을 바다와 같은 1로 표현)
            if(arr[x + arr_x[d]][y + arr_y[d]] == 0){
                // 이동
                x += arr_x[d];
                y += arr_y[d];
                arr[x][y] = 1; // 방문 처리
                result++; // 방문한 칸 수 증가
                turnTime = 0;
            }



       }
        System.out.println(result);
    }
}
