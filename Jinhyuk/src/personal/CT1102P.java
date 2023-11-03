package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class CT1102P {
//    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int size = Integer.valueOf(st.nextToken());
////        int routeSize = Integer.valueOf(st.nextToken());
////        int[][] list = new int[size][size];
////        for (int i = 0; i < size; i++) {
////            str = br.readLine();
////            st = new StringTokenizer(str, " ");
////            for (int j = 0; j < size; j++) {
////                list[i][j] = Integer.valueOf(st.nextToken());
////            }
////        }
////
////        int[] route = new int[routeSize];
////        str = br.readLine();
////        st = new StringTokenizer(str, " ");
////        for (int i = 0; i < routeSize; i++) {
////            route[i] = Integer.valueOf(st.nextToken());
////        }
////        Solution temp = new Solution();
////        System.out.println(temp.solution(list, route));
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int airport = Integer.valueOf(str);
////        int airplaneCount = Integer.valueOf(br.readLine());
////        int[] targetAirport = new int[airplaneCount];
////        for (int i = 0; i < airplaneCount; i++) {
////            targetAirport[i] = Integer.valueOf(br.readLine());
////        }
////
////        Solution temp = new Solution();
////        System.out.println(temp.solution(targetAirport, airport));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        int size = Integer.valueOf(st.nextToken());
//        int limit = Integer.valueOf(st.nextToken());
//
//        int[] list = new int[size];
//        st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < size; i++) {
//            list[i] = Integer.valueOf(st.nextToken());
//        }
//        Solution temp = new Solution();
//        System.out.println(temp.solution(list, limit));
//
//
//        LinkedList<int[]> list = new LinkedList<>();
//        for(int i = 0; i <= n; i++){
//            for(int j = 0; j <= n; j++){
//                if(map[i][j]!=-1) list.add(new int[]{i,j,map[i][j]});
//            }
//        }
//
//    }
//
//}

//class Solution {
//
//
//    public long solution(int[] list, long time) {
//        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
//        for (int i = 0; i < list.length; i++) {
//            int[] temp = new int[2];
//            temp[0] = list[i];
//            temp[1] = i + 1;
//            q.add(temp);
//        }
//
//        int minus = 0;
//        while ((q.peek()[0]- minus) * q.size() <= time) {
//            int[] temp = q.poll();
//            time -= (temp[0] - minus) * (q.size() + 1);
//            minus += (temp[0] - minus) * (q.size() + 1);
//        }
//
//        q = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
//
//        for (long i = 0; i < time; i++) {
//            int[] temp = q.poll();
//            if (temp[0] == 0) {
//                i--;
//                continue;
//            }
//            temp[0]--;
//            if (temp[0] > 0) q.add(temp);
//            if (q.size() == 0) return -1;
//        }
//        if (q.size() > 0) return q.poll()[1];
//        return -1;
//    }

//    int solution(int[] list, int limit) {
////        int count = 0 ;
////        for (int i = 0; i < list.length; i++) {
////            for (int j = i + 1; j < list.length; j++) {
////                if(list[i] == list[j]) continue;
////                count++;
////            }
////        }
//        int count = 0;
//        int[] countNum = new int[limit + 1];
//        for (int i = 0; i < list.length; i++) {
//            countNum[list[i]]++;
//        }
//
//        int totalcount = list.length;
//        for (int i = 1; i <= limit; i++) {
//            totalcount -= countNum[i];
//            count += countNum[i] * (totalcount);
//        }
//
//        return count;
//    }

//    int findParent(int target, int[] parent) {
//        if (target != parent[target]) {
//            parent[target] = findParent(parent[target], parent);
//        }
//        return parent[target];
//    }
//
//    void unionParent(int a, int b, int[] parent) {
//        int aParent = findParent(a, parent);
//        int bParent = findParent(b, parent);
//        if (aParent < bParent) {
//            parent[bParent] = aParent;
//        } else {
//            parent[aParent] = bParent;
//        }
//    }
//
//    public int solution(int[] array, int airport) {
//        int[] parkParent = new int[airport + 1];
//        for (int i = 0; i < parkParent.length; i++) {
//            parkParent[i] = i;
//        }
//
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            int parentIdx = parkParent[array[i]];
//            if (parentIdx == 0) return count;
//            unionParent(array[i], parentIdx - 1, parkParent);
//            count++;
//        }
//
//        return count;
//    }
//    int findParent(int x, int[] parent) {
//        if (x != parent[x]) {
//            parent[x] = findParent(parent[x], parent);
//        }
//        return parent[x];
//    }
//
//    void union(int a, int b, int[] parent) {
//        int aParent = findParent(a, parent);
//        int bParent = findParent(b, parent);
//        if (aParent < bParent) {
//            parent[bParent] = aParent;
//        } else {
//            parent[aParent] = bParent;
//        }
//    }
//
//    public String solution(int[][] list, int[] visitRoute) {
//        int[] parent = new int[list.length];
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list.length; j++) {
//                if (list[i][j] == 1) {
//                    union(i, j, parent);
//                }
//            }
//        }
//
//        int nowParent = 0;
//        for (int i = 0; i < visitRoute.length; i++) {
//            if (i > 0) {
//                if (nowParent != findParent((visitRoute[i] - 1), parent)) return "NO";
//            } else {
//                nowParent = findParent((visitRoute[i] - 1), parent);
//            }
//        }
//
//        return "YES";
//    }
//}