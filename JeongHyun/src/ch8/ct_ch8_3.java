package ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ct_ch8_3 {
    /*
    식량창고 일직선 -> 정해진 수의 식량
    개미 전사는 식량창고 선택적 약탈
    메뚜기 정찰병 -> 식량창고 중 서로 인접한 식량창고가 공격받으면 바로 알아챔
    개미 전사가 정찰병에게 들키지 않고 약탈 위해 최소 한 칸 이상 떨어진 식량창고 약탈해야 함

    a[i] = max(a[i-1], a[i-2] + 현재 식량)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[n]; // 총 약탈 식량 총합

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + arr[i]);
        }

        System.out.println(dp[n-1]);
    }
}
