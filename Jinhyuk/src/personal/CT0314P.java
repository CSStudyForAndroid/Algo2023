package personal;

import java.io.*;
import java.util.*;

public class CT0314P {

    static int result;
    static int root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[node];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] parentNode = new int[node];
        for (int i = 0; i < node; i++) {
            parentNode[i] = Integer.parseInt(st.nextToken());
        }
        LinkedList<Integer>[] adjNode = new LinkedList[node];
        for (int i = 0; i < node; i++) {
            adjNode[i] = new LinkedList<>();
        }

        root = 0;
        for (int i = 0; i < node; i++) {
            int parent = parentNode[i];
            if (parent == -1) {
                root = i;
            } else {
                adjNode[parent].addLast(i);
                adjNode[i].addLast(parent);
            }
        }

        int delete = Integer.parseInt(br.readLine());
        result = 0;
        if (root == delete) System.out.println(0);
        else {
            dfs(visited, adjNode, root, delete);
            System.out.println(result);
        }
    }

    static void dfs(boolean[] visited, LinkedList<Integer>[] adjNode, int start, int delete) {
        visited[start] = true;
        int count = 0;
        for (int i : adjNode[start]) {
            if (!visited[i] && i != delete) {
                count++;
                dfs(visited, adjNode, i, delete);
            }
        }
        if (count == 0) {
            result++;
        }
    }

//    public static int[] result;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int node = Integer.parseInt(br.readLine());
//        LinkedList<Integer>[] adjNode = new LinkedList[node + 1];
//        boolean[] visited = new boolean[node + 1];
//        result = new int[node + 1];
//        for (int i = 1; i < node + 1; i++) {
//            adjNode[i] = new LinkedList<>();
//        }
//
//        for (int i = 0; i < node - 1; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int p1 = Integer.parseInt(st.nextToken());
//            int p2 = Integer.parseInt(st.nextToken());
//            adjNode[p1].addLast(p2);
//            adjNode[p2].addLast(p1);
//        }
//
//        dfs(visited, 1, adjNode);
//        for (int i = 2; i < node + 1; i++) {
//            System.out.println(result[i]);
//        }
//    }
//
//    public static void dfs(boolean[] visited, int start, LinkedList<Integer>[] adjNode) {
//        for (int i : adjNode[start]) {
//            if (!visited[i]) {
//                visited[i] = true;
//                result[i] = start;
//                dfs(visited, i, adjNode);
////                visited[i] = false;
//            }
//        }
//    }
}
