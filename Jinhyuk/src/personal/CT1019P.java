//package personal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.StringTokenizer;
//
//public class CT1019P {
//    public static void main(String[] args) throws IOException {
////        Solution temp = new Solution();
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int n = Integer.parseInt(st.nextToken());
////        int line = Integer.parseInt(st.nextToken());
////        int dist = Integer.parseInt(st.nextToken());
////        int start = Integer.parseInt(st.nextToken());
////        int[][] lines = new int[line][2];
////        for (int i = 0; i < line; i++) {
////            str = br.readLine();
////            st = new StringTokenizer(str, " ");
////            lines[i][0] = Integer.parseInt(st.nextToken());
////            lines[i][1] = Integer.parseInt(st.nextToken());
////        }
////        LinkedList<Integer> result = temp.solution(lines, n, dist, start);
////        for (int i = 0; i < result.size(); i++) {
////            System.out.println(result.get(i));
////        }
////        Solution temp = new Solution();
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int n = Integer.parseInt(st.nextToken());
////        int m = Integer.parseInt(st.nextToken());
////        int[][] map = new int[n][m];
////        for (int i = 0; i < n; i++) {
////            str = br.readLine();
////            st = new StringTokenizer(str, " ");
////            for (int j = 0; j < m; j++) {
////                map[i][j] = Integer.parseInt(st.nextToken());
////            }
////        }
////
////        System.out.println(temp.solution(map));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//
//        int[][] map = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            str = br.readLine();
//            st = new StringTokenizer(str, " ");
//            for (int j = 0; j < n; j++) {
//                map[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        str = br.readLine();
//        st = new StringTokenizer(str, " ");
//        int time = Integer.parseInt(st.nextToken());
//        int searchLocationX = Integer.parseInt(st.nextToken());
//        int searchLocationY = Integer.parseInt(st.nextToken());
//
//        Solution temp = new Solution();
//        System.out.println(temp.solution(map, k, new int[]{searchLocationX, searchLocationY}, time));
//    }
//}
//
//class Solution {
//
//    int[] dx = {0, 0, 1, -1};
//    int[] dy = {1, -1, 0, 0};
//
//    public int solution(int[][] map, int k, int[] searchLocation, int time) {
////        int[][] virusLocation = new int[k + 1][2];
//        LinkedList<int[]> virusLoc = new LinkedList<>();
//        int[][] timeMap = new int[map.length][map.length];
//
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map.length; j++) {
//                if (map[i][j] != 0) {
////                    virusLocation[map[i][j]] = new int[]{i, j};
//                    virusLoc.add(new int[]{map[i][j], i, j});
//                }
//            }
//        }
//        Collections.sort(virusLoc, (a,b)->a[0]-b[0]);
//
//        LinkedList<int[]> virus = new LinkedList<>();
//        for (int[] i: virusLoc) {
//            virus.addLast(new int[]{i[1], i[2]});
//        }
//
//        while (!virus.isEmpty()) {
//            int[] temp = virus.removeFirst();
//            if (timeMap[temp[0]][temp[1]] + 1 > time) break;
//            for (int i = 0; i < 4; i++) {
//                int nextX = temp[0] + dx[i];
//                int nextY = temp[1] + dy[i];
//                if (nextX > -1 && nextX < map.length && nextY > -1 && nextY < map.length) {
//                    if (map[nextX][nextY] == 0) {
//                        timeMap[nextX][nextY] = timeMap[temp[0]][temp[1]] + 1;
//                        map[nextX][nextY] = map[temp[0]][temp[1]];
//                        virus.addLast(new int[]{nextX, nextY});
//                    }
//                }
//            }
//        }
//
//        return map[searchLocation[0] - 1][searchLocation[1] - 1];
//    }
////    int result = 0;
////
////    public int solution(int[][] map) {
////        LinkedList<int[]> virus = new LinkedList<>();
////        for (int i = 0; i < map.length; i++) {
////            for (int j = 0; j < map[0].length; j++) {
////                if (map[i][j] == 2) virus.add(new int[]{i, j});
////            }
////        }
////        findCase(0, map, virus);
////        return result;
////    }
////
////    public void findCase(int wall, int[][] map, LinkedList<int[]> virus) {
////        if (wall == 3) {
////            result = Math.max(result, bfs(map, virus));
////        } else {
////            for (int i = 0; i < map.length; i++) {
////                for (int j = 0; j < map[0].length; j++) {
////                    if (map[i][j] == 0) {
////                        map[i][j] = 1;
////                        findCase(wall + 1, map, virus);
////                        map[i][j] = 0;
////                    }
////                }
////            }
////        }
////    }
////
////    int[] dx = {0, 0, 1, -1};
////    int[] dy = {1, -1, 0, 0};
////
////    public int bfs(int[][] map, LinkedList<int[]> virus) {
////        int[][] tempMap = new int[map.length][map[0].length];
////        for(int i = 0 ; i < map.length ; i++){
////            for(int j = 0 ; j < map[0].length; j++){
////                tempMap[i][j] = map[i][j];
////            }
////        }
////
////        for (int[] i : virus) {
////            LinkedList<int[]> visited = new LinkedList<>();
////            visited.add(i);
////            while (!visited.isEmpty()) {
////                int[] temp = visited.removeFirst();
////                for (int j = 0; j < 4; j++) {
////                    int nextX = temp[0] + dx[j];
////                    int nextY = temp[1] + dy[j];
////                    if (nextX > -1 && nextX < map.length && nextY > -1 && nextY < map[0].length) {
////                        if (tempMap[nextX][nextY] == 0) {
////                            visited.addLast(new int[]{nextX, nextY});
////                            tempMap[nextX][nextY] = 2;
////                        }
////                    }
////                }
////            }
////        }
////        return countClearPlace(tempMap);
////    }
////
////    public int countClearPlace(int[][] map) {
////        int count = 0;
////        for (int i = 0; i < map.length; i++) {
////            for (int j = 0; j < map[0].length; j++) {
////                if (map[i][j] == 0) count++;
////            }
////        }
////        return count;
////    }
//
////    public LinkedList<Integer> solution(int[][] lines, int n, int dist, int start) {
////        LinkedList<Integer>[] nearList = new LinkedList[n + 1];
////        for (int i = 1; i <= n; i++) {
////            nearList[i] = new LinkedList<Integer>();
////        }
////
////        for (int[] i : lines) {
////            nearList[i[0]].add(i[1]);
////        }
////        int[] distance = new int[n + 1];
////        for (int i = 1; i <= n; i++) {
////            distance[i] = n + 1;
////        }
////
////        LinkedList<Integer> visited = new LinkedList<>();
////        visited.add(start);
////        distance[start] = 0;
////        while (!visited.isEmpty()) {
////            int temp = visited.removeFirst();
////            for (int i : nearList[temp]) {
////                if (distance[i] != n + 1) continue;
////                visited.addLast(i);
////                distance[i] = distance[temp] + 1;
////            }
////        }
////
////        LinkedList<Integer> result = new LinkedList<>();
////        for (int i = 1; i <= n; i++) {
////            if (distance[i] == dist) result.add(i);
////        }
////        if (result.size() == 0) result.add(-1);
////        Collections.sort(result);
////        return result;
////    }
//}
