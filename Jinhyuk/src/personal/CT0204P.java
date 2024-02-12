package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CT0204P {

    static ArrayList<Integer>[] nearlist;
    static int[] check;
    static boolean[] visited;
    static boolean isEven;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int node = Integer.parseInt(st.nextToken());
            int edge = Integer.parseInt(st.nextToken());
            nearlist = new ArrayList[node + 1];
            check = new int[node+1];
            isEven = true;
            visited = new boolean[node+1];
            for (int j = 1; j <= node; j++) {
                nearlist[j] = new ArrayList<>();
            }

            for (int j = 0; j < edge; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                nearlist[start].add(end);
                nearlist[end].add(start);
            }

            for (int j = 1; j <= node; j++) {
                if (isEven) {
                    DFS(j);
                } else {
                    break;
                }
            }
            if (isEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    static void DFS(int startIdx) {
        visited[startIdx] = true;
        for (int i : nearlist[startIdx]) {
            if (!visited[i]) {
                check[i] = (check[startIdx] + 1) % 2;
                DFS(i);
            } else if (check[startIdx] == check[i]) {
                isEven = false;
            }
        }
    }
}
