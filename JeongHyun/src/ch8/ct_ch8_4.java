package ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ct_ch8_4 {
    /*
    dp[i] = a[i-1] + a[i-2] * 2
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 796796;
        }
        System.out.println(dp[n]);
    }
}