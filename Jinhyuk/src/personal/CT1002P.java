//package personal;
//
//import java.io.*;
//import java.util.*;
//
//public class CT1002P {
//    //    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int n = Integer.parseInt(st.nextToken());
////        int m = Integer.parseInt(st.nextToken());
////
////        int[][] array = new int[m][2];
////        for (int i = 0; i < m; i++) {
////            str = br.readLine();
////            st = new StringTokenizer(str, " ");
////            int node1 = Integer.parseInt(st.nextToken());
////            int node2 = Integer.parseInt(st.nextToken());
////            array[i][0] = node1;
////            array[i][1] = node2;
////        }
////
////        str = br.readLine();
////        st = new StringTokenizer(str, " ");
////        int target = Integer.parseInt(st.nextToken());
////        int mid = Integer.parseInt(st.nextToken());
////        Solution temp = new Solution();
////        System.out.println(temp.solution(n, m, target, mid, array));
////    }
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int n = Integer.parseInt(st.nextToken());
////        int m = Integer.parseInt(st.nextToken());
////        int c = Integer.parseInt(st.nextToken());
////
////        int[][] array = new int[m][3];
////        for (int i = 0; i < m; i++) {
////            str = br.readLine();
////            st = new StringTokenizer(str, " ");
////            int startNode = Integer.parseInt(st.nextToken());
////            int endNode = Integer.parseInt(st.nextToken());
////            int cost = Integer.parseInt(st.nextToken());
////            array[i][0] = startNode;
////            array[i][1] = endNode;
////            array[i][2] = cost;
////        }
////
////        Solution temp = new Solution();
////        System.out.println(Arrays.toString(temp.solution(n, m, c, array)));
////    }
////    public static void main(String[] args) throws IOException {
////        Solution temp = new Solution();
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int size = Integer.parseInt(str);
////        int[] array = new int[size];
////        str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        for (int i = 0; i < size; i++) {
////            array[i] = Integer.parseInt(st.nextToken());
////        }
////        System.out.println(temp.solution(array));
////    }
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        Solution temp = new Solution();
////        System.out.println(temp.solution(str));
////
////    }
//
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        Solution temp = new Solution();
////        System.out.println(temp.solution(str));
////    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int size = Integer.parseInt(str);
//        int[] array = new int[size];
//        str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        for (int i = 0; i < size; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        Solution temp = new Solution();
//        System.out.println(temp.solution(array));
//    }
//
//}
//
//class Solution {
//    public int solution(int[] array) {
//        Arrays.sort(array);
//        HashSet<Integer> sumSet = new HashSet<>();
//        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            int sum = 0;
//            for (int j = i; j < array.length; j++) {
//                sum += array[j];
//                sumSet.add(sum);
//            }
//            if (i == 0) max = sum;
//        }
//        int i = 0;
//        while (i <= max) {
//            i++;
//            if (!sumSet.contains(i)) {
//                break;
//            }
//        }
//        return i;
//    }
//
////    public int solution(String array) {
////        int count = 0;
////        char now = array.charAt(0);
////        for (char i : array.toCharArray()) {
////            if (now != i) {
////                now = i;
////                count++;
////            }
////        }
////        if (count % 2 == 0) {
////            return count / 2;
////        } else {
////            return count / 2 + 1;
////        }
////    }
//
////    public int solution(String array) {
////        int max = 0;
////        for (char i : array.toCharArray()) {
////            int num = i - '0';
////            max = Math.max(max + num, max * num);
////        }
////        return max;
////    }
////    public int solution(int[] array) {
////        Arrays.sort(array);
////        int i = 0;
////        int count = 0;
////        while (i < array.length) {
////            int start = array[i];
////            i += array[i];
////            if (i - 1 >= array.length) break;
////            int end = array[i - 1];
////            if (start < end) break;
////            else count++;
////        }
////        return count;
////    }
//
//
////    public int findParent(int[] parent, int x){
////        if(parent[x] != x){
////            parent[x] = findParent(parent, parent[x]);
////        }
////        return parent[x];
////    }
////
////    public void union(int a, int b, int[] parent) {
////        int aParent = findParent(parent, a);
////        int bParent = findParent(parent, b);
////        if(aParent < bParent){
////            parent[bParent] = aParent;
////        }else{
////            parent[aParent] = bParent;
////        }
////    }
////    int[] parent;
////    public void Solution(){
////        parent = new int[10];
////        for(int i = 0 ; i < 10 ; i++){
////            parent[i] = i;
////        }
////    }
//
////    public int[] solution(int n, int m, int c, int[][] array) {
////        int[] minArray = new int[n + 1];
////        for (int i = 0; i <= n; i++) {
////            if (i == c) minArray[i] = 0;
////            else minArray[i] = 1000000000;
////        }
////        LinkedList<int[]>[] nearNode = new LinkedList[n + 1];
////        for (int i = 0; i <= n; i++) {
////            nearNode[i] = new LinkedList<>();
////        }
////        for (int[] i : array) {
////            nearNode[i[0]].add(new int[]{i[1], i[2]});
////        }
////
////        PriorityQueue<int[]> q = new PriorityQueue<>((int[] a, int[] b) -> {
////            return a[1] - b[1];
////        });
////        q.add(new int[]{c, 0});
////        while (!q.isEmpty()) {
////            int[] temp = q.poll();
////            if (minArray[temp[0]] < temp[1]) continue;
////            for (int[] i : nearNode[temp[0]]) {
////                int cost = temp[1] + i[1];
////                if (cost < minArray[i[0]]) {
////                    minArray[i[0]] = cost;
////                    q.add(i);
////                }
////            }
////        }
////
////        int count = 0;
////        int max = 0;
////        for (int i : minArray) {
////            if (i < 1000000000 && i != 0) {
////                count++;
////                max = Math.max(max, i);
////            }
////        }
////        return new int[]{count, max};
////    }
//
////    public int solution(int n, int m, int target, int mid, int[][] array) {
////        int[][] shortestWay = new int[n + 1][n + 1];
////        for (int i = 1; i <= n; i++) {
////            for (int j = 1; j <= n; j++) {
////                if (i == j) shortestWay[i][j] = 0;
////                else shortestWay[i][j] = 1000000000;
////            }
////        }
////
////        for (int[] i : array) {
////            shortestWay[i[0]][i[1]] = 1;
////            shortestWay[i[1]][i[0]] = 1;
////        }
////
////        for (int k = 1; k <= n; k++) {
////            for (int i = 1; i <= n; i++) {
////                for (int j = 1; j <= n; j++) {
////                    shortestWay[i][j] = Math.min(shortestWay[i][j], shortestWay[i][k] + shortestWay[k][j]);
////                }
////            }
////        }
////
////        if (shortestWay[1][mid] == 1000000000 || shortestWay[mid][target] == 1000000000) return -1;
////        else return shortestWay[1][mid] + shortestWay[mid][target];
////    }
//}
