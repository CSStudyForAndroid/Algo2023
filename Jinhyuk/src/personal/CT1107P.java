package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class CT1107P {
//    public static void main(String[] args) throws IOException {
//
//        solution temp = new solution();
//        System.out.println(temp.solution(")("));
//    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int size = Integer.parseInt(str);
//        str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        int[] list = new int[size];
//        for (int i = 0; i < size; i++) {
//            list[i] = Integer.parseInt(st.nextToken());
//        }
//        str = br.readLine();
//        st = new StringTokenizer(str, " ");
//        int[] calcul = new int[4];
//        calcul[0] = Integer.parseInt(st.nextToken());
//        calcul[1] = Integer.parseInt(st.nextToken());
//        calcul[2] = Integer.parseInt(st.nextToken());
//        calcul[3] = Integer.parseInt(st.nextToken());
//
//        Solution temp = new Solution();
//        int[] result = temp.solution(list, calcul);
//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int size = Integer.parseInt(str);
//        String[][] map = new String[size][size];
//        for (int i = 0; i < size; i++) {
//            str = br.readLine();
//            StringTokenizer st = new StringTokenizer(str, " ");
//            for (int j = 0; j < size; j++) {
//                map[i][j] = st.nextToken();
//            }
//        }
//        Solution temp = new Solution();
//        System.out.println(temp.solution(map, size));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Solution temp = new Solution();
        System.out.println(temp.solution(N, L, R, map));
    }
}

