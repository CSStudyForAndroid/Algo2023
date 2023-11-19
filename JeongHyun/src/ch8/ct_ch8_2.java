package ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ct_ch8_2 {
    public static void main(String[] args) throws IOException {
        /*
        5로 나누기
        3으로 나누기
        2로 나누기
        1 빼기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] dp = new int[30001];

        // 먼저 다 더해 놓고 구하려는 수 호출해 답 도출
        for (int i = 2; i <= x; i++) {
            dp[i] = dp[i - 1] + 1; // 현재 수에서 1 빼는 경우
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            if (i % 5 == 0) dp[i] = Math.min(dp[i], dp[i / 5] + 1);
        }

        System.out.println(dp[x]);
    }
}
