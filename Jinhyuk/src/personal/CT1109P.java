package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT1109P {
    //    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int size = Integer.parseInt(str);
//        int[][] board = new int[size][size];
//
//        for(int i = 0 ; i < size; i++) {
//            str = br.readLine();
//            StringTokenizer st = new StringTokenizer(str, " ");
//            for(int j = 0 ; j < size; j++){
//                board[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        Solution temp = new Solution();
//        System.out.println(temp.solution(board));
//    }
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int size = Integer.parseInt(str);
//
//        int[] list = new int[size];
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < list.length; i++) {
//            list[i] = Integer.parseInt(st.nextToken());
//        }
//        Solution temp = new Solution();
//        System.out.println(temp.solution(list));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        Solution temp = new Solution();
        System.out.println(temp.solution(list, limit));
    }
}

class Solution {
    int maxDist(int[] list, int startDist, int endDist, int num) {
        if (startDist > endDist) return 0;
        int mid = (startDist + endDist) / 2;
        if (count(mid, list) >= num) {
            if (count(mid + 1, list) < num) {
                return mid;
            } else {
                return maxDist(list, mid + 1, endDist, num);
            }
        } else {
            return maxDist(list, startDist, mid - 1, num);
        }
    }

    int count(int mid, int[] list) {
        int count = 1;
        int start = list[0];
        for (int i : list) {
            if (i >= start + mid) {
                start = i;
                count++;
            }
        }
        return count;
    }

    public int solution(int[] list, int limit) {
        Arrays.sort(list);
        int limitRange = list[list.length-1] - list[0];
        int result = maxDist(list, 0, limitRange, limit);
        return result;
    }
}

//class Solution {
//    public int findIdx(int[] list, int startIdx, int endIds) {
//        if (startIdx > endIds) return -1;
//
//        int mid = (startIdx + endIds) / 2;
//
//        if (list[mid] == mid) {
//            return mid;
//        } else if (list[mid] > mid) {
//            return findIdx(list, startIdx, mid - 1);
//        } else {
//            return findIdx(list, mid + 1, endIds);
//        }
//    }
//
//    public int solution(int[] list) {
//        int idx = findIdx(list, 0, list.length - 1);
//        return idx;
//    }
//}
//class Solution {
//    int[] dx = {0, 0, 1, -1};
//    int[] dy = {1, -1, 0, 0};
//
//    public int solution(int[][] board) {
//        int answer = 0;
//        HashSet<int[][]> visited = new HashSet<>();
//        ArrayDeque<int[][]> q = new ArrayDeque<>();
//        int[][] start = new int[3][2];
//        start[0] = new int[]{0, 0};
//        start[1] = new int[]{0, 1};
//        start[2] = new int[]{0, 0};
//        q.add(new int[][]{start[0], start[1], start[2]});
//        visited.add(new int[][]{start[0], start[1]});
//
//        while (!q.isEmpty()) {
//            int[][] temp = q.removeFirst();
//            if ((temp[0][0] == board.length - 1 && temp[0][1] == board.length - 1) || (temp[1][0] == board.length - 1 && temp[1][1] == board.length - 1)) {
//                return temp[2][0];
//            }
//            for (int[][] i : getNext(temp, board)) {
////                System.out.println(Arrays.toString(i[0])+ " "+Arrays.toString(i[1]));
//                for(int[][] j : visited){
//                    System.out.println(Arrays.toString(j[0])+ " "+Arrays.toString(j[1]));
//                }
//                System.out.println();
//                if (!visited.contains(i) || !visited.contains(new int[][]{i[1],i[0]})) {
////                    System.out.println("in");
//                    visited.add(i);
//                    temp[2][0] += 1;
//                    q.add(new int[][]{i[0], i[1], temp[2]});
//                }
//            }
//        }
//
//        return answer;
//    }
//
//    LinkedList<int[][]> getNext(int[][] temp, int[][] board) {
//        LinkedList<int[][]> nextPosition = new LinkedList<>();
//        for (int i = 0; i < 4; i++) {
//            int a = temp[0][0] + dx[i];
//            int b = temp[0][1] + dy[i];
//            int c = temp[1][0] + dx[i];
//            int d = temp[1][1] + dy[i];
//            if (a > -1 && a < board.length - 1 && b > -1 && b < board.length && c > -1 && c < board.length && d > -1 && d < board.length) {
//                int[] nextFirst = new int[]{a, b};
//                int[] nextSecond = new int[]{c, d};
//                if (board[nextFirst[0]][nextFirst[1]] == 0 && board[nextSecond[0]][nextSecond[1]] == 0)
//                    nextPosition.add(new int[][]{nextFirst, nextSecond});
//            }
//        }
//
//        if (temp[0][0] == temp[1][0]) {
//            if (temp[0][0] + 1 < board.length && board[temp[0][0] + 1][temp[0][1]] == 0 && board[temp[1][0] + 1][temp[1][1]] == 0) {
//                int[] nextFirst = new int[]{temp[1][0], temp[1][1]};
//                int[] nextSecond = new int[]{temp[1][0] + 1, temp[1][1]};
//                nextPosition.add(new int[][]{nextFirst, nextSecond});
//
//                nextFirst = new int[]{temp[0][0], temp[0][1]};
//                nextSecond = new int[]{temp[0][0] + 1, temp[0][1]};
//                nextPosition.add(new int[][]{nextFirst, nextSecond});
//            }
//            if (temp[0][0] - 1 > -1 && board[temp[0][0] - 1][temp[0][1]] == 0 && board[temp[1][0] - 1][temp[1][1]] == 0) {
//                int[] nextFirst = new int[]{temp[1][0], temp[1][1]};
//                int[] nextSecond = new int[]{temp[1][0] - 1, temp[1][1]};
//                nextPosition.add(new int[][]{nextFirst, nextSecond});
//
//                nextFirst = new int[]{temp[0][0], temp[0][1]};
//                nextSecond = new int[]{temp[0][0] - 1, temp[0][1]};
//                nextPosition.add(new int[][]{nextFirst, nextSecond});
//            }
//        } else {
//            if (temp[0][1] + 1 < board.length && board[temp[0][0]][temp[0][1] + 1] == 0 && board[temp[1][0]][temp[1][1] + 1] == 0) {
//                int[] nextFirst = new int[]{temp[1][0], temp[1][1]};
//                int[] nextSecond = new int[]{temp[1][0], temp[1][1] + 1};
//                nextPosition.add(new int[][]{nextFirst, nextSecond});
//
//                nextFirst = new int[]{temp[0][0], temp[0][1]};
//                nextSecond = new int[]{temp[0][0], temp[0][1] + 1};
//                nextPosition.add(new int[][]{nextFirst, nextSecond});
//            }
//            if (temp[0][1] - 1 > -1 && board[temp[0][0]][temp[0][1] - 1] == 0 && board[temp[1][0]][temp[1][1] - 1] == 0) {
//                int[] nextFirst = new int[]{temp[1][0], temp[1][1]};
//                int[] nextSecond = new int[]{temp[1][0], temp[1][1] - 1};
//                nextPosition.add(new int[][]{nextFirst, nextSecond});
//
//                nextFirst = new int[]{temp[0][0], temp[0][1]};
//                nextSecond = new int[]{temp[0][0], temp[0][1] - 1};
//                nextPosition.add(new int[][]{nextFirst, nextSecond});
//            }
//        }
//
//        return nextPosition;
//    }
//}