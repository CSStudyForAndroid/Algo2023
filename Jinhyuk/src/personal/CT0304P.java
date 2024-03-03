package personal;

import java.io.*;
import java.util.*;

public class CT0304P {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int city = Integer.parseInt(br.readLine());
        int road = Integer.parseInt(br.readLine());
        LinkedList<int[]>[] adjacency = new LinkedList[city + 1];
        LinkedList<int[]>[] reAdjacency = new LinkedList[city + 1];
        for (int i = 0; i < city + 1; i++) {
            adjacency[i] = new LinkedList<>();
            reAdjacency[i] = new LinkedList<>();
        }

        int[] entryList = new int[city + 1];

        for (int i = 0; i < road; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            entryList[end]++;
            adjacency[start].addLast(new int[]{end, time});
            reAdjacency[end].addLast(new int[]{start, time});
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] visitTime = new int[city + 1];
        LinkedList<Integer> q = new LinkedList<>();
        q.addLast(start);
        while (!q.isEmpty()) {
            int node = q.removeFirst();
            for (int[] i : adjacency[node]) {
                int endPoint = i[0];
                int time = i[1];
                visitTime[endPoint] = Math.max(visitTime[endPoint], visitTime[node] + time);
                entryList[endPoint]--;
                if (entryList[endPoint] == 0) {
                    q.addLast(endPoint);
                }
            }
        }
        int max = 0;
        for (int i : visitTime) {
            max = Math.max(i, max);
        }

        int result = 0;
        boolean[] visited = new boolean[city + 1];
        LinkedList<Integer> qq = new LinkedList<>();
        qq.addLast(end);
        visited[end] = true;
        while (!qq.isEmpty()) {
            int temp = qq.removeFirst();
            for (int[] i : reAdjacency[temp]) {
                int target = i[0];
                int time = i[1];
                if (visitTime[temp] == visitTime[target] + time) {
                    result++;
                    if (!visited[target]) {
                        qq.addLast(target);
                        visited[target] = true;
                    }
                }
            }
        }

        System.out.println(max);
        System.out.println(result);
    }
}
