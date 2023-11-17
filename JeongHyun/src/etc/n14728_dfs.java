package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class n14728_dfs { // dfs
    static int n, t, sum = 0;
    static int[][] arr;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 문제 수
        t = Integer.parseInt(st.nextToken()); // 남은 일수
        arr = new int[n][2];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            sum += arr[i][1];
        }

        for(int i = 0; i < n; i++) dfs(sum, t, i);
        System.out.println(pq.poll());
    }

    static void dfs(int add, int time, int depth){
        if(depth >= n || time <= 0){
            pq.offer(add);
            return;
        }

        if(time - arr[depth][0] >= 0){
            for(int i = depth + 1; i <= n; i++){
                dfs(add- arr[depth][1], time-arr[depth][0], i);
            }
        }
    }
}