class Solution {

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int solution(int N, int L, int R, int[][] map) {

        int totalCount = 0;
        while (true) {
            int[][] visited = new int[N][N];

            int region = 0;
            for (int a = 0; a < N; a++) {
                for (int b = 0; b < N; b++) {
                    if (visited[a][b] == 0) {
                        ArrayDeque<int[]> q = new ArrayDeque<>();
                        q.addLast(new int[]{a, b});
                        while (!q.isEmpty()) {
                            int[] temp = q.removeFirst();
                            for (int i = 0; i < 4; i++) {
                                int nextX = temp[0] + dx[i];
                                int nextY = temp[1] + dy[i];
                                if (nextX > -1 && nextX < N && nextY > -1 && nextY < N) {
                                    if (visited[nextX][nextY] == 0) {
                                        int diff = Math.abs(map[temp[0]][temp[1]] - map[nextX][nextY]);
                                        if (diff >= L && diff <= R) {
                                            if (visited[temp[0]][temp[1]] == 0) {
                                                region++;
                                                visited[temp[0]][temp[1]] = region;
                                                visited[nextX][nextY] = region;
                                            } else {
                                                visited[nextX][nextY] = region;
                                            }
                                            q.addLast(new int[]{nextX, nextY});
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int flag = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (visited[i][j] > 0) {
                        flag = 1;
                    }
                }
            }
            if (flag == 0) break;
            totalCount++;

            for (int i = 1; i <= region; i++) {
                int sum = 0;
                int count = 0;
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        if (visited[j][k] == i) {
                            count++;
                            sum += map[j][k];
                        }
                    }
                }
                if (count > 0) {
                    int avg = (sum / count);
                    for (int j = 0; j < N; j++) {
                        for (int k = 0; k < N; k++) {
                            if (visited[j][k] == i) {
                                map[j][k] = avg;
                            }
                        }
                    }
                }
            }
        }
        return totalCount;
    }
}


//class Solution {
//    public String solution(String[][] map, int size) {
//        LinkedList<int[]> teacher = new LinkedList<>();
//        LinkedList<int[]> student = new LinkedList<>();
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                if (map[i][j].equals("T")) {
//                    teacher.add(new int[]{i, j});
//                }
//            }
//        }
//        String result = "NO";
//        result = findCombi(map, 0, teacher, result);
//        return result;
//    }
//
//    public String findCombi(String[][] map, int wall, LinkedList<int[]> teacher, String result) {
//        if (wall == 3) {
//            if (checkMap(map, teacher)) {
//                return "YES";
//            } else {
//                return "NO";
//            }
//        } else {
//            for (int i = 0; i < map.length; i++) {
//                for (int j = 0; j < map.length; j++) {
//                    if (map[i][j].equals("X")) {
//                        map[i][j] = "O";
//                        if (findCombi(map, wall + 1, teacher, result).equals("YES")) {
//                            return "YES";
//                        }
//
//                        map[i][j] = "X";
//                    }
//                }
//            }
//        }
//        return "NO";
//    }
//
//    int[] dx = {0, 0, 1, -1};
//    int[] dy = {1, -1, 0, 0};
//
//    public Boolean checkMap(String[][] map, LinkedList<int[]> teacher) {
//        for (int[] i : teacher) {
//            int x = i[0];
//            int y = i[1];
//            Boolean[] results = new Boolean[4];
//            for (int j = 0; j < 4; j++) {
//                results[j] = false;
//            }
//
//            while (!results[0]) {
//                x += dx[0];
//                y += dy[0];
//                if (x < 0 || x >= map.length || y < 0 || y >= map.length || map[x][y].equals("O")) results[0] = true;
//                else if (map[x][y].equals("S")) return false;
//            }
//
//            x = i[0];
//            y = i[1];
//            while (!results[1]) {
//                x += dx[1];
//                y += dy[1];
//                if (x < 0 || x >= map.length || y < 0 || y >= map.length || map[x][y].equals("O")) results[1] = true;
//                else if (map[x][y].equals("S")) return false;
//            }
//
//            x = i[0];
//            y = i[1];
//            while (!results[2]) {
//                x += dx[2];
//                y += dy[2];
//                if (x < 0 || x >= map.length || y < 0 || y >= map.length || map[x][y].equals("O")) results[2] = true;
//                else if (map[x][y].equals("S")) return false;
//            }
//
//            x = i[0];
//            y = i[1];
//            while (!results[3]) {
//                x += dx[3];
//                y += dy[3];
//                if (x < 0 || x >= map.length || y < 0 || y >= map.length || map[x][y].equals("O")) results[3] = true;
//                else if (map[x][y].equals("S")) return false;
//            }
//        }
//        return true;
//    }
//}

//class Solution {
//    public int[] solution(int[] list, int[] calcul) {
//        int[] result = new int[2];
//        LinkedList<Integer> resultList = new LinkedList<>();
//        findCombi(list, calcul, resultList, new LinkedList<Integer>());
//        resultList.sort((a,b)->a-b);
//        result[0] = resultList.getLast();
//        result[1] = resultList.getFirst();
//        return result;
//    }
//
//    public void findCombi(int[] list, int[] calcul, LinkedList<Integer> resultList, LinkedList<Integer> combi) {
//        if (combi.size() == list.length - 1) {
//            int tempResult = list[0];
//            for (int i = 0; i < combi.size(); i++) {
//                int temp = combi.get(i);
//                if (temp == 0) {
//                    tempResult += list[i + 1];
//                } else if (temp == 1) {
//                    tempResult -= list[i + 1];
//                } else if (temp == 2) {
//                    tempResult *= list[i + 1];
//                } else {
//                    tempResult /= list[i + 1];
//                }
//            }
//            resultList.add(tempResult);
//        } else {
//            for (int i = 0; i < calcul.length; i++) {
//                if (calcul[i] > 0) {
//                    calcul[i]--;
//                    combi.addLast(i);
//                    findCombi(list, calcul, resultList, combi);
//                    combi.removeLast();
//                    calcul[i]++;
//                }
//            }
//        }
//    }
//}
//class solution {
//    public String solution(String p) {
//        String result = makeWord(p);
//        return result;
//    }
//
//    String makeWord(String p) {
//        if (p.length() == 0) return "";
//        if (checkCorrect(p)) return p;
//        int k = 0;
//        for (int i = 1; i <= p.length(); i++) {
//            String temp = p.substring(0, i);
//            k = i;
//            if (checkBalance(temp)) {
//                break;
//            }
//        }
//        String left = p.substring(0, k);
//        String right = p.substring(k);
//        String rightResult = makeWord(right);
//        if (checkCorrect(left)) {
//            StringBuilder sb = new StringBuilder();
//            sb.append(left);
//            sb.append(rightResult);
//            return sb.toString();
//        } else {
//            StringBuilder sb = new StringBuilder();
//            sb.append("(");
//            sb.append(rightResult);
//            sb.append(")");
//            for (int j = 1; j < left.length() - 1; j++) {
//                char word = left.charAt(j);
//                if (word == '(') sb.append(")");
//                else sb.append("(");
//            }
//            return sb.toString();
//        }
//    }
//
//    Boolean checkBalance(String str) {
//        int left = 0;
//        int right = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char temp = str.charAt(i);
//            if (temp == '(') left++;
//            else right++;
//        }
//
//        return left == right;
//    }
//
//    Boolean checkCorrect(String str) {
//        int sum = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char temp = str.charAt(i);
//            if (temp == '(') sum++;
//            else sum--;
//            if (sum < 0) return false;
//        }
//        return true;
//    }
//}
