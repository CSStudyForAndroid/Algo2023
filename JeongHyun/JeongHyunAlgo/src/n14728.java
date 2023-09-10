import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14728 { // dp 29704
    static int n, t, sum = 0;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 문제 수
        t = Integer.parseInt(st.nextToken()); // 남은 일수
        arr = new int[n][2];
        dp = new int[n+1][t+1];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 소요 시간
            arr[i][1] = Integer.parseInt(st.nextToken()); // 벌금
            sum += arr[i][1];
        }

        // dp
        for(int a = 1; a <= n; a++){
            System.out.println("next");
            for(int b = 0; b <= t; b++){
                dp[a][b] = dp[a-1][b]; // 이전 값 복사

                if(b >= arr[a-1][0]){
                    System.out.println("b = " + b + " arr[a-1][0] = " + arr[a-1][0]);
                    System.out.println("dp[a - 1][b - arr[a - 1][0]] = " + dp[a - 1][b - arr[a - 1][0]]);
                    System.out.println("arr[a - 1][1] = " +  arr[a - 1][1]);
                    dp[a][b] = Math.max(dp[a][b], dp[a - 1][b - arr[a - 1][0]] + arr[a - 1][1]);
                }
            }
        }

        System.out.println(sum - dp[n][t]);
    }
}
