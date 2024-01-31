package personal;

import java.util.*;
import java.io.*;

public class CT0131P {

//    static LinkedList<Integer>[] listArray;
//    static Boolean[] visited;
//    static Boolean result;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int node = Integer.parseInt(st.nextToken());
//        int edge = Integer.parseInt(st.nextToken());
//
//        listArray = new LinkedList[node];
//        for (int i = 0; i < node; i++) {
//            listArray[i] = new LinkedList<Integer>();
//        }
//
//        visited = new Boolean[node];
//        for (int i = 0; i < node; i++) {
//            visited[i] = false;
//        }
//
//        for (int i = 0; i < edge; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            listArray[a].addLast(b);
//            listArray[b].addLast(a);
//        }
//
//        result = false;
//
//        for (int i = 0; i < edge; i++) {
//            checkFriend(i, 1);
//            if (result) {
//                System.out.println("1");
//                return;
//            }
//        }
//        System.out.println("0");
//    }
//
//    static void checkFriend(int idx, int depth) {
//        if (depth == 5) {
//            result = true;
//            return;
//        }
//        visited[idx] = true;
//        for (int i : listArray[idx]) {
//            if (!visited[i]) {
//                checkFriend(i, depth + 1);
//            }
//        }
//        visited[idx] = false;
//    }

    static LinkedList<Integer>[] listArray;
    static Boolean[] visited;

    static int node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        visited = new Boolean[node + 1];
        listArray = new LinkedList[node + 1];
        for (int i = 1; i <= node; i++) {
            visited[i] = false;
            listArray[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            listArray[a].addLast(b);
            listArray[b].addLast(a);
        }

        for(int i = 1; i < node+1;i++){
            Collections.sort(listArray[i]);
        }

        checkDFS(start);
        for (int i = 1; i < node + 1; i++) {
            visited[i] = false;
        }
        System.out.println();
        checkBFS(start);
    }

    static void checkDFS(int start) {
        System.out.print(start + " ");

        visited[start] = true;
        for (int i : listArray[start]) {
            if (!visited[i]) {
                checkDFS(i);
            }
        }
    }

    static void checkBFS(int start) {
        LinkedList<Integer> q = new LinkedList<>();
        q.addLast(start);
        visited[start] = true;
        while (q.size() != 0) {
            int temp = q.removeFirst();
            System.out.print(temp + " ");
            for (int i : listArray[temp]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.addLast(i);
                }
            }
        }
    }
}
