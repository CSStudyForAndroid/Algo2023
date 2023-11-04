//package personal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
////public class CT1104P {
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int n = Integer.parseInt(st.nextToken());
////        int m = Integer.parseInt(st.nextToken());
////        int[][] map = new int[n][n];
////        for (int i = 0; i < n; i++) {
////            str = br.readLine();
////            st = new StringTokenizer(str, " ");
////            for (int j = 0; j < n; j++) {
////                map[i][j] = Integer.parseInt(st.nextToken());
////            }
////        }
////        Solution temp = new Solution();
////        System.out.println(temp.solution(n, m, map));
////    }
////}
////
////class Solution {
////
////    public int solution(int n, int m, int[][] map) {
////        int answer = 0;
////        LinkedList<int[]> house = new LinkedList<>();
////        LinkedList<int[]> store = new LinkedList<>();
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < n; j++) {
////                if (map[i][j] == 1) house.add(new int[]{i, j});
////                if (map[i][j] == 2) store.add(new int[]{i, j});
////            }
////        }
////        LinkedList<int[]> distFromStore = new LinkedList<>();
////        for (int[] i : store) {
////            int storeX = i[0];
////            int storeY = i[1];
////            int distFormOneStore = 0;
////            for (int[] j : house) {
////                int houseX = j[0];
////                int houseY = j[1];
////                distFormOneStore += (Math.abs(storeX - houseX) + Math.abs(storeY - houseY));
////            }
////            distFromStore.add(new int[]{distFormOneStore, storeX, storeY});
////        }
////
////        distFromStore.sort((a, b) -> a[0] - b[0]);
////        answer = findCase(m, distFromStore, house);
////        return answer;
////    }
////
////    public int findCase(int m, LinkedList<int[]> temp, LinkedList<int[]> house) {
////        int minSum = 0;
////        for (int[] i : house) {
////            int houseX = i[0];
////            int houseY = i[1];
////            int dist = 1000000000;
////            for (int j = 0; j < m; j++) {
////                int storeX = temp.get(j)[1];
////                int storeY = temp.get(j)[2];
////                dist = Math.min(dist, Math.abs(storeX - houseX) + Math.abs(storeY - houseY));
////            }
////            minSum += dist;
////        }
////
////        return minSum;
////    }
////}
//
//
//public class CT1104P {
//    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int n = Integer.parseInt(st.nextToken());
////        int m = Integer.parseInt(st.nextToken());
////        int[][] map = new int[n][n];
////        for (int i = 0; i < n; i++) {
////            str = br.readLine();
////            st = new StringTokenizer(str, " ");
////            for (int j = 0; j < n; j++) {
////                map[i][j] = Integer.parseInt(st.nextToken());
////            }
////        }
////        Solution temp = new Solution();
////        System.out.println(temp.solution(n, m, map));
//    }
//}
//
//class Solution {
//    public int solution(int n, int[] weak, int[] dist) {
//        int answer = 0;
//        Arrays.sort(dist);
//        LinkedList<Integer> tmep = new LinkedList<>();
//        tmep.add(1);
//        tmep.add(2);
//        tmep.add(3);
//        tmep.add(4);
//        tmep.remove()
//        return answer;
//    }
//}
////class Solution {
////    int result = 0;
////
////    public int solution(int n, int m, int[][] map) {
////        int answer = 0;
////        ArrayList<int[]> house = new ArrayList<>();
////        ArrayList<int[]> store = new ArrayList<>();
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < n; j++) {
////                if (map[i][j] == 1) house.add(new int[]{i, j});
////                if (map[i][j] == 2) store.add(new int[]{i, j});
////            }
////        }
////        result = 1000000000;
////        findCase(m, map, 0,new ArrayList<int[]>(), store, house);
////        answer = result;
////        return answer;
////    }
////
////    public void findCase(int m, int[][] map,int count,ArrayList<int[]> temp, ArrayList<int[]> store, ArrayList<int[]> house) {
////        if (count == m) {
////            int minSum = 0;
////            for (int[] i : house) {
////                int houseX = i[0];
////                int houseY = i[1];
////                int dist = 1000000000;
////                for (int[] j : temp) {
////                    int storeX = j[0];
////                    int storeY = j[1];
////                    dist = Math.min(dist, Math.abs(storeX - houseX) + Math.abs(storeY - houseY));
////                }
////                minSum += dist;
////            }
////            result = Math.min(result, minSum);
////        } else {
////            for (int i = 0; i < store.size(); i++) {
////                int x = store.get(i)[0];
////                int y = store.get(i)[1];
////                if (map[x][y] == 2) {
////                    map[x][y] = 0;
////                    int[] temp2 = new int[]{x, y};
////                    temp.add(temp2);
////                    findCase(m, map, count+1,temp, store, house);
////                    temp.remove(count);
////                    map[x][y] = 2;
////                }
////            }
////        }
////    }
////}
////class Solution {
////    public LinkedList<int[]> solution(int n, int[][] build_frame) {
////        LinkedList<int[]> list = new LinkedList<>();
////
////        for (int i = 0; i < build_frame.length; i++) {
////            int x = build_frame[i][0];
////            int y = build_frame[i][1];
////            int src = build_frame[i][2];
////            int[] temp = new int[]{x, y, src};
////            if (build_frame[i][3] == 1) { // 설치
////                System.out.println(list.size());
////                list.add(temp);
////                System.out.println(list.size());
////                System.out.println();
////                if (!checkMap(list)) {
////                    list.remove(temp);
////                }
////            } else { // 삭제
////                list.remove(temp);
////                if (!checkMap(list)) {
////                    list.add(temp);
////                }
////            }
////            System.out.println(list);
////        }
////
////        list.sort((int[] a, int[] b) -> {
////            if (a[0] != b[0]) {
////                return a[0] - b[0];
////            } else if (a[1] != b[1]) {
////                return a[1] - b[1];
////            } else {
////                return a[2] - b[2];
////            }
////        });
////
////        return list;
////    }
////
////    Boolean checkMap(LinkedList<int[]> list) {
////        for (int[] i : list) {
////            int x = i[0];
////            int y = i[1];
////            int what = i[2];
////            if (what == 0) {
////                if (y == 0 || isOk(x - 1, y, 1, list) || isOk(x, y - 1, 0, list) || isOk(x, y, 1, list))
////                    continue;
////                return false;
////            } else {
////                if (isOk(x, y - 1, 0, list) || isOk(x + 1, y - 1, 0, list) || isOk(x - 1, y, 1, list) ||
////                        isOk(x + 1, y, 1, list))
////                    continue;
////                return false;
////            }
////
////        }
////        return true;
////    }
////
////    Boolean isOk(int x, int y, int what, LinkedList<int[]> list) {
////        for (int[] i : list) {
////            if (i[0] == x && i[1] == y && i[2] == what) continue;
////            return false;
////        }
////        return true;
////    }
////}
