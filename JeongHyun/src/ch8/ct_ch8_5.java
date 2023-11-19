package ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ct_ch8_5 {
    /*
    N가지 종류의 화폐
    개수 최소한 이용 -> 가치 합이 M원이 되도록
    각 화폐는 무제한 사용 가능, 사용한 화폐의 구성은 같지만 순서만 다른 것으로 구분

     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n]; // 2 3

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[m+1]; // 1부터 m까지 각 숫자 가치 구하는 경우의 수
        Arrays.fill(dp, 10001);
        dp[0] = 0;

        for (int i = 0; i < n; i++) { // 0 1
            for (int j = arr[i]; j <= m; j++) { // ~ 15
                if (dp[j - arr[i]] != 10001) {
                    // (i-k)원을 만드는 방법이 존재하는 경우
                    dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                    System.out.println("j = " + j + " dp[j] = " + dp[j]);
                }
            }
        }

        if (dp[m] == 10001) System.out.println(-1);
        else System.out.println(dp[m]);
    }
}
