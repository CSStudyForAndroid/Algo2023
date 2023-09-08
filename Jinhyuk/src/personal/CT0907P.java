//package personal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.StringTokenizer;

//public class CT0907P {
//    //    5 5
////    1 2 3 4 5
////    5 4 3 2 1
////    2 3 4 5 6
////    6 5 4 3 2
////    1 2 1 2 1
//    static int[] dx = {0, 0, 1, -1};
//    static int[] dy = {1, -1, 0, 0};
//    static int[][] basicBlock1 = {{0, 0}, {0, 1}, {0, 2}, {0, 3}};
//    static int[][] basicBlock2 = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
//    static int[][] basicBlock3 = {{0, 0}, {1, 0}, {2, 0}, {2, 1}};
//    static int[][] basicBlock4 = {{0, 0}, {1, 0}, {1, 1}, {2, 1}};
//    static int[][] basicBlock5 = {{0, 0}, {0, 1}, {0, 2}, {1, 1}};
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] map = new int[n][m];
//        int[][] visited = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            for (int j = 0; j < m; j++) {
//                map[i][j] = Integer.parseInt(st.nextToken());
//                visited[i][j] = 0;
//            }
//        }
//
//    }
//
//    static Boolean findMaxNum(Boolean spaceAvailbility, int[][] visited, int n, int m, int[][] startingPoint) {
//        if (!spaceAvailbility) {
//
//        } else {
//            for (int[] i : startingPoint) {
//                for (int j = 0; j < i.length; j++) {
//                    int searchX = i[0] + dx[j];
//                    int searchY = i[1] + dy[j];
//                    if (searchX > -1 && searchX < n && searchY > -1 && searchY < m) {
//                        if (visited[searchX][searchY] == 0) {
//                            if (checkMap(visited, basicBlock1, searchX, searchY)) {
//                                findMaxNum(true, makeVisited(visited, basicBlock1, searchX, searchY), n, m, makeStartingPoint(basicBlock1, searchX, searchY));
//                            }
//                            if (checkMap(visited, basicBlock1, searchX, searchY)) {
//                                findMaxNum(true, makeVisited(visited, basicBlock1, searchX, searchY), n, m, makeStartingPoint(basicBlock1, searchX, searchY));
//                            }
//                            if (checkMap(visited, basicBlock2, searchX, searchY)) {
//
//                            }
//                            if (checkMap(visited, basicBlock3, searchX, searchY)) {
//
//                            }
//                            if (checkMap(visited, basicBlock4, searchX, searchY)) {
//
//                            }
//                            if (checkMap(visited, basicBlock5, searchX, searchY)) {
//
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//    if(visited[i][j]==0)
//
//    {
//        // 가능한 경우의 수
//        for (int[] k : basicBlock2) {
//            int searchX = i + k[0];
//            int searchY = i + k[1];
//            if (visited[searchX][searchY] == 1) {
//
//                break;
//            }
//        }
//    }
//
//    static int[][] makeStartingPoint(int[][] block, int x, int y) {
//        return new int[][]{
//                {x + block[0][0], y + block[0][1]},
//                {x + block[1][0], y + block[1][1]},
//                {x + block[2][0], y + block[2][1]},
//                {x + block[3][0], y + block[3][1]}
//        };
//    }
//
//    static Boolean checkMap(int[][] visited, int[][] block, int x, int y) {
//        if (visited[x + block[0][0]][y + block[0][1]] == 1) return false;
//        if (visited[x + block[1][0]][y + block[1][1]] == 1) return false;
//        if (visited[x + block[2][0]][y + block[2][1]] == 1) return false;
//        if (visited[x + block[3][0]][y + block[3][1]] == 1) return false;
//        return true;
//    }
//
//    static int[][] makeVisited(int[][] visited, int[][] block, int x, int y) {
//        visited[x + block[0][0]][y + block[0][1]] = 1;
//        visited[x + block[1][0]][y + block[1][1]] = 1;
//        visited[x + block[2][0]][y + block[2][1]] = 1;
//        visited[x + block[3][0]][y + block[3][1]] = 1;
//        return visited;
//    }
//
//    static int[][] makeRotate(int[][] block) {
//        return new int[][]{block[0], {-block[1][1], block[1][0]}, {-block[2][1], block[2][0]}, {-block[3][1], block[3][0]}};
//    }
//
//    static int[][] makeFlip(int[][] block) {
//        return new int[][]{block[0], {block[1][0], block[1][1]}, {block[2][0], block[2][1]}, {block[3][0], block[3][1]}};
//    }
//
//}

////////////////////////////////////////////////////////////////
//class Solution {
//    static int[] type1 = {1, 2, 3, 4, 5}; // 5
//    static int[] type2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
//    static int[] type3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
//
//    public int[] solution(int[] answers) {
//        LinkedList<Integer> result = new LinkedList<>();
//        int[] correctCount = new int[3];
//        for (int i = 0; i < answers.length; i++) {
//            int type1Idx = i % 5;
//            int type2Idx = i % 8;
//            int type3Idx = i % 10;
//
//            if (type1[type1Idx] == answers[i]) correctCount[0]++;
//            if (type2[type2Idx] == answers[i]) correctCount[1]++;
//            if (type3[type3Idx] == answers[i]) correctCount[2]++;
//        }
//        int max = 0;
//        for (int i : correctCount) {
//            max = Math.max(max, i);
//        }
//
//        for (int i = 0; i < correctCount.length; i++) {
//            if (correctCount[i] == max) {
//                result.add(i + 1);
//            }
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}


//class Solution {
//    public int[] solution(int[] answers) {
//        int[] answer = {0, 0, 0};
//
//        for (int i = 0; i < answers.length; i++) {
//            int idx = i % 5 + 1;
//            // 첫 번째
//            if (answers[i] == idx) {
//                answer[0]++;
//            }
//
//            // 두 번째
//            if (i % 2 == 0 && answers[i] == 2) {
//                answer[1]++;
//            } else {
//                int idx2 = i % 8 ;
//                if (idx2 == 1 && answers[i] == 1) answer[1]++;
//                else if (idx2 == 3 && answers[i] == 3) answer[1]++;
//                else if (idx2 == 5 && answers[i] == 4) answer[1]++;
//                else if (idx2 == 7 && answers[i] == 5) answer[1]++;
//            }
//
//            // 세 번째
//            int idx3 = i % 10;
//            if (idx3 > -1 && idx3 < 2 && answers[i] == 3) answer[2]++;
//            else if (idx3 > 1 && idx3 < 4 && answers[i] == 1) answer[2]++;
//            else if (idx3 > 3 && idx3 < 6 && answers[i] == 2) answer[2]++;
//            else if (idx3 > 5 && idx3 < 8 && answers[i] == 4) answer[2]++;
//            else if (idx3 > 7 && idx3 < 10 && answers[i] == 5) answer[2]++;
//        }
//
//        int max = Arrays.stream(answer).max().getAsInt();
//        ArrayList<Integer> result = new ArrayList<>();
//        for(int i = 0; i < answer.length; i++){
//            if(answer[i] == max){
//                result.add(i+1);
//            }
//        }
//
//        return result.stream()
//                .mapToInt(i -> i)
//                .toArray();
//    }
//}






