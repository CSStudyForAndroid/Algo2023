package personal;

import java.io.*;
import java.util.*;

public class CT0312P {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int city = Integer.parseInt(st.nextToken());
        int road = Integer.parseInt(st.nextToken());
        int order = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer>[] resultList = new PriorityQueue[city + 1];
        boolean[] visited = new boolean[city + 1];
        LinkedList<int[]>[] roadList = new LinkedList[city + 1];

        for (int i = 1; i <= city; i++) {
            resultList[i] = new PriorityQueue<>((a, b) -> a - b);
            roadList[i] = new LinkedList<>();
        }

        for (int i = 0; i < road; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());

            roadList[start].addLast(new int[]{end, price});
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        q.offer(new int[]{1, 0});
        resultList[1].offer(0);
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int nowP = temp[0];
            if (!visited[nowP]) {
                visited[nowP] = true;
                for (int[] i : roadList[nowP]) {
                    int endP = i[0];
                    int cost = i[1];
                    if (resultList[endP].size() == 0) {
                        resultList[endP].offer(cost);
                    } else {
                        if (resultList[endP].peek() > cost + resultList[nowP].peek()) {
                            resultList[endP].offer(cost + resultList[nowP].peek());
                            q.offer(new int[]{endP, cost + resultList[nowP].peek()});
                        }
                    }
                }
            }
        }

        for(int i = 1 ; i <= city; i++){
            if(resultList[i].size() >= order){
                System.out.println(resultList[i]);
            }else{
                System.out.println(-1);
            }
        }

    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int city = Integer.parseInt(br.readLine());
//        int bus = Integer.parseInt(br.readLine());
//
//        int[] result = new int[city + 1];
//        boolean[] visited = new boolean[city + 1];
//
//        LinkedList<int[]>[] nodeList = new LinkedList[city + 1];
//        for (int i = 1; i <= city; i++) {
//            nodeList[i] = new LinkedList<>();
//            result[i] = Integer.MAX_VALUE;
//        }
//        for (int i = 0; i < bus; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int startN = Integer.parseInt(st.nextToken());
//            int endN = Integer.parseInt(st.nextToken());
//            int price = Integer.parseInt(st.nextToken());
//            nodeList[startN].addLast(new int[]{endN, price});
//        }
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int startP = Integer.parseInt(st.nextToken());
//        int endP = Integer.parseInt(st.nextToken());
//
//        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
//        q.offer(new int[]{startP, 0});
//        result[startP] = 0;
//        while (!q.isEmpty()) {
//            int[] temp = q.poll();
//            int nowP = temp[0];
//            if (visited[nowP]) continue;
//            visited[nowP] = true;
//            for (int[] i : nodeList[nowP]) {
//                int targetP = i[0];
//                int price = i[1];
//                if (result[targetP] > result[nowP] + price) {
//                    result[targetP] = result[nowP] + price;
//                    q.offer(new int[]{targetP, result[targetP]});
//                }
//            }
//        }
//        System.out.println(result[endP]);
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int node = Integer.parseInt(st.nextToken());
//        int edge = Integer.parseInt(st.nextToken());
//        int startNode = Integer.parseInt(br.readLine());
//
//        int[] result = new int[node + 1];
//        boolean[] visited = new boolean[node+1];
//        LinkedList<int[]>[] nodeList = new LinkedList[node + 1];
//
//        for (int i = 1; i <= node; i++) {
//            nodeList[i] = new LinkedList<>();
//            result[i] = Integer.MAX_VALUE;
//            visited[i] = false;
//        }
//        for (int i = 0; i < edge; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int startP = Integer.parseInt(st.nextToken());
//            int endP = Integer.parseInt(st.nextToken());
//            int price = Integer.parseInt(st.nextToken());
//            nodeList[startP].addLast(new int[]{endP, price});
//        }
//
//        PriorityQueue<int[]> qq = new PriorityQueue<>((o1,o2)->o1[1]-o2[1]);
//
//        qq.offer(new int[]{startNode, 0});
//        result[startNode] = 0;
//
//        while (!qq.isEmpty()) {
//            int[] temp = qq.poll();
//            int nowP = temp[0];
//            if(visited[nowP]){
//                continue;
//            }
//            visited[nowP] = true;
//            for (int[] i : nodeList[nowP]) {
//                int endP = i[0];
//                int price = i[1];
//
//                if(result[endP] > result[nowP] + price){
//                    result[endP] = result[nowP] + price;
//                    qq.offer(new int[]{endP, result[endP]});
//                }
//            }
//        }
//        for(int i = 1; i <= node; i++){
//            if(visited[i]){
//                System.out.println(result[i]);
//            }else{
//                System.out.println("INF");
//            }
//        }
//    }

}
