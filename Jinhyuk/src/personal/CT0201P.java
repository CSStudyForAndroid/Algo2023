package personal;

import java.util.*;
import java.io.*;
public class CT0201P {

    static int[][] map;
    static int n;
    static int m;
    static int[][] visited;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][m+1];
        visited = new int[n+1][m+1];
        for(int i = 1 ; i <= n ; i++){
            char[] line = br.readLine().toCharArray();
            for(int j = 1; j <= m ; j++){
                map[i][j] = line[j-1] - '0';
                visited[i][j] = 0;
            }
        }

        countRoute();
        System.out.println(map[n][m]);
    }

    static void countRoute(){
        LinkedList<int[]> q = new LinkedList<>();
        q.addLast(new int[]{1,1});
        visited[1][1] = 1;
        while(q.size() != 0){
            int[] temp = q.removeFirst();
            for(int i = 0 ; i < 4; i++){
                int[] next = {temp[0] + dx[i], temp[1] + dy[i]};
                if(next[0] > 0 && next[0] < n+1 && next[1] > 0 && next[1] < m+1 && map[next[0]][next[1]] == 1){
                    if(visited[next[0]][next[1]] == 0 ){
                        visited[next[0]][next[1]] = 1;
                        map[next[0]][next[1]] = map[temp[0]][temp[1]] + 1;
                        q.addLast(next);
                    }
                }
            }
        }
    }
}
