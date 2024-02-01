package personal;

import java.util.*;
import java.io.*;

public class CT0201P {

    static int node;

    static LinkedList<int[]>[] listArray;

    static int[] visited;

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        listArray = new LinkedList[node + 1];
        visited = new int[node + 1];
        for (int i = 0; i < node; i++) {
            visited[i + 1] = -1;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int startNum = Integer.parseInt(st.nextToken());
            listArray[startNum] = new LinkedList<int[]>();
            while (true) {
                int nextNum = Integer.parseInt(st.nextToken());
                if (nextNum == -1) {
                    break;
                }
                int dist = Integer.parseInt(st.nextToken());
                listArray[startNum].add(new int[]{nextNum, dist});
            }
        }
        findLongest(1);
        int max = 0;
        int nextNum = 0;
        for (int i = 1; i <= node; i++) {
            if(max < visited[i]){
                max = visited[i];
                nextNum = i;
            }
        }
        for (int i = 1; i <= node; i++) {
            visited[i] = -1;
        }
        findLongest(nextNum);

        for (int i = 1; i <= node; i++) {
            max = Math.max(max, visited[i]);
        }
        System.out.println(max);
    }

    static void findLongest(int startNum) {
        LinkedList<Integer> q = new LinkedList<>();
        q.addLast(startNum);
        visited[startNum] = 0;
        while (q.size() != 0) {
            int temp = q.removeFirst();
            for (int[] i : listArray[temp]) {
                int next = i[0];
                int dist = i[1];
                if (visited[next] == -1) {
                    visited[next] = visited[temp] + dist;
                    q.addLast(next);
                }
            }
        }
    }
//    static int[][] map;
//    static int n;
//    static int m;
//    static int[][] visited;
//    static int[] dx = {0,0,1,-1};
//    static int[] dy = {1,-1,0,0};
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        map = new int[n+1][m+1];
//        visited = new int[n+1][m+1];
//        for(int i = 1 ; i <= n ; i++){
//            char[] line = br.readLine().toCharArray();
//            for(int j = 1; j <= m ; j++){
//                map[i][j] = line[j-1] - '0';
//                visited[i][j] = 0;
//            }
//        }
//
//        countRoute();
//        System.out.println(map[n][m]);
//    }
//
//    static void countRoute(){
//        LinkedList<int[]> q = new LinkedList<>();
//        q.addLast(new int[]{1,1});
//        visited[1][1] = 1;
//        while(q.size() != 0){
//            int[] temp = q.removeFirst();
//            for(int i = 0 ; i < 4; i++){
//                int[] next = {temp[0] + dx[i], temp[1] + dy[i]};
//                if(next[0] > 0 && next[0] < n+1 && next[1] > 0 && next[1] < m+1 && map[next[0]][next[1]] == 1){
//                    if(visited[next[0]][next[1]] == 0 ){
//                        visited[next[0]][next[1]] = 1;
//                        map[next[0]][next[1]] = map[temp[0]][temp[1]] + 1;
//                        q.addLast(next);
//                    }
//                }
//            }
//        }
//    }
}
