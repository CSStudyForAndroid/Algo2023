//package personal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class CT1112P {
//    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int size = Integer.parseInt(str);
////
////        int[][] map = new int[size][size];
////        for (int i = 0; i < size; i++) {
////            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
////            for (int j = 0; j < size; j++) {
////                map[i][j] = Integer.parseInt(st.nextToken());
////            }
////        }
////
////        Solution temp = new Solution();
////        System.out.println(temp.solution(size, map));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int size = Integer.parseInt(st.nextToken());
//        int count = Integer.parseInt(st.nextToken());
//        int[][] list = new int[count][2];
//
//        for (int i = 0; i < count; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            list[i][0] = Integer.parseInt(st.nextToken());
//            list[i][1] = Integer.parseInt(st.nextToken());
//        }
//
//        Solution temp = new Solution();
//        System.out.println(Arrays.toString(temp.solution(size, list)));
//    }
//}
//
//class Solution {
//    public int[] solution(int size, int[][] list) {
//        int[][] shortest = new int[size + 1][size + 1];
//
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size; j++) {
//                if (i == j) continue;
//                shortest[i][j] = size;
//            }
//        }
//
//        for(int[] i : list){
//            shortest[i[0]][i[1]] = 1;
//            shortest[i[1]][i[0]] = 1;
//        }
//
//        for (int k = 1; k <= size; k++) {
//            for (int i = 1; i <= size; i++) {
//                for (int j = 1; j <= size; j++) {
//                    shortest[i][j] = Math.min(shortest[i][j], shortest[i][k] + shortest[k][j]);
//                }
//            }
//        }
//
//        for (int i = 1; i <= size; i++) {
//            System.out.println(Arrays.toString(shortest[i]));
//        }
//
//        int result = 0;
//        int idx = 0;
//        for (int i = 2; i <= size; i++) {
//            if (result < shortest[1][i]) {
//                idx = i;
//                result = shortest[1][i];
//            }
//        }
//        return new int[]{idx, result, result + 1};
//    }
//}
//
////class Solution {
////
////    int[] dx = {0, 0, 1, -1};
////    int[] dy = {1, -1, 0, 0};
////
////    public int solution(int size, int[][] map) {
////        int[][] visited = new int[size][size];
////        int[][] shorted = new int[size][size];
////        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[2] - b[2]);
////        q.add(new int[]{0, 0, map[0][0]});
////        visited[0][0] = 1;
////        while (!q.isEmpty()) {
////            int[] temp = q.poll();
////            for (int i = 0; i < 4; i++) {
////                int nextX = temp[0] + dx[i];
////                int nextY = temp[1] + dy[i];
////                int cost = temp[2];
////                if (nextX > -1 && nextX < size && nextY > -1 && nextY < size) {
////                    if (visited[nextX][nextY] == 0) {
////                        map[nextX][nextY] += cost;
////                        q.add(new int[]{nextX, nextY, map[nextX][nextY]});
////                        visited[nextX][nextY] = 1;
////                    }
////                }
////            }
////        }
////        return map[size - 1][size - 1];
////    }
////}
//
////
////class Solution {
////    public int solution(int n) {
////        PriorityQueue<Integer> q = new PriorityQueue<>();
////        HashSet<Integer> result = new HashSet<>();
////
////        q.add(1);
////        int answer = 0;
////        while(true){
////            int pop = q.poll();
////            result.add(pop);
////            if(result.size() == n) {
////                answer = pop;
////                break;
////            }
////            q.add(pop*2);
////            q.add(pop*3);
////            q.add(pop*5);
////        }
////        return answer;
////    }
////    public int solution2(int n) {
////        int[] record = new int[1000];
////        record[1] = 1;
////        record[2] = 2;
////        record[3] = 3;
////        record[5] = 5;
////        int i = 2;
////        int count = 1;
////        int result = 0;
////        while (true) {
////            if (i%2==0 && record[i / 2] != 0) {
////                record[i] = i;
////            } else if (i%3==0 &&record[i / 3] != 0) {
////                record[i] = i;
////            } else if (i%5==0 &&record[i / 5] != 0) {
////                record[i] = i;
////            }
////            if (record[i] != 0) count++;
////            if (count == n) {
////                result = i;
////                break;
////            }
////            i++;
////        }
////        return result;
////    }
////}
