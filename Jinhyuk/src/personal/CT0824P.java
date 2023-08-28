//package personal;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//
//public class CT0824P {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//
//        System.out.println(s.solution(new int[][]{
//                {0, 0, 0, 0, 0, 0, 0, 0},
//                {1, 0, 1, 1, 1, 1, 1, 0},
//                {1, 0, 0, 1, 0, 0, 0, 0},
//                {1, 1, 0, 0, 0, 1, 1, 1},
//                {1, 1, 1, 1, 0, 0, 0, 0},
//                {1, 1, 1, 1, 1, 1, 1, 0},
//                {1, 1, 1, 1, 1, 1, 1, 0},
//                {1, 1, 1, 1, 1, 1, 1, 0}
//        }));
//    }
//}
//
////class Solution {
////
////    int[] dx = {-1, 1, 0, 0};
////    int[] dy = {0, 0, -1, 1};
////
////    int answer = Integer.MAX_VALUE;
////
////    public int solution(int[][] board) {
////
////        findRoute(board);
////        answer = board[board.length - 1][board.length - 1];
////        for (int i = 0; i < board.length; i++) {
////            System.out.println(Arrays.toString(board[i]));
////        }
////
////        return answer;
////    }
////
////    public void findRoute(int[][] board) {
////        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[3] - b[3]);
////        q.add(new int[]{0, 0, 0, 0});
////
////        while (!q.isEmpty()) {
////            int[] temp = q.poll();
////            for (int i = 0; i < 4; i++) {
////                int nextX = temp[0] + dx[i];
////                int nextY = temp[1] + dy[i];
////                if (nextX == 0 && nextY == 0) continue;
////
////                if (nextX > -1 && nextX < board.length && nextY > -1 && nextY < board.length && board[nextX][nextY] != 1) {
////
////                    int nextCost = temp[3];
////                    if (!(temp[0] == 0 && temp[1] == 0)) {
////                        if (i != temp[2]) {
////                            nextCost += 500;
////                        }
////                    }
////                    nextCost += 100;
////
////                    if (board[nextX][nextY] == 0) {
////                        board[nextX][nextY] = nextCost;
////                        q.add(new int[]{nextX, nextY, i, nextCost});
////                    } else {
////                        // 500의 차이를 봐주는 이유는 한 자리에 같은 타이밍에 꺾여서 들어오는 것과 일직선으로 들어오는 경우 -> 꺽여서 들어와서 비용이 발생하더라도 일직선으로 들어오는 경우를 충분히 역전할 수 있기 때문에
////                        // 현재 지점에서 갈 수 있는 경로가 2가지 인데 500원의 차이로 한 경로를 무시하고 탐색하지 않는건 손해다.
////                        if (nextCost <= board[nextX][nextY] + 500) {
//////                            board[nextX][nextY] = nextCost;
////                            q.add(new int[]{nextX, nextY, i, nextCost});
////                        }
////                    }
////
////                }
////            }
////        }
////    }
////}
//
////    public void findRoute(int[][] board, int x, int y, int cost, int direct) {
////        if (x == board.length - 1 && y == board.length - 1) {
////            answer = Math.min(answer, cost);
////        } else {
////            for (int k = 0; k < 4; k++) {
////                int nextX = dx[k] + x;
////                int nextY = dy[k] + y;
////                if (nextX == 0 && nextY == 0) continue;
////
////                if (nextX > -1 && nextX < board.length && nextY > -1 && nextY < board.length && board[nextX][nextY] == 0) {
////                    int nextCost = cost;
////                    if (x == 0 && y == 0) {
////                    } else {
////                        if (k != direct) {
////                            nextCost += 500;
////                        }
////                    }
////
////                    nextCost += 100;
////                    board[nextX][nextY] = nextCost;
////                    findRoute(board, nextX, nextY, nextCost, k);
////                    board[nextX][nextY] = 0;
////                }
////            }
////        }
////    }