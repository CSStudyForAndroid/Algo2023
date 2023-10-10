package personal;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT0921P {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//
//        str = br.readLine();
//        st = new StringTokenizer(str, " ");
//        int[] list = new int[N];
//        for (int i = 0; i < N; i++) {
//            list[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Practice temp = new Practice();
//        System.out.println(temp.test(list, M, K));
//    }

    //    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int[][] array = new int[N][M];
//        for (int i = 0; i < N; i++) {
//            str = br.readLine();
//            st = new StringTokenizer(str, " ");
//            for (int j = 0; j < M; j++) {
//                array[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        Practice temp = new Practice();
//        System.out.println(temp.test(array));
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        Practice temp = new Practice();
//        System.out.println(temp.test(N, K));
//    }

    //    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        Practice temp = new Practice();
//        System.out.println(temp.test(str));
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] startingPoint = new int[3];
        for (int i = 0; i < 3; i++) {
            startingPoint[i] = Integer.parseInt(st.nextToken());
        }
        int[][] map = new int[X][Y];
        for (int i = 0; i < X; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < Y; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Practice temp = new Practice();
        System.out.println(temp.count(startingPoint, map));
    }
}

class Practice {

    int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    int[] dy = {0, 1, 0, -1};

    public int count(int[] startPoint, int[][] map) {
        int x = startPoint[0];
        int y = startPoint[1];
        int direc = startPoint[2];

        Boolean move = true;
        int count = 0;
        while (move) {
            move = false;
            count++;
            for (int i = 0; i < 4; i++) {
                map[x][y] = 1;
                direc--;
                if (direc < 0) direc = 3;
                int nextX = x + dx[direc];
                int nextY = y + dy[direc];
                if (checkLand(nextX, nextY, map)) {
                    map[nextX][nextY] = 1;
                    x = nextX;
                    y = nextY;
                    move = true;
                    break;
                }
            }
        }

        return count;
    }

    public Boolean checkLand(int x, int y, int[][] map) {
        if (map[x][y] == 0) {
            return true;
        }
        return false;
    }

//    int[][] steps = {{-2, -1}, {-2, 1}, {2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, -2}, {-1, 2}};
//
//    public int test(String loc) {
//        int x = loc.toCharArray()[0] - 'a';
//        int y = loc.toCharArray()[1] - '1';
////        int[] condi = {1, 2};
////        for (int i = 0; i < 2; i++) {
////            for (int j = 0; j < 2; j++) {
////                for (int k = 0; k < 2; k++) {
////                    if (x + condi[0] >= 0 && x + condi[0] < 8 && y + condi[1] >= 0 && y + condi[1] < 8) {
////                        count++;
////                    }
////                    condi[1] *= -1;
////                }
////                condi[0] *= -1;
////            }
////            condi = new int[]{2, 1};
////        }
//        int count = 0;
//        for (int i = 0; i < 8; i++) {
//            if (x + steps[i][0] > -1 && x + steps[i][0] < 8 && y + steps[i][1] > -1 && y + steps[i][1] < 8) {
//                count++;
//            }
//        }
//        return count;
//    }

//    public int test(int N, int K) {
//        int count = 0;
//        while (N != 1) {
//            if (N % K == 0) {
//                N /= K;
//            } else {
//                N -= 1;
//            }
//            count++;
//        }
//        return count;
//    }

//    public int test(int[][] array) {
//        int maxOfMins = 0;
//        for (int[] i : array) {
//            Arrays.sort(i);
//            maxOfMins = Math.max(maxOfMins, i[0]);
//        }
//        return maxOfMins;
//    }

//    public int test(int[] intarray, int m, int k) {
//        Arrays.sort(intarray);
//        int sum = 0;
//        int biggest = intarray[intarray.length - 1];
//        int nextBiggest = intarray[intarray.length - 2];
//        for (int i = 0; i < m; i++) {
//            if (i % k == 0 && i != 0) {
//                sum += nextBiggest;
//            } else {
//                sum += biggest;
//            }
//        }
//        return sum;
//    }
}
