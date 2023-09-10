import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class n21735 { // dfs
    static int[] arr;
    static int n, m, max = 0;
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, 0, 0);
        System.out.println(pq.poll());
    }

    static void dfs(int sum, int time, int depth){
        if(depth >= n || time == m){ // 앞마당에 도달한 경우 || 시간이 다 끝난 경우
            pq.offer(sum);
            return;
        }

        // 1칸 간 경우
        if(depth + 1 <= n){
            dfs(sum + arr[depth + 1], time + 1, depth + 1);
        }

        // 2칸 간 경우
        if(depth + 2 <= n){
            dfs(sum/2 + arr[depth + 2], time + 1, depth + 2);
        }
    }

}
