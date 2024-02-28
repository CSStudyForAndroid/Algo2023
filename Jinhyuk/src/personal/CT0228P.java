package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CT0228P {

    static ArrayList<Integer>[] enterInfo;
    static int[] enterCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int nodeSize = Integer.parseInt(st.nextToken());
        int edgeSize = Integer.parseInt(st.nextToken());
        enterInfo = new ArrayList[nodeSize + 1];
        for (int i = 1; i < nodeSize + 1; i++) {
            enterInfo[i] = new ArrayList<Integer>();
        }
        enterCount = new int[nodeSize + 1];

        for (int i = 0; i < edgeSize; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int startNode = Integer.parseInt(st.nextToken());
            int endNode = Integer.parseInt(st.nextToken());
            enterInfo[startNode].add(endNode);
            enterCount[endNode]++;
        }

        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 1; i < nodeSize + 1; i++) {
            if (enterCount[i] == 0) {
                q.addLast(i);
            }
        }

        while (!q.isEmpty()) {
            int temp = q.removeFirst();
            System.out.print(temp + " ");
            for (int j : enterInfo[temp]) {
                enterCount[j]--;
                if (enterCount[j] == 0) {
                    q.offer(j);
                }
            }
        }
    }

}
