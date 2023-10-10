//package personal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class CT0923P {
//    //    static int[][] near = new int[][]{
////            {},
////            {2, 3, 8},
////            {1, 7},
////            {1, 4, 5},
////            {3, 5},
////            {3, 4},
////            {7},
////            {2, 6, 8},
////            {1, 7}
////    };
////    static boolean[] visited;
////
////    public static void dfs(int[][] graph, int v, boolean[] visited) {
////        visited[v] = true;
////        System.out.println(v);
////        for (int i : graph[v]) {
////            if (!visited[i]) {
////                dfs(graph, i, visited);
////            }
////        }
////    }
////
////    public static void bfs(int[][] graph, int start, boolean[] visited) {
////        LinkedList<Integer> q = new LinkedList<>();
////        q.addLast(start);
////        visited[start] = true;
////        while (!q.isEmpty()) {
////            int temp = q.removeFirst();
////            System.out.println(temp);
////            for (int i : graph[temp]) {
////                if (!visited[i]) {
////                    q.addLast(i);
////                    visited[i] = true;
////                }
////            }
////        }
////    }
////    static int binary_search(int[] array, int target, int start, int end) {
////        if (start > end) return -1;
////        int mid = (start + end) / 2;
////        if (array[mid] > target) {
////            return binary_search(array, target, start, mid - 1);
////        } else if (array[mid] < target) {
////            return binary_search(array, target, mid + 1, end);
////        } else {
////            return array[mid];
////        }
////    }
//
//    public static void main(String[] args) throws IOException {
////        visited = new boolean[near.length];
////        dfs(near, 1, visited);
////        System.out.println();
////
////        visited = new boolean[near.length];
////        bfs(near, 1, visited);
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int xSize = Integer.parseInt(st.nextToken());
////        int ySize = Integer.parseInt(st.nextToken());
////        int[][] map = new int[xSize][ySize];
////
////        for (int i = 0; i < xSize; i++) {
////            str = br.readLine();
////            for (int j = 0; j < ySize; j++) {
////                map[i][j] = str.charAt(j) - '0';
////            }
////        }
////
////        Test temp = new Test();
////        System.out.println(temp.answer(map));
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////
////        LinkedList<String[]> list = new LinkedList<>();
////        for(int i = 0 ; i < Integer.parseInt(str);i++){
////            String strr = br.readLine();
////            StringTokenizer st = new StringTokenizer(strr, " ");
////            String[] temp = {st.nextToken(), st.nextToken()};
////            list.add(temp);
////        }
////        Collections.sort(list, (String[] a, String[] b) -> Integer.parseInt(a[1])- Integer.parseInt(b[1]));
////        for(String[] i : list){
////            System.out.println(i[0]);
////        }
////        LinkedList<Integer> list = new LinkedList<>();
////        list.add(3);
////        list.add(10);
////        list.add(7);
////        list.add(5);
////        list.add(6);
////        list.add(1);
////        Collections.sort(list, Collections.reverseOrder());
////        System.out.println(list);
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int N = Integer.parseInt(st.nextToken());
////        int M = Integer.parseInt(st.nextToken());
////        str = br.readLine();
////        st = new StringTokenizer(str, " ");
////        int[] dduck = new int[N];
////        for (int i = 0; i < N; i++) {
////            dduck[i] = Integer.parseInt(st.nextToken());
////        }
////        Test temp = new Test();
////        System.out.println(temp.answer(dduck, M));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int num = Integer.parseInt(str);
//        Test test = new Test();
//        System.out.println(test.answer(num));
//    }
//}
//
//class Test {
//    int answer(int num) {
//        HashMap<Integer, Integer> hash = new HashMap<>();
//        hash.put(1, 0);
//        hash.put(2, 1);
//        hash.put(3, 1);
//        hash.put(5, 1);
//
//        for (int i = 1; i <= num; i++) {
//            if (!hash.containsKey(i)) {
//                int min = i;
//
//                if (i % 5 == 0) min = Math.min(min, hash.get(i / 5) + 1);
//
//                if (i % 3 == 0) min = Math.min(min, hash.get(i / 3) + 1);
//
//                if (i % 2 == 0) min = Math.min(min, hash.get(i / 2) + 1);
//
//                if (i - 1 > 0) min = Math.min(min, hash.get(i - 1) + 1);
//
//                hash.put(i, min);
//            }
//        }
//
//        return hash.get(num);
//    }
//
////    int answer(int[] dduck, int request) {
////        Arrays.sort(dduck);
////        int max = dduck[dduck.length - 1];
////        var result = binary_search(0, max, request, dduck);
////        return result;
////    }
////
////    int binary_search(int start, int end, int target, int[] dduck) {
////        if (start > end) return -1;
////        int mid = (start + end) / 2;
////
////        int cal = calculate(mid, dduck);
////        if (cal == target) {
////            return mid;
////        } else if (cal < target) {
////            return binary_search(start, mid - 1, target, dduck);
////        } else {
////            return binary_search(mid + 1, end, target, dduck);
////        }
////    }
////
////    int calculate(int mid, int[] ddcuk) {
////        int sum = 0;
////        for (int i : ddcuk) {
////            if ((i - mid) > 0) sum += (i - mid);
////        }
////        return sum;
////    }
//
////    LinkedList<String[]> answer() {
////        LinkedList<String[]> list = new LinkedList<>();
////        Collections.sort(list, (String[] a, String[] b) -> Integer.parseInt(a[1]) - Integer.parseInt(b[1]));
////        return list;
////    }
//
////    int answer(int[][] map) {
////        boolean[][] visited = new boolean[map.length][map[0].length];
////        bfs(map, new int[]{0, 0}, visited);
////        return map[map.length - 1][map[0].length - 1];
////    }
////
////    int[] dx = {0, 0, 1, -1};
////    int[] dy = {1, -1, 0, 0};
////
////    void bfs(int[][] map, int[] start, boolean[][] visited) {
////        LinkedList<int[]> q = new LinkedList<>();
////        visited[start[0]][start[1]] = true;
////        map[start[0]][start[1]] = 1;
////        q.addLast(new int[]{start[0], start[1], 1});
////        while (!q.isEmpty()) {
////            int[] temp = q.removeFirst();
////            for (int i = 0; i < 4; i++) {
////                int nextX = temp[0] + dx[i];
////                int nextY = temp[1] + dy[i];
////                int count = temp[2];
////                if (nextX > -1 && nextX < map.length && nextY > -1 && nextY < map[0].length) {
////                    if (map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
////                        visited[nextX][nextY] = true;
////                        map[nextX][nextY] = count + 1;
////                        q.addLast(new int[]{nextX, nextY, count + 1});
////                    }
////                }
////            }
////        }
////    }
////    int answer(int[][] map) {
////        int count = 0;
////        for (int i = 0; i < map.length; i++) {
////            for (int j = 0; j < map[i].length; j++) {
////                if (map[i][j] == 0) {
////                    count++;
////                    bfs(map, new int[]{i, j});
////                }
////            }
////        }
////        return count;
////    }
////
////    int[] dx = {0, 0, 1, -1};
////    int[] dy = {1, -1, 0, 0};
////
////    void bfs(int[][] map, int[] start) {
////        LinkedList<int[]> q = new LinkedList<>();
////        q.addLast(start);
////        map[start[0]][start[1]] = 1;
////        while (!q.isEmpty()) {
////            int[] temp = q.removeFirst();
////            for (int i = 0; i < 4; i++) {
////                int nextX = temp[0] + dx[i];
////                int nextY = temp[1] + dy[i];
////                if (nextX > -1 && nextX < map.length && nextY > -1 && nextY < map[0].length) {
////                    if (map[nextX][nextY] == 0) {
////                        map[nextX][nextY] = 1;
////                        q.addLast(new int[]{nextX, nextY});
////                    }
////                }
////            }
////        }
////    }
//}