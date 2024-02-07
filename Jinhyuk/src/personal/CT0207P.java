package personal;


import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CT0207P {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int comp = Integer.parseInt(st.nextToken());
        int believe = Integer.parseInt(st.nextToken());

        LinkedList<Integer>[] routeList = new LinkedList[comp + 1];
        for (int i = 1; i <= comp; i++) {
            routeList[i] = new LinkedList<>();
        }

        for (int i = 0; i < believe; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            routeList[b].add(a);
        }


        int[] result = new int[comp + 1];
        for (int i = 1; i <= comp; i++) {
            boolean[] visited = new boolean[comp + 1];
            LinkedList<Integer> q = new LinkedList<>();
            q.addLast(i);
            while (!q.isEmpty()) {
                int temp = q.removeFirst();
                for (int j : routeList[temp]) {
                    if (!visited[j]) {
                        visited[j] = true;
                        result[i]++;
                        q.addLast(j);
                    }
                }
            }
        }
        int max = 0;
        for (int i : result) {
            max = Math.max(i, max);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= comp; i++) {
            if (result[i] == max) bw.write(i+" ");
        }
        bw.flush();
        bw.close();
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int city = Integer.parseInt(st.nextToken());
//        int road = Integer.parseInt(st.nextToken());
//        int dist = Integer.parseInt(st.nextToken());
//        int start = Integer.parseInt(st.nextToken());
//
//        LinkedList<Integer>[] nearList = new LinkedList[city + 1];
//        int[] visited = new int[city + 1];
//
//        for (int i = 1; i <= city; i++) {
//            nearList[i] = new LinkedList<>();
//            visited[i] = 0;
//        }
//
//        for (int i = 1; i <= road; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int startCity = Integer.parseInt(st.nextToken());
//            int endCity = Integer.parseInt(st.nextToken());
//            nearList[startCity].add(endCity);
//        }
//
//        LinkedList<Integer> q = new LinkedList<>();
//        q.addLast(start);
//        while (!q.isEmpty()) {
//            int temp = q.removeFirst();
//            for (int i : nearList[temp]) {
//                if (visited[i] == 0 && i != start) {
//                    visited[i] = visited[temp] + 1;
//                    q.addLast(i);
//                }
//            }
//        }
//        LinkedList<Integer> result = new LinkedList<>();
//        for (int i = 1; i <= city; i++) {
//            if (visited[i] == dist) result.add(i);
//        }
//        Collections.sort(result);
//        if (result.size() == 0) System.out.println(-1);
//        for (int i : result) {
//            System.out.println(i);
//        }
//    }
}
