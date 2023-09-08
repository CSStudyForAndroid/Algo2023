import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class n21738 { // bfs
    static int n, s, p, answer;
    static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 얼음 수
        s = Integer.parseInt(st.nextToken()); // 지지대 수
        p = Integer.parseInt(st.nextToken()); // 펭귄이 위치한 볼록의 번호

        list = new ArrayList<>();
        // list 초기화
        for(int i = 0; i <= n + 1; i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < n-1; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 서로 연결되어있음을 표현
            list.get(x).add(y);
            list.get(y).add(x);
        }

        //System.out.println(list);
        answer = n - 1; // 펭귄 빼고 얼음 수
        bfs(p);

        System.out.println(answer);
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        q.offer(start); // 시작점 추가
        visited[start] = true;

        int depth = -1; // 펭귄으로부터 거리
        int count = 0; // 탐색된 지지대 수

        // 지지대 2개 제외는 깸
        while(!q.isEmpty() && count < 2){
            depth++;

            int length = q.size();
            for(int i = 0; i < length; i++){
                int num = q.poll();

                if(num <= s && count < 2){ // 지지대를 만난 경우
                    answer -= depth; // 최단거리인 경우 연결된 얼음 수는 제외
                    count++;
                    continue;
                }

                for(int next: list.get(num)){
                    if(!visited[next]){
                        q.offer(next);
                        visited[next] = true;
                    }
                }
            }
        }
    }
}
