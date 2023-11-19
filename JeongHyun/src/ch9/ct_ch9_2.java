package ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ct_ch9_2 {
    /*
    1~N번 회사
    특정 회사끼리는 서로 도로 통해 연결
    2.판매원 A는 현재 1번에 위치, X번 회사에 물건 판매할 예쩡
    양방향 이동 불가
    1. 소개팅 참석 K번 회사에 존재

    1번 -> K -> X
    가능한 빠르게 최소 시간 계산

     */

    static final int INF = (int) 1e9;
    static int n, m, x, k;
    static int[][] graph = new int[101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 초기화
        for (int i = 0; i < 101; i++) Arrays.fill(graph[i], INF);
        // 자기 자신 -> 자기 자신은 0으로 초기화
        for (int a = 1; a <= n; a++){
            for (int b = 1; b <= n; b++) {
                if (a == b) graph[a][b] = 0;
            }
        }

        n = Integer.parseInt(st.nextToken()); // 회사 개수
        m = Integer.parseInt(st.nextToken()); // 경로 개수

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // a와 b가 서로에게 가는 비용 1
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());


        // 플로이드 워셜 알고리즘
        for (int k = 1; k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        // 수행 결과
        int distance = graph[1][k] + graph[k][x];

        if (distance >= INF) System.out.println(-1);
        else System.out.println(distance);
    }
}
